package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Zh {
    public static Yh a(String content, String markupType) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        int hashCode = markupType.hashCode();
        if (hashCode != -1084172778) {
            if (hashCode != 3213227) {
                if (hashCode == 1236050372 && markupType.equals("htmlUrl")) {
                    return new C4264z8(content);
                }
            } else if (markupType.equals("html")) {
                return new C4236y8(content);
            }
        } else if (markupType.equals("inmobiJson")) {
            return new X9(content);
        }
        throw new IllegalArgumentException("Unsupported markup type: " + markupType);
    }
}
