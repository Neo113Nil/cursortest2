package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public abstract class RecipientId implements org.bouncycastle.util.Selector {
    public static final int kek = 1;
    public static final int keyAgree = 2;
    public static final int keyTrans = 0;
    public static final int password = 3;
    private final int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.util.Selector
    public abstract java.lang.Object clone();

    public int getType() {
        return this.getHighSpeedVideoSizes;
    }

    protected RecipientId(int i) {
        this.getHighSpeedVideoSizes = i;
    }
}
