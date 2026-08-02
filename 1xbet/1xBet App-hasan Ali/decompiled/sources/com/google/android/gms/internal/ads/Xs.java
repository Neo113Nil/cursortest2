package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class Xs extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C0905dr f12250a;

    /* renamed from: b, reason: collision with root package name */
    public final Er f12251b;

    public Xs(Er er) {
        this.f12251b = er;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C0905dr c0905dr = this.f12250a;
        if (c0905dr != null) {
            c0905dr.f13188n = null;
            Xs xs = (Xs) ((ArrayDeque) c0905dr.f13187m).poll();
            c0905dr.f13188n = xs;
            if (xs != null) {
                xs.executeOnExecutor((ThreadPoolExecutor) c0905dr.f13186l, new Object[0]);
            }
        }
    }
}
