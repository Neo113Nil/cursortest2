package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Ls {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f10551b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10552a = new ArrayList();

    public final void a(View view, Bs bs) {
        Ks ks;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f10551b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f10552a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ks = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            ks = (Ks) obj;
            if (ks.f10274a.get() == view) {
                break;
            }
        }
        if (ks == null) {
            arrayList.add(new Ks(view, bs));
        }
    }
}
