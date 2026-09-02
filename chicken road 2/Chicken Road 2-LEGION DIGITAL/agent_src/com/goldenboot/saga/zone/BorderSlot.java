package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/goldenboot/saga/zone/KeyboardVersion;", "spanStyle", "Lcom/goldenboot/saga/zone/IconUpgrade;", "paragraphStyle", "Lcom/goldenboot/saga/zone/ToolbarBatch;", "evictLayout", "(Lcom/goldenboot/saga/zone/KeyboardVersion;Lcom/goldenboot/saga/zone/IconUpgrade;)Lcom/goldenboot/saga/zone/ToolbarBatch;", "start", "stop", "", "fraction", "growPayload", "(Lcom/goldenboot/saga/zone/IconUpgrade;Lcom/goldenboot/saga/zone/IconUpgrade;F)Lcom/goldenboot/saga/zone/IconUpgrade;", "injectMetric", "(Lcom/goldenboot/saga/zone/KeyboardVersion;Lcom/goldenboot/saga/zone/KeyboardVersion;F)Lcom/goldenboot/saga/zone/KeyboardVersion;", "", "Z", "DefaultIncludeFontPadding", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderSlot {
    public static final boolean evictLayout = false;

    public static final PlatformTextStyle evictLayout(KeyboardVersion keyboardVersion, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(keyboardVersion, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle growPayload(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((HoverCurator) AnimInterpreter.detachStream(HoverCurator.detachStream(platformParagraphStyle.getEmojiSupportMatch()), HoverCurator.detachStream(platformParagraphStyle2.getEmojiSupportMatch()), f)).getValue(), ((Boolean) AnimInterpreter.detachStream(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), (DefaultConstructorMarker) null);
    }

    public static final KeyboardVersion injectMetric(KeyboardVersion keyboardVersion, KeyboardVersion keyboardVersion2, float f) {
        return keyboardVersion;
    }
}
