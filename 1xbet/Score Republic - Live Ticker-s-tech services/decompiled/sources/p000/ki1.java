package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ki1 {

    /* JADX INFO: renamed from: c */
    public Interpolator f4392c;

    /* JADX INFO: renamed from: d */
    public li1 f4393d;

    /* JADX INFO: renamed from: e */
    public boolean f4394e;

    /* JADX INFO: renamed from: b */
    public long f4391b = -1;

    /* JADX INFO: renamed from: f */
    public final wd1 f4395f = new wd1(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f4390a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m3045a() {
        if (this.f4394e) {
            ArrayList arrayList = this.f4390a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ji1) obj).m2913b();
            }
            this.f4394e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3046b() {
        View view;
        if (this.f4394e) {
            return;
        }
        ArrayList arrayList = this.f4390a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ji1 ji1Var = (ji1) obj;
            long j = this.f4391b;
            if (j >= 0) {
                ji1Var.m2914c(j);
            }
            Interpolator interpolator = this.f4392c;
            if (interpolator != null && (view = (View) ji1Var.f3944a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f4393d != null) {
                ji1Var.m2915d(this.f4395f);
            }
            View view2 = (View) ji1Var.f3944a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4394e = true;
    }
}
