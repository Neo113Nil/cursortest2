package Z2;

import A0.J0;
import J2.n;
import U2.j;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.N8;
import com.google.android.gms.internal.ads.U8;
import e2.C1930k;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public boolean f6340k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView.ScaleType f6341l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6342m;

    /* renamed from: n, reason: collision with root package name */
    public C1930k f6343n;

    /* renamed from: o, reason: collision with root package name */
    public J0 f6344o;

    public final synchronized void a(J0 j02) {
        this.f6344o = j02;
        if (this.f6342m) {
            ImageView.ScaleType scaleType = this.f6341l;
            N8 n8 = ((e) j02.f304k).f6353l;
            if (n8 != null && scaleType != null) {
                try {
                    n8.g1(new BinderC2361b(scaleType));
                } catch (RemoteException e3) {
                    j.g("Unable to call setMediaViewImageScaleType on delegate", e3);
                }
            }
        }
    }

    public n getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        N8 n8;
        this.f6342m = true;
        this.f6341l = scaleType;
        J0 j02 = this.f6344o;
        if (j02 == null || (n8 = ((e) j02.f304k).f6353l) == null || scaleType == null) {
            return;
        }
        try {
            n8.g1(new BinderC2361b(scaleType));
        } catch (RemoteException e3) {
            j.g("Unable to call setMediaViewImageScaleType on delegate", e3);
        }
    }

    public void setMediaContent(n nVar) {
        boolean O5;
        N8 n8;
        this.f6340k = true;
        C1930k c1930k = this.f6343n;
        if (c1930k != null && (n8 = ((e) c1930k.f16910l).f6353l) != null) {
            try {
                n8.K0(null);
            } catch (RemoteException e3) {
                j.g("Unable to call setMediaContent on delegate", e3);
            }
        }
        if (nVar == null) {
            return;
        }
        try {
            U8 a5 = nVar.a();
            if (a5 != null) {
                if (!nVar.e()) {
                    if (nVar.d()) {
                        O5 = a5.O(new BinderC2361b(this));
                    }
                    removeAllViews();
                }
                O5 = a5.T(new BinderC2361b(this));
                if (O5) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e5) {
            removeAllViews();
            j.g("", e5);
        }
    }
}
