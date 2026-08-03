package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Qg {
    public static com.inmobi.media.Pg a(java.lang.String content, java.lang.String markupType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markupType, "markupType");
        int hashCode = markupType.hashCode();
        if (hashCode != -1084172778) {
            if (hashCode != 3213227) {
                if (hashCode == 1236050372 && markupType.equals("htmlUrl")) {
                    return new com.inmobi.media.Z7(content);
                }
            } else if (markupType.equals("html")) {
                return new com.inmobi.media.Y7(content);
            }
        } else if (markupType.equals("inmobiJson")) {
            return new com.inmobi.media.C2743s9(content);
        }
        throw new java.lang.IllegalArgumentException("Unsupported markup type: " + markupType);
    }
}
