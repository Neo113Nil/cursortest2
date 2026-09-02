package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class PipelineLatch {
    public final ConstraintLayout evictLayout;
    public androidx.constraintlayout.widget.LayerUseCase growPayload;
    public int injectMetric = -1;
    public int detachStream = -1;
    public SparseArray releaseHeader = new SparseArray();
    public SparseArray clipOrigin = new SparseArray();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator {
        public androidx.constraintlayout.widget.LayerUseCase detachStream;
        public int evictLayout;
        public ArrayList growPayload = new ArrayList();
        public int injectMetric;

        public ActivityMutator(Context context, XmlPullParser xmlPullParser) {
            this.injectMetric = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), ColorChunk.disconnectFormat);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ColorChunk.decodeDigest) {
                    this.evictLayout = obtainStyledAttributes.getResourceId(index, this.evictLayout);
                } else if (index == ColorChunk.saveDestination) {
                    this.injectMetric = obtainStyledAttributes.getResourceId(index, this.injectMetric);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.injectMetric);
                    context.getResources().getResourceName(this.injectMetric);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.LayerUseCase layerUseCase = new androidx.constraintlayout.widget.LayerUseCase();
                        this.detachStream = layerUseCase;
                        layerUseCase.releaseHeader(context, this.injectMetric);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void evictLayout(BounceHandler bounceHandler) {
            this.growPayload.add(bounceHandler);
        }

        public int growPayload(float f, float f2) {
            for (int i = 0; i < this.growPayload.size(); i++) {
                if (((BounceHandler) this.growPayload.get(i)).evictLayout(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler {
        public androidx.constraintlayout.widget.LayerUseCase clipOrigin;
        public float detachStream;
        public float evictLayout;
        public float growPayload;
        public float injectMetric;
        public int releaseHeader;

        public BounceHandler(Context context, XmlPullParser xmlPullParser) {
            this.evictLayout = Float.NaN;
            this.growPayload = Float.NaN;
            this.injectMetric = Float.NaN;
            this.detachStream = Float.NaN;
            this.releaseHeader = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), ColorChunk.peekPattern);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ColorChunk.closeEdge) {
                    this.releaseHeader = obtainStyledAttributes.getResourceId(index, this.releaseHeader);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.releaseHeader);
                    context.getResources().getResourceName(this.releaseHeader);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.LayerUseCase layerUseCase = new androidx.constraintlayout.widget.LayerUseCase();
                        this.clipOrigin = layerUseCase;
                        layerUseCase.releaseHeader(context, this.releaseHeader);
                    }
                } else if (index == ColorChunk.renderModel) {
                    this.detachStream = obtainStyledAttributes.getDimension(index, this.detachStream);
                } else if (index == ColorChunk.compressStrategy) {
                    this.growPayload = obtainStyledAttributes.getDimension(index, this.growPayload);
                } else if (index == ColorChunk.collectBounds) {
                    this.injectMetric = obtainStyledAttributes.getDimension(index, this.injectMetric);
                } else if (index == ColorChunk.createEndpoint) {
                    this.evictLayout = obtainStyledAttributes.getDimension(index, this.evictLayout);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean evictLayout(float f, float f2) {
            if (!Float.isNaN(this.evictLayout) && f < this.evictLayout) {
                return false;
            }
            if (!Float.isNaN(this.growPayload) && f2 < this.growPayload) {
                return false;
            }
            if (Float.isNaN(this.injectMetric) || f <= this.injectMetric) {
                return Float.isNaN(this.detachStream) || f2 <= this.detachStream;
            }
            return false;
        }
    }

    public PipelineLatch(Context context, ConstraintLayout constraintLayout, int i) {
        this.evictLayout = constraintLayout;
        evictLayout(context, i);
    }

    public void detachStream(int i, float f, float f2) {
        int growPayload;
        int i2 = this.injectMetric;
        if (i2 != i) {
            this.injectMetric = i;
            ActivityMutator activityMutator = (ActivityMutator) this.releaseHeader.get(i);
            int growPayload2 = activityMutator.growPayload(f, f2);
            androidx.constraintlayout.widget.LayerUseCase layerUseCase = growPayload2 == -1 ? activityMutator.detachStream : ((BounceHandler) activityMutator.growPayload.get(growPayload2)).clipOrigin;
            if (growPayload2 != -1) {
                int i3 = ((BounceHandler) activityMutator.growPayload.get(growPayload2)).releaseHeader;
            }
            if (layerUseCase == null) {
                return;
            }
            this.detachStream = growPayload2;
            layerUseCase.injectMetric(this.evictLayout);
            return;
        }
        ActivityMutator activityMutator2 = i == -1 ? (ActivityMutator) this.releaseHeader.valueAt(0) : (ActivityMutator) this.releaseHeader.get(i2);
        int i4 = this.detachStream;
        if ((i4 == -1 || !((BounceHandler) activityMutator2.growPayload.get(i4)).evictLayout(f, f2)) && this.detachStream != (growPayload = activityMutator2.growPayload(f, f2))) {
            androidx.constraintlayout.widget.LayerUseCase layerUseCase2 = growPayload == -1 ? this.growPayload : ((BounceHandler) activityMutator2.growPayload.get(growPayload)).clipOrigin;
            if (growPayload != -1) {
                int i5 = ((BounceHandler) activityMutator2.growPayload.get(growPayload)).releaseHeader;
            }
            if (layerUseCase2 == null) {
                return;
            }
            this.detachStream = growPayload;
            layerUseCase2.injectMetric(this.evictLayout);
        }
    }

    public final void evictLayout(Context context, int i) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            ActivityMutator activityMutator = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                growPayload(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                ActivityMutator activityMutator2 = new ActivityMutator(context, xml);
                                this.releaseHeader.put(activityMutator2.evictLayout, activityMutator2);
                                activityMutator = activityMutator2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                BounceHandler bounceHandler = new BounceHandler(context, xml);
                                if (activityMutator != null) {
                                    activityMutator.evictLayout(bounceHandler);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void growPayload(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.LayerUseCase layerUseCase = new androidx.constraintlayout.widget.LayerUseCase();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                layerUseCase.connectJob(context, xmlPullParser);
                this.clipOrigin.put(identifier, layerUseCase);
                return;
            }
        }
    }

    public void injectMetric(SubscriberRouter subscriberRouter) {
    }
}
