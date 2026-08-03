package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class PS {

    @javax.annotation.Nullable
    public android.database.DataSetObserver A00;
    public final android.database.DataSetObservable A01 = new android.database.DataSetObservable();

    public abstract int A01();

    public abstract int A02(java.lang.Object obj);

    public abstract java.lang.Object A04(android.view.ViewGroup viewGroup, int i);

    public abstract void A07(android.view.ViewGroup viewGroup, int i, java.lang.Object obj);

    public abstract boolean A08(android.view.View view, java.lang.Object obj);

    public final float A00(int i) {
        return 1.0f;
    }

    @javax.annotation.Nullable
    public final android.os.Parcelable A03() {
        return null;
    }

    public final void A05() {
        synchronized (this) {
            if (this.A00 != null) {
                this.A00.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public final void A06(android.database.DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.A00 = dataSetObserver;
        }
    }
}
