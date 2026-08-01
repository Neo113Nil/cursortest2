package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.ui.SpannedToHtmlConverter;
import androidx.media3.ui.SubtitleView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    public void destroy() {
        this.webView.destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (r5 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014a, code lost:
    
        r11 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        r20 = r11;
        r18 = com.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_TOP_KEY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0148, code lost:
    
        if (r5 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateWebView() {
        String formatInvariant;
        int i;
        String str;
        boolean z;
        String str2;
        int i2;
        String str3;
        Object obj;
        Object obj2;
        StringBuilder sb = new StringBuilder();
        sb.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", HtmlUtils.toCssRgba(this.style.foregroundColor), convertTextSizeToCss(this.defaultTextSizeType, this.defaultTextSize), Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(this.style)));
        HashMap hashMap = new HashMap();
        hashMap.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(this.style.backgroundColor)));
        for (int i3 = 0; i3 < this.textCues.size(); i3++) {
            Cue cue = this.textCues.get(i3);
            float f = cue.position != -3.4028235E38f ? cue.position * 100.0f : 50.0f;
            int anchorTypeToTranslatePercent = anchorTypeToTranslatePercent(cue.positionAnchor);
            if (cue.line != -3.4028235E38f) {
                if (cue.lineType != 1) {
                    formatInvariant = Util.formatInvariant("%.2f%%", Float.valueOf(cue.line * 100.0f));
                    if (cue.verticalType == 1) {
                        i = -anchorTypeToTranslatePercent(cue.lineAnchor);
                    } else {
                        i = anchorTypeToTranslatePercent(cue.lineAnchor);
                    }
                } else {
                    if (cue.line >= 0.0f) {
                        str = Util.formatInvariant("%.2fem", Float.valueOf(cue.line * CSS_LINE_HEIGHT));
                        z = false;
                    } else {
                        z = true;
                        str = Util.formatInvariant("%.2fem", Float.valueOf(((-cue.line) - 1.0f) * CSS_LINE_HEIGHT));
                    }
                    i = 0;
                    if (cue.size == -3.4028235E38f) {
                        str2 = Util.formatInvariant("%.2f%%", Float.valueOf(cue.size * 100.0f));
                    } else {
                        str2 = "fit-content";
                    }
                    String str4 = str2;
                    String convertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                    String convertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                    String convertTextSizeToCss = convertTextSizeToCss(cue.textSizeType, cue.textSize);
                    String cssRgba = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : this.style.windowColor);
                    i2 = cue.verticalType;
                    String str5 = "right";
                    String str6 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
                    if (i2 == 1) {
                        if (i2 != 2) {
                            if (z) {
                                str6 = "bottom";
                            }
                            obj = "left";
                            str3 = str6;
                        }
                    }
                    if (cue.verticalType != 2 || cue.verticalType == 1) {
                        obj2 = "height";
                        int i4 = i;
                        i = anchorTypeToTranslatePercent;
                        anchorTypeToTranslatePercent = i4;
                    } else {
                        obj2 = "width";
                    }
                    SpannedToHtmlConverter.HtmlAndCss convert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                    for (String str7 : hashMap.keySet()) {
                        String str8 = (String) hashMap.put(str7, (String) hashMap.get(str7));
                        Assertions.checkState(str8 == null || str8.equals(hashMap.get(str7)));
                    }
                    sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f), str3, str, obj2, str4, convertAlignmentToCss, convertVerticalTypeToCss, convertTextSizeToCss, cssRgba, Integer.valueOf(anchorTypeToTranslatePercent), Integer.valueOf(i), getBlockShearTransformFunction(cue))).append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                    if (cue.multiRowAlignment == null) {
                        sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(cue.multiRowAlignment))).append(convert.html).append("</span>");
                    } else {
                        sb.append(convert.html);
                    }
                    sb.append("</span></div>");
                }
            } else {
                formatInvariant = Util.formatInvariant("%.2f%%", Float.valueOf((1.0f - this.bottomPaddingFraction) * 100.0f));
                i = -100;
            }
            str = formatInvariant;
            z = false;
            if (cue.size == -3.4028235E38f) {
            }
            String str42 = str2;
            String convertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String convertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String convertTextSizeToCss2 = convertTextSizeToCss(cue.textSizeType, cue.textSize);
            String cssRgba2 = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : this.style.windowColor);
            i2 = cue.verticalType;
            String str52 = "right";
            String str62 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
            if (i2 == 1) {
            }
            if (cue.verticalType != 2) {
            }
            obj2 = "height";
            int i42 = i;
            i = anchorTypeToTranslatePercent;
            anchorTypeToTranslatePercent = i42;
            SpannedToHtmlConverter.HtmlAndCss convert2 = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
            }
            sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f), str3, str, obj2, str42, convertAlignmentToCss2, convertVerticalTypeToCss2, convertTextSizeToCss2, cssRgba2, Integer.valueOf(anchorTypeToTranslatePercent), Integer.valueOf(i), getBlockShearTransformFunction(cue))).append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            if (cue.multiRowAlignment == null) {
            }
            sb.append("</span></div>");
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder("<html><head><style>");
        for (String str9 : hashMap.keySet()) {
            sb2.append(str9).append("{").append((String) hashMap.get(str9)).append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(Charsets.UTF_8), 1), "text/html", "base64");
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        String str;
        if (cue.shearDegrees != 0.0f) {
            if (cue.verticalType == 2 || cue.verticalType == 1) {
                str = "skewY";
            } else {
                str = "skewX";
            }
            return Util.formatInvariant("%s(%.2fdeg)", str, Float.valueOf(cue.shearDegrees));
        }
        return "";
    }

    private String convertTextSizeToCss(int i, float f) {
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (resolveTextSize == -3.4028235E38f) {
            return "unset";
        }
        return Util.formatInvariant("%.2fpx", Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 3) {
            return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 4) {
            return Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return "unset";
    }

    private static String convertVerticalTypeToCss(int i) {
        if (i == 1) {
            return "vertical-rl";
        }
        if (i == 2) {
            return "vertical-lr";
        }
        return "horizontal-tb";
    }

    private static String convertAlignmentToCss(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i == 1) {
            return "start";
        }
        if (i != 2) {
            return "center";
        }
        return "end";
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
