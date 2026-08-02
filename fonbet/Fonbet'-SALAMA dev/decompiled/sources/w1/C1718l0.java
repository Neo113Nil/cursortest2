package w1;

import C0.C0091j;
import F2.C0254t;
import F2.InterfaceC0217a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.api.internal.InterfaceC0842t;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdcp;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.components.ComponentRegistrar;
import e2.InterfaceC1014k;
import g4.C1128a;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.Mac;
import p3.InterfaceC1536b;
import p3.InterfaceC1537c;
import w1.C1718l0;
import w1.V0;

/* renamed from: w1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1718l0 implements W3.j, m.w, InterfaceC0842t, InterfaceC1014k, androidx.lifecycle.V, q4.g, InterfaceC1537c, Y0, Z0, V.j {

    /* renamed from: b, reason: collision with root package name */
    public static C1718l0 f17768b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17769a;

    public /* synthetic */ C1718l0(int i7) {
        this.f17769a = i7;
    }

    public static Path j(float f7, float f8, float f9, float f10) {
        Path path = new Path();
        path.moveTo(f7, f8);
        path.lineTo(f9, f10);
        return path;
    }

    public static void m(A5.f fVar, final C1718l0 c1718l0) {
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", new A5.x(), obj, 1);
        if (c1718l0 != null) {
            final int i7 = 0;
            f02.M(new A5.b(c1718l0) { // from class: E5.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1718l0 f2415b;

                {
                    this.f2415b = c1718l0;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            String str2 = (String) arrayList2.get(1);
                            String str3 = (String) arrayList2.get(2);
                            this.f2415b.getClass();
                            f4.w wVar = (f4.w) C0196n.f2390a.get(str);
                            if (str2 != null && str3 != null) {
                                arrayList.add(0, wVar.a(str2, str3));
                                v02.f(arrayList);
                                break;
                            } else {
                                FirebaseAuth firebaseAuth = wVar.f12984g;
                                FirebaseUser firebaseUser = firebaseAuth.f11854f;
                                com.google.android.gms.common.internal.D.j(firebaseUser, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
                                String str4 = ((zzad) firebaseUser).f11909b.f11944f;
                                com.google.android.gms.common.internal.D.f(str4, "Email cannot be empty, since verified email is required to use MFA.");
                                Y3.i iVar = firebaseAuth.f11849a;
                                iVar.b();
                                arrayList.add(0, wVar.a(str4, iVar.f7664b));
                                v02.f(arrayList);
                                break;
                            }
                        default:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str5 = (String) arrayList4.get(0);
                            String str6 = (String) arrayList4.get(1);
                            this.f2415b.getClass();
                            f4.w wVar2 = (f4.w) C0196n.f2390a.get(str5);
                            wVar2.getClass();
                            com.google.android.gms.common.internal.D.f(str6, "qrCodeUrl cannot be empty.");
                            try {
                                Y3.i iVar2 = wVar2.f12984g.f11849a;
                                iVar2.b();
                                iVar2.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)).addFlags(268435456));
                            } catch (ActivityNotFoundException unused) {
                                Y3.i iVar3 = wVar2.f12984g.f11849a;
                                iVar3.b();
                                iVar3.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=otpauth&c=apps")).addFlags(268435456));
                            }
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", new A5.x(), obj, 1);
        if (c1718l0 == null) {
            f03.M(null);
        } else {
            final int i8 = 1;
            f03.M(new A5.b(c1718l0) { // from class: E5.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1718l0 f2415b;

                {
                    this.f2415b = c1718l0;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            String str2 = (String) arrayList2.get(1);
                            String str3 = (String) arrayList2.get(2);
                            this.f2415b.getClass();
                            f4.w wVar = (f4.w) C0196n.f2390a.get(str);
                            if (str2 != null && str3 != null) {
                                arrayList.add(0, wVar.a(str2, str3));
                                v02.f(arrayList);
                                break;
                            } else {
                                FirebaseAuth firebaseAuth = wVar.f12984g;
                                FirebaseUser firebaseUser = firebaseAuth.f11854f;
                                com.google.android.gms.common.internal.D.j(firebaseUser, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
                                String str4 = ((zzad) firebaseUser).f11909b.f11944f;
                                com.google.android.gms.common.internal.D.f(str4, "Email cannot be empty, since verified email is required to use MFA.");
                                Y3.i iVar = firebaseAuth.f11849a;
                                iVar.b();
                                arrayList.add(0, wVar.a(str4, iVar.f7664b));
                                v02.f(arrayList);
                                break;
                            }
                        default:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str5 = (String) arrayList4.get(0);
                            String str6 = (String) arrayList4.get(1);
                            this.f2415b.getClass();
                            f4.w wVar2 = (f4.w) C0196n.f2390a.get(str5);
                            wVar2.getClass();
                            com.google.android.gms.common.internal.D.f(str6, "qrCodeUrl cannot be empty.");
                            try {
                                Y3.i iVar2 = wVar2.f12984g.f11849a;
                                iVar2.b();
                                iVar2.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)).addFlags(268435456));
                            } catch (ActivityNotFoundException unused) {
                                Y3.i iVar3 = wVar2.f12984g.f11849a;
                                iVar3.b();
                                iVar3.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=otpauth&c=apps")).addFlags(268435456));
                            }
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            break;
                    }
                }
            });
        }
    }

    public static final void o(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z4, zzdqq zzdqqVar) {
        if (adOverlayInfoParcel.f10801B == 4 && adOverlayInfoParcel.f10817c == null) {
            InterfaceC0217a interfaceC0217a = adOverlayInfoParcel.f10816b;
            if (interfaceC0217a != null) {
                interfaceC0217a.onAdClicked();
            }
            zzdcp zzdcpVar = adOverlayInfoParcel.f10811L;
            if (zzdcpVar != null) {
                zzdcpVar.zzdd();
            }
            Activity zzi = adOverlayInfoParcel.f10818d.zzi();
            zzc zzcVar = adOverlayInfoParcel.f10815a;
            Context context2 = (zzcVar == null || !zzcVar.f10824A || zzi == null) ? context : zzi;
            B4.V v6 = E2.o.f1952C.f1955a;
            B4.V.v(context2, zzcVar, adOverlayInfoParcel.f10823z, zzcVar != null ? zzcVar.f10833z : null, zzdqqVar, adOverlayInfoParcel.f10807H);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f10803D.f10837d);
        intent.putExtra("shouldCallOnOverlayOpened", z4);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmZ)).booleanValue()) {
            I2.P p5 = E2.o.f1952C.f1957c;
            I2.P.r(context, intent, zzdqqVar, adOverlayInfoParcel.f10807H);
        } else {
            I2.P p7 = E2.o.f1952C.f1957c;
            I2.P.p(context, intent);
        }
    }

    @Override // androidx.lifecycle.V
    public androidx.lifecycle.S b(Class cls) {
        return new n0.c();
    }

    @Override // e2.InterfaceC1014k
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // p3.InterfaceC1537c
    public C0091j e(Context context, String str, InterfaceC1536b interfaceC1536b) {
        int f7;
        C0091j c0091j = new C0091j();
        int k7 = interfaceC1536b.k(context, str);
        c0091j.f1289a = k7;
        int i7 = 1;
        int i8 = 0;
        if (k7 != 0) {
            f7 = interfaceC1536b.f(context, str, false);
            c0091j.f1290b = f7;
        } else {
            f7 = interfaceC1536b.f(context, str, true);
            c0091j.f1290b = f7;
        }
        int i9 = c0091j.f1289a;
        if (i9 != 0) {
            i8 = i9;
        } else if (f7 == 0) {
            i7 = 0;
            c0091j.f1291c = i7;
            return c0091j;
        }
        if (i8 >= f7) {
            i7 = -1;
        }
        c0091j.f1291c = i7;
        return c0091j;
    }

    @Override // e2.InterfaceC1014k
    public long f() {
        throw new NoSuchElementException();
    }

    @Override // w1.Z0
    public Y0 g(int i7) {
        return new C1719l1(new C1722m0(27));
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        byte[] bArr;
        E e7 = new E(inputStream, 0);
        boolean readBoolean = e7.readBoolean();
        int readInt = e7.readInt();
        byte[] bArr2 = null;
        if (readInt > 0) {
            bArr = new byte[readInt];
            e7.read(bArr, 0, readInt);
        } else {
            bArr = null;
        }
        int readInt2 = e7.readInt();
        if (readInt2 > 0) {
            bArr2 = new byte[readInt2];
            e7.read(bArr2, 0, readInt2);
        }
        return new F(e7.readInt(), readBoolean, bArr2, bArr);
    }

    public Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public List l(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1128a c1128a : componentRegistrar.getComponents()) {
            String str = c1128a.f13183a;
            if (str != null) {
                B1.c cVar = new B1.c(14, str, c1128a);
                c1128a = new C1128a(str, c1128a.f13184b, c1128a.f13185c, c1128a.f13186d, c1128a.f13187e, cVar, c1128a.f13189g);
            }
            arrayList.add(c1128a);
        }
        return arrayList;
    }

    @Override // m.w
    public boolean n(m.k kVar) {
        return false;
    }

    @Override // e2.InterfaceC1014k
    public boolean next() {
        return false;
    }

    @Override // q4.g
    public boolean p(Object obj) {
        switch (this.f17769a) {
            case 20:
                return ((n4.H) obj).f15373e;
            default:
                return !((p4.c) obj).f15703e;
        }
    }

    @Override // w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        F f7 = (F) obj;
        if (f7 == null) {
            return;
        }
        D d7 = new D(outputStream, 0);
        d7.writeBoolean(f7.f17367a);
        byte[] bArr = f7.f17368b;
        if (bArr == null) {
            d7.writeInt(0);
        } else {
            d7.writeInt(bArr.length);
            d7.write(bArr);
        }
        byte[] bArr2 = f7.f17369c;
        if (bArr2 == null) {
            d7.writeInt(0);
        } else {
            d7.writeInt(bArr2.length);
            d7.write(bArr2);
        }
        d7.writeInt(f7.f17370d);
        d7.flush();
    }

    public C1718l0(C1759x1 c1759x1) {
        this.f17769a = 2;
    }

    @Override // m.w
    public void a(m.k kVar, boolean z4) {
    }
}
