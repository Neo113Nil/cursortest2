package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.compose.runtime.changelist.d;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.G;
import com.google.common.collect.i0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@Deprecated
/* loaded from: classes4.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    @Nullable
    public static MotionPhotoDescription parse(String str) throws IOException {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    private static MotionPhotoDescription parseInternal(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!XmlPullParserUtil.isStartTag(newPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        G.b bVar = G.b;
        G<MotionPhotoDescription.ContainerItem> g = i0.e;
        long j = -9223372036854775807L;
        while (true) {
            newPullParser.next();
            if (XmlPullParserUtil.isStartTag(newPullParser, "rdf:Description")) {
                if (!parseMotionPhotoFlagFromDescription(newPullParser)) {
                    break;
                }
                j = parseMotionPhotoPresentationTimestampUsFromDescription(newPullParser);
                g = parseMicroVideoOffsetFromDescription(newPullParser);
            } else if (XmlPullParserUtil.isStartTag(newPullParser, "Container:Directory")) {
                g = parseMotionPhotoV1Directory(newPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.isStartTag(newPullParser, "GContainer:Directory")) {
                g = parseMotionPhotoV1Directory(newPullParser, "GContainer", "GContainerItem");
            }
            if (XmlPullParserUtil.isEndTag(newPullParser, "x:xmpmeta")) {
                if (!g.isEmpty()) {
                    return new MotionPhotoDescription(j, g);
                }
            }
        }
        return null;
    }

    private static G<MotionPhotoDescription.ContainerItem> parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return G.o(new MotionPhotoDescription.ContainerItem("image/jpeg", "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        G.b bVar = G.b;
        return i0.e;
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long parseLong = Long.parseLong(attributeValue);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static G<MotionPhotoDescription.ContainerItem> parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        G.b bVar = G.b;
        G.a aVar = new G.a();
        String b = d.b(str, ":Item");
        String b2 = d.b(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, b)) {
                String b3 = d.b(str2, ":Mime");
                String b4 = d.b(str2, ":Semantic");
                String b5 = d.b(str2, ":Length");
                String b6 = d.b(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, b3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, b4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, b5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, b6);
                if (attributeValue == null || attributeValue2 == null) {
                    return i0.e;
                }
                aVar.c(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, b2));
        return aVar.g();
    }
}
