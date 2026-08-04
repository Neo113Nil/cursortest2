package B4;

import F2.C0254t;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.Provider;
import java.security.Signature;
import java.util.List;
import javax.crypto.KeyAgreement;
import p155w1.Y0;
import p155w1.Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class V implements A0.d, F1.m, J2.c, M2.b, R1.u, S2.b, W3.j, p026d4.a, Continuation, p113p3.b, p120q4.g, p116q.b, p146u2.H, Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1133a;

    public /* synthetic */ V(int i7) {
        this.f1133a = i7;
    }

    public static boolean t(p059i0.b bVar, Editable editable, int i7, int i8, boolean z4) {
        int iMin;
        if (editable == null || i7 < 0 || i8 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z4) {
            int iMax = Math.max(i7, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z7 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z7) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break loop0;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z7) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z7 = true;
                        }
                        selectionStart = -1;
                        break loop0;
                    }
                }
            }
            selectionStart = -1;
            break loop0;
            int iMax2 = Math.max(i8, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z8 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z8) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z8) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z8 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i7, 0);
            iMin = Math.min(selectionEnd + i8, editable.length());
        }
        p046g0.u[] uVarArr = (p046g0.u[]) editable.getSpans(selectionStart, iMin, p046g0.u.class);
        if (uVarArr == null || uVarArr.length <= 0) {
            return false;
        }
        for (p046g0.u uVar : uVarArr) {
            int spanStart = editable.getSpanStart(uVar);
            int spanEnd = editable.getSpanEnd(uVar);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        bVar.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        bVar.endBatchEdit();
        return true;
    }

    public static final boolean u(Context context, Intent intent, H2.c cVar, H2.a aVar, boolean z4, zzdqq zzdqqVar, String str) {
        int iC;
        if (z4) {
            Uri data = intent.getData();
            try {
                E2.o.f1952C.f1957c.getClass();
                iC = I2.P.C(context, data);
                if (cVar != null) {
                    cVar.zzg();
                }
            } catch (ActivityNotFoundException e7) {
                String message = e7.getMessage();
                int i7 = I2.J.f3546b;
                J2.j.g(message);
                iC = 6;
            }
            if (aVar != null) {
                aVar.zzb(iC);
            }
            return iC == 5;
        }
        try {
            I2.J.k("Launching an intent: " + intent.toURI());
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmZ)).booleanValue()) {
                I2.P p5 = E2.o.f1952C.f1957c;
                I2.P.r(context, intent, zzdqqVar, str);
            } else {
                I2.P p7 = E2.o.f1952C.f1957c;
                I2.P.p(context, intent);
            }
            if (cVar != null) {
                cVar.zzg();
            }
            if (aVar != null) {
                aVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            String message2 = e8.getMessage();
            int i8 = I2.J.f3546b;
            J2.j.g(message2);
            if (aVar != null) {
                aVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean v(Context context, zzc zzcVar, H2.c cVar, H2.a aVar, zzdqq zzdqqVar, String str) {
        int i7 = 0;
        if (zzcVar == null) {
            int i8 = I2.J.f3546b;
            J2.j.g("No intent data for launcher overlay.");
            return false;
        }
        zzbby.zza(context);
        Intent intent = zzcVar.f10832y;
        if (intent != null) {
            return u(context, intent, cVar, aVar, zzcVar.f10824A, zzdqqVar, str);
        }
        Intent intent2 = new Intent();
        String str2 = zzcVar.f10826b;
        if (TextUtils.isEmpty(str2)) {
            int i9 = I2.J.f3546b;
            J2.j.g("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzcVar.f10827c;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzcVar.f10828d;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzcVar.f10829e;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i10 = I2.J.f3546b;
                J2.j.g("Could not parse component name from open GMSG: ".concat(String.valueOf(str5)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = zzcVar.f10830f;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i7 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i11 = I2.J.f3546b;
                J2.j.g("Could not parse intent flags.");
            }
            intent2.addFlags(i7);
        }
        zzbbp zzbbpVar = zzbby.zzeI;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeH)).booleanValue()) {
                I2.P p5 = E2.o.f1952C.f1957c;
                I2.P.E(context, intent2);
            }
        }
        return u(context, intent2, cVar, aVar, zzcVar.f10824A, zzdqqVar, str);
    }

    @Override // R1.u
    public MediaCodecInfo a(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // R1.u
    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        switch (this.f1133a) {
            case 13:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public boolean equals(Object obj) {
        switch (this.f1133a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return obj != null && V.class == obj.getClass();
            default:
                return super.equals(obj);
        }
    }

    @Override // p113p3.b
    public int f(Context context, String str, boolean z4) {
        return p113p3.d.d(context, str, z4);
    }

    @Override // p155w1.Z0
    public Y0 g(int i7) {
        p023d1.n nVar = new p023d1.n();
        nVar.f12371a = i7;
        return nVar;
    }

    @Override // S2.b
    public int getAmount() {
        return 1;
    }

    @Override // S2.b
    public String getType() {
        return "";
    }

    @Override // R1.u
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // R1.u
    public int i() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p113p3.b
    public int k(Context context, String str) {
        return p113p3.d.a(context, str);
    }

    @Override // p146u2.H
    public void load() {
        synchronized (p151v2.a.f17096g) {
            Object obj = p151v2.a.f17097h;
            synchronized (obj) {
                if (p151v2.a.f17098i) {
                    return;
                }
                long jA = p151v2.a.a();
                synchronized (obj) {
                    p151v2.a.j = jA;
                    p151v2.a.f17098i = true;
                }
            }
        }
    }

    @Override // R1.u
    public boolean o() {
        return false;
    }

    @Override // p120q4.g
    public boolean p(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    @Override // p116q.b
    public Bundle q() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
        return bundle;
    }

    @Override // F1.m
    public F1.v r(int i7, int i8) {
        return new F1.j();
    }

    public String s(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof p034e4.e) && ((p034e4.e) task.getException()).f12682a.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }

    public String toString() {
        switch (this.f1133a) {
            case 0:
                return "MemoryEagerGcSettings{}";
            case 28:
                throw null;
            default:
                return super.toString();
        }
    }

    @Override // J2.c
    public J2.m zza(String str) {
        new D1.j(str).start();
        return J2.m.f3827a;
    }

    public /* synthetic */ V(J2.d dVar) {
        this.f1133a = 6;
    }

    @Override // A0.d
    public void j() {
    }

    @Override // p146u2.H
    public void l() {
    }

    @Override // F1.m
    public void n() {
    }

    @Override // p026d4.a
    public void e(p014b4.b bVar) {
    }

    @Override // F1.m
    public void m(F1.s sVar) {
    }

    @Override // A0.d
    public void c(int i7, Serializable serializable) {
    }
}
