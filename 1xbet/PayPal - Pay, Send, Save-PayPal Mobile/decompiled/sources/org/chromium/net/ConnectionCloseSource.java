package org.chromium.net;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface ConnectionCloseSource {
    public static final int PEER = 1;
    public static final int SELF = 2;
    public static final int UNKNOWN = 0;
}
