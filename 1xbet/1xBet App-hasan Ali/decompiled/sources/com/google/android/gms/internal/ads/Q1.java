package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class Q1 implements InterfaceC1883zi, Yj {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11145k = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f11146l;

    /* renamed from: m, reason: collision with root package name */
    public long f11147m;

    /* renamed from: n, reason: collision with root package name */
    public Object f11148n;

    public /* synthetic */ Q1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b3  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1883zi, com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo11k(Object obj) {
        Bitmap bitmap;
        int i;
        switch (this.f11145k) {
            case 0:
                L1 l12 = (L1) obj;
                R1 r1 = (R1) this.f11148n;
                AbstractC1668us.F(r1.f11307h);
                AbstractC1044gv abstractC1044gv = l12.f10292a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC1044gv.size());
                int i5 = 0;
                C0954ev listIterator = abstractC1044gv.listIterator(0);
                while (listIterator.hasNext()) {
                    C1881zg c1881zg = (C1881zg) listIterator.next();
                    c1881zg.getClass();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = c1881zg.f16743a;
                    if (charSequence != null) {
                        bundle.putCharSequence(C1881zg.f16732p, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = AbstractC0665Pg.f11087a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            C1208kh[] c1208khArr = (C1208kh[]) spanned.getSpans(i5, spanned.length(), C1208kh.class);
                            int length = c1208khArr.length;
                            for (int i6 = i5; i6 < length; i6++) {
                                C1208kh c1208kh = c1208khArr[i6];
                                c1208kh.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(C1208kh.f14259c, c1208kh.f14261a);
                                bundle2.putInt(C1208kh.f14260d, c1208kh.f14262b);
                                arrayList2.add(AbstractC0665Pg.a(spanned, c1208kh, 1, bundle2));
                            }
                            for (C1702vh c1702vh : (C1702vh[]) spanned.getSpans(0, spanned.length(), C1702vh.class)) {
                                c1702vh.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(C1702vh.f16021d, c1702vh.f16023a);
                                bundle3.putInt(C1702vh.f16022e, c1702vh.f16024b);
                                bundle3.putInt(C1702vh.f, c1702vh.f16025c);
                                arrayList2.add(AbstractC0665Pg.a(spanned, c1702vh, 2, bundle3));
                            }
                            for (C0807bh c0807bh : (C0807bh[]) spanned.getSpans(0, spanned.length(), C0807bh.class)) {
                                arrayList2.add(AbstractC0665Pg.a(spanned, c0807bh, 3, null));
                            }
                            for (Fh fh : (Fh[]) spanned.getSpans(0, spanned.length(), Fh.class)) {
                                fh.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(Fh.f9085b, fh.f9086a);
                                arrayList2.add(AbstractC0665Pg.a(spanned, fh, 4, bundle4));
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(C1881zg.f16733q, arrayList2);
                            }
                            bundle.putSerializable(C1881zg.f16734r, c1881zg.f16744b);
                            bundle.putSerializable(C1881zg.f16735s, c1881zg.f16745c);
                            bundle.putFloat(C1881zg.f16737u, c1881zg.f16747e);
                            bundle.putInt(C1881zg.f16738v, c1881zg.f);
                            bundle.putInt(C1881zg.f16739w, c1881zg.f16748g);
                            bundle.putFloat(C1881zg.f16740x, c1881zg.f16749h);
                            bundle.putInt(C1881zg.f16741y, c1881zg.i);
                            bundle.putInt(C1881zg.f16742z, c1881zg.f16752l);
                            bundle.putFloat(C1881zg.f16725A, c1881zg.f16753m);
                            bundle.putFloat(C1881zg.f16726B, c1881zg.f16750j);
                            bundle.putFloat(C1881zg.f16727C, c1881zg.f16751k);
                            bundle.putBoolean(C1881zg.f16729E, false);
                            bundle.putInt(C1881zg.f16728D, -16777216);
                            bundle.putInt(C1881zg.f16730F, c1881zg.f16754n);
                            bundle.putFloat(C1881zg.f16731G, c1881zg.f16755o);
                            bitmap = c1881zg.f16746d;
                            if (bitmap == null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                i = 0;
                                AbstractC1668us.a0(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                                bundle.putByteArray(C1881zg.f16736t, byteArrayOutputStream.toByteArray());
                            } else {
                                i = 0;
                            }
                            arrayList.add(bundle);
                            i5 = i;
                        }
                    }
                    bundle.putSerializable(C1881zg.f16734r, c1881zg.f16744b);
                    bundle.putSerializable(C1881zg.f16735s, c1881zg.f16745c);
                    bundle.putFloat(C1881zg.f16737u, c1881zg.f16747e);
                    bundle.putInt(C1881zg.f16738v, c1881zg.f);
                    bundle.putInt(C1881zg.f16739w, c1881zg.f16748g);
                    bundle.putFloat(C1881zg.f16740x, c1881zg.f16749h);
                    bundle.putInt(C1881zg.f16741y, c1881zg.i);
                    bundle.putInt(C1881zg.f16742z, c1881zg.f16752l);
                    bundle.putFloat(C1881zg.f16725A, c1881zg.f16753m);
                    bundle.putFloat(C1881zg.f16726B, c1881zg.f16750j);
                    bundle.putFloat(C1881zg.f16727C, c1881zg.f16751k);
                    bundle.putBoolean(C1881zg.f16729E, false);
                    bundle.putInt(C1881zg.f16728D, -16777216);
                    bundle.putInt(C1881zg.f16730F, c1881zg.f16754n);
                    bundle.putFloat(C1881zg.f16731G, c1881zg.f16755o);
                    bitmap = c1881zg.f16746d;
                    if (bitmap == null) {
                    }
                    arrayList.add(bundle);
                    i5 = i;
                }
                int i7 = i5;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong("d", l12.f10294c);
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle5);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                int length2 = marshall.length;
                C1617tm c1617tm = r1.f11303c;
                c1617tm.h(length2, marshall);
                r1.f11301a.c(length2, c1617tm);
                long j5 = l12.f10293b;
                long j6 = this.f11147m;
                if (j5 == -9223372036854775807L) {
                    AbstractC1668us.a0(r1.f11307h.f14909r == Long.MAX_VALUE ? 1 : i7);
                } else {
                    long j7 = r1.f11307h.f14909r;
                    j6 = j7 == Long.MAX_VALUE ? j6 + j5 : j5 + j7;
                }
                r1.f11301a.d(j6, this.f11146l, length2, 0, null);
                break;
            default:
                ((PE) obj).b((OE) this.f11148n, this.f11146l, this.f11147m);
                break;
        }
    }

    public /* synthetic */ Q1(R1 r1, long j5, int i) {
        this.f11148n = r1;
        this.f11147m = j5;
        this.f11146l = i;
    }

    public /* synthetic */ Q1(OE oe, int i, long j5, long j6) {
        this.f11148n = oe;
        this.f11146l = i;
        this.f11147m = j5;
    }
}
