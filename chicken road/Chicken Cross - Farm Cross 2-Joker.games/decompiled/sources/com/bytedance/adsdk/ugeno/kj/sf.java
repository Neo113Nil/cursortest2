package com.bytedance.adsdk.ugeno.kj;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class sf {
    private final DataSetObservable pcc = new DataSetObservable();
    private DataSetObserver sf;

    public float pcc(int i) {
        return 1.0f;
    }

    public abstract int pcc();

    public int pcc(Object obj) {
        return -1;
    }

    public abstract boolean pcc(View view, Object obj);

    public Parcelable sf() {
        return null;
    }

    public Object pcc(ViewGroup viewGroup, int i) {
        return pcc((View) viewGroup, i);
    }

    public void pcc(ViewGroup viewGroup, int i, Object obj) {
        pcc((View) viewGroup, i, obj);
    }

    @Deprecated
    public Object pcc(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void pcc(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void gm() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.sf;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.pcc.notifyChanged();
    }

    void pcc(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.sf = dataSetObserver;
        }
    }
}
