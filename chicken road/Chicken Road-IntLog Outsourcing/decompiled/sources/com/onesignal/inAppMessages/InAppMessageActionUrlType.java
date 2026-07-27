package com.onesignal.inAppMessages;

import B4.r;
import kotlin.jvm.internal.e;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class InAppMessageActionUrlType {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ InAppMessageActionUrlType[] $VALUES;
    public static final Companion Companion;
    private final String text;
    public static final InAppMessageActionUrlType IN_APP_WEBVIEW = new InAppMessageActionUrlType("IN_APP_WEBVIEW", 0, "webview");
    public static final InAppMessageActionUrlType BROWSER = new InAppMessageActionUrlType("BROWSER", 1, "browser");
    public static final InAppMessageActionUrlType REPLACE_CONTENT = new InAppMessageActionUrlType("REPLACE_CONTENT", 2, "replacement");

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final InAppMessageActionUrlType fromString(String str) {
            for (InAppMessageActionUrlType inAppMessageActionUrlType : InAppMessageActionUrlType.values()) {
                if (r.I(inAppMessageActionUrlType.text, str)) {
                    return inAppMessageActionUrlType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InAppMessageActionUrlType[] $values() {
        return new InAppMessageActionUrlType[]{IN_APP_WEBVIEW, BROWSER, REPLACE_CONTENT};
    }

    static {
        InAppMessageActionUrlType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private InAppMessageActionUrlType(String str, int i2, String str2) {
        this.text = str2;
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static InAppMessageActionUrlType valueOf(String str) {
        return (InAppMessageActionUrlType) Enum.valueOf(InAppMessageActionUrlType.class, str);
    }

    public static InAppMessageActionUrlType[] values() {
        return (InAppMessageActionUrlType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
