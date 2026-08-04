package p155w1;

import A5.b;
import A5.f;
import A5.x;
import C0.C0091j;
import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import I2.P;
import W3.j;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.api.internal.InterfaceC0798t;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdcp;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.Mac;
import p032e2.k;
import p048g4.a;
import p086m.w;
import p098n4.H;
import p113p3.c;
import p120q4.g;
import p155w1.C1009l0;
import p155w1.V0;

/* JADX INFO: renamed from: w1.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1009l0 implements j, w, InterfaceC0798t, k, V, g, c, Y0, Z0, V.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1009l0 f17774b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17775a;

    public /* synthetic */ C1009l0(int i7) {
        this.f17775a = i7;
    }

    public static Path j(float f7, float f8, float f9, float f10) {
        Path path = new Path();
        path.moveTo(f7, f8);
        path.lineTo(f9, f10);
        return path;
    }

    public static void m(f fVar, final C1009l0 c1009l0) {
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", new x(), obj, 1);
        if (c1009l0 != null) {
            final int i7 = 0;
            f7.M(new b(c1009l0) { // from class: E5.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1009l0 f2415b;

                {
                    this.f2415b = c1009l0;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            String str2 = (String) arrayList2.get(1);
                            String str3 = (String) arrayList2.get(2);
                            this.f2415b.getClass();
                            p042f4.w wVar = (p042f4.w) C0196n.f2390a.get(str);
                            if (str2 == null || str3 == null) {
                                FirebaseAuth firebaseAuth = wVar.f12990g;
                                FirebaseUser firebaseUser = firebaseAuth.f11854f;
                                com.google.android.gms.common.internal.D.j(firebaseUser, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
                                String str4 = ((zzad) firebaseUser).f11909b.f11944f;
                                com.google.android.gms.common.internal.D.f(str4, "Email cannot be empty, since verified email is required to use MFA.");
                                Y3.i iVar = firebaseAuth.f11849a;
                                iVar.b();
                                arrayList.add(0, wVar.a(str4, iVar.f7664b));
                                v6.f(arrayList);
                            } else {
                                arrayList.add(0, wVar.a(str2, str3));
                                v6.f(arrayList);
                            }
                            break;
                        default:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str5 = (String) arrayList4.get(0);
                            String str6 = (String) arrayList4.get(1);
                            this.f2415b.getClass();
                            p042f4.w wVar2 = (p042f4.w) C0196n.f2390a.get(str5);
                            wVar2.getClass();
                            com.google.android.gms.common.internal.D.f(str6, "qrCodeUrl cannot be empty.");
                            try {
                                Y3.i iVar2 = wVar2.f12990g.f11849a;
                                iVar2.b();
                                iVar2.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)).addFlags(268435456));
                            } catch (ActivityNotFoundException unused) {
                                Y3.i iVar3 = wVar2.f12990g.f11849a;
                                iVar3.b();
                                iVar3.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=otpauth&c=apps")).addFlags(268435456));
                            }
                            arrayList3.add(0, null);
                            v6.f(arrayList3);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", new x(), obj, 1);
        if (c1009l0 == null) {
            f8.M(null);
        } else {
            final int i8 = 1;
            f8.M(new b(c1009l0) { // from class: E5.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1009l0 f2415b;

                {
                    this.f2415b = c1009l0;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            String str2 = (String) arrayList2.get(1);
                            String str3 = (String) arrayList2.get(2);
                            this.f2415b.getClass();
                            p042f4.w wVar = (p042f4.w) C0196n.f2390a.get(str);
                            if (str2 == null || str3 == null) {
                                FirebaseAuth firebaseAuth = wVar.f12990g;
                                FirebaseUser firebaseUser = firebaseAuth.f11854f;
                                com.google.android.gms.common.internal.D.j(firebaseUser, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
                                String str4 = ((zzad) firebaseUser).f11909b.f11944f;
                                com.google.android.gms.common.internal.D.f(str4, "Email cannot be empty, since verified email is required to use MFA.");
                                Y3.i iVar = firebaseAuth.f11849a;
                                iVar.b();
                                arrayList.add(0, wVar.a(str4, iVar.f7664b));
                                v6.f(arrayList);
                            } else {
                                arrayList.add(0, wVar.a(str2, str3));
                                v6.f(arrayList);
                            }
                            break;
                        default:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str5 = (String) arrayList4.get(0);
                            String str6 = (String) arrayList4.get(1);
                            this.f2415b.getClass();
                            p042f4.w wVar2 = (p042f4.w) C0196n.f2390a.get(str5);
                            wVar2.getClass();
                            com.google.android.gms.common.internal.D.f(str6, "qrCodeUrl cannot be empty.");
                            try {
                                Y3.i iVar2 = wVar2.f12990g.f11849a;
                                iVar2.b();
                                iVar2.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)).addFlags(268435456));
                            } catch (ActivityNotFoundException unused) {
                                Y3.i iVar3 = wVar2.f12990g.f11849a;
                                iVar3.b();
                                iVar3.f7663a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=otpauth&c=apps")).addFlags(268435456));
                            }
                            arrayList3.add(0, null);
                            v6.f(arrayList3);
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
            Activity activityZzi = adOverlayInfoParcel.f10818d.zzi();
            zzc zzcVar = adOverlayInfoParcel.f10815a;
            Context context2 = (zzcVar == null || !zzcVar.f10824A || activityZzi == null) ? context : activityZzi;
            B4.V v6 = o.f1952C.f1955a;
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
            P p5 = o.f1952C.f1957c;
            P.r(context, intent, zzdqqVar, adOverlayInfoParcel.f10807H);
        } else {
            P p7 = o.f1952C.f1957c;
            P.p(context, intent);
        }
    }

    @Override // androidx.lifecycle.V
    public S b(Class cls) {
        return new p095n0.c();
    }

    @Override // p032e2.k
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // p113p3.c
    public C0091j e(Context context, String str, p113p3.b bVar) {
        int iF;
        C0091j c0091j = new C0091j();
        int iK = bVar.k(context, str);
        c0091j.f1289a = iK;
        int i7 = 1;
        int i8 = 0;
        if (iK != 0) {
            iF = bVar.f(context, str, false);
            c0091j.f1290b = iF;
        } else {
            iF = bVar.f(context, str, true);
            c0091j.f1290b = iF;
        }
        int i9 = c0091j.f1289a;
        if (i9 == 0) {
            if (iF == 0) {
                i7 = 0;
            }
            c0091j.f1291c = i7;
            return c0091j;
        }
        i8 = i9;
        if (i8 >= iF) {
            i7 = -1;
        }
        c0091j.f1291c = i7;
        return c0091j;
    }

    @Override // p032e2.k
    public long f() {
        throw new NoSuchElementException();
    }

    @Override // p155w1.Z0
    public Y0 g(int i7) {
        return new C1010l1(new C1013m0(27));
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws IOException {
        byte[] bArr;
        E e7 = new E(inputStream, 0);
        boolean z4 = e7.readBoolean();
        int i7 = e7.readInt();
        byte[] bArr2 = null;
        if (i7 > 0) {
            bArr = new byte[i7];
            e7.read(bArr, 0, i7);
        } else {
            bArr = null;
        }
        int i8 = e7.readInt();
        if (i8 > 0) {
            bArr2 = new byte[i8];
            e7.read(bArr2, 0, i8);
        }
        return new F(e7.readInt(), z4, bArr2, bArr);
    }

    public Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public List l(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f13189a;
            if (str != null) {
                B1.c cVar = new B1.c(14, str, aVar);
                aVar = new a(str, aVar.f13190b, aVar.f13191c, aVar.f13192d, aVar.f13193e, cVar, aVar.f13195g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // p086m.w
    public boolean n(p086m.k kVar) {
        return false;
    }

    @Override // p032e2.k
    public boolean next() {
        return false;
    }

    @Override // p120q4.g
    public boolean p(Object obj) {
        switch (this.f17775a) {
            case 20:
                return ((H) obj).f15379e;
            default:
                return !((p114p4.c) obj).f15709e;
        }
    }

    @Override // p155w1.Y0
    public void s(Object obj, OutputStream outputStream) throws IOException {
        F f7 = (F) obj;
        if (f7 == null) {
            return;
        }
        D d7 = new D(outputStream, 0);
        d7.writeBoolean(f7.f17373a);
        byte[] bArr = f7.f17374b;
        if (bArr == null) {
            d7.writeInt(0);
        } else {
            d7.writeInt(bArr.length);
            d7.write(bArr);
        }
        byte[] bArr2 = f7.f17375c;
        if (bArr2 == null) {
            d7.writeInt(0);
        } else {
            d7.writeInt(bArr2.length);
            d7.write(bArr2);
        }
        d7.writeInt(f7.f17376d);
        d7.flush();
    }

    public C1009l0(C1050x1 c1050x1) {
        this.f17775a = 2;
    }

    @Override // p086m.w
    public void a(p086m.k kVar, boolean z4) {
    }
}
