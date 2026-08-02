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
import b4.C0782b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d4.InterfaceC0964a;
import e4.C1031e;
import i0.C1235b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.Provider;
import java.security.Signature;
import java.util.List;
import javax.crypto.KeyAgreement;
import p3.InterfaceC1536b;
import q.InterfaceC1542b;
import v2.AbstractC1664a;
import w1.Y0;
import w1.Z0;

/* loaded from: classes2.dex */
public final class V implements A0.d, F1.m, J2.c, M2.b, R1.u, S2.b, W3.j, InterfaceC0964a, Continuation, InterfaceC1536b, q4.g, InterfaceC1542b, u2.H, Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1133a;

    public /* synthetic */ V(int i7) {
        this.f1133a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(C1235b c1235b, Editable editable, int i7, int i8, boolean z4) {
        int min;
        if (editable == null || i7 < 0 || i8 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z4) {
            int max = Math.max(i7, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z7 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char charAt = editable.charAt(selectionStart);
                            if (z7) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else {
                                if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                }
                                z7 = true;
                            }
                        } else if (!z7) {
                            selectionStart = 0;
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i8, 0);
            min = editable.length();
            if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z8 = false;
                    while (true) {
                        if (max2 == 0) {
                            min = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd < min) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z8) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else {
                                if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                }
                                selectionEnd++;
                                z8 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            min = -1;
            if (selectionStart == -1 || min == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i7, 0);
            min = Math.min(selectionEnd + i8, editable.length());
        }
        g0.u[] uVarArr = (g0.u[]) editable.getSpans(selectionStart, min, g0.u.class);
        if (uVarArr == null || uVarArr.length <= 0) {
            return false;
        }
        for (g0.u uVar : uVarArr) {
            int spanStart = editable.getSpanStart(uVar);
            int spanEnd = editable.getSpanEnd(uVar);
            selectionStart = Math.min(spanStart, selectionStart);
            min = Math.max(spanEnd, min);
        }
        int max3 = Math.max(selectionStart, 0);
        int min2 = Math.min(min, editable.length());
        c1235b.beginBatchEdit();
        editable.delete(max3, min2);
        c1235b.endBatchEdit();
        return true;
    }

    public static final boolean u(Context context, Intent intent, H2.c cVar, H2.a aVar, boolean z4, zzdqq zzdqqVar, String str) {
        int i7;
        if (z4) {
            Uri data = intent.getData();
            try {
                E2.o.f1952C.f1957c.getClass();
                i7 = I2.P.C(context, data);
                if (cVar != null) {
                    cVar.zzg();
                }
            } catch (ActivityNotFoundException e7) {
                String message = e7.getMessage();
                int i8 = I2.J.f3546b;
                J2.j.g(message);
                i7 = 6;
            }
            if (aVar != null) {
                aVar.zzb(i7);
            }
            return i7 == 5;
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
            int i9 = I2.J.f3546b;
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
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                int i10 = I2.J.f3546b;
                J2.j.g("Could not parse component name from open GMSG: ".concat(String.valueOf(str5)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
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

    @Override // p3.InterfaceC1536b
    public int f(Context context, String str, boolean z4) {
        return p3.d.d(context, str, z4);
    }

    @Override // w1.Z0
    public Y0 g(int i7) {
        d1.n nVar = new d1.n();
        nVar.f12365a = i7;
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

    @Override // p3.InterfaceC1536b
    public int k(Context context, String str) {
        return p3.d.a(context, str);
    }

    @Override // u2.H
    public void load() {
        synchronized (AbstractC1664a.f17090g) {
            Object obj = AbstractC1664a.f17091h;
            synchronized (obj) {
                if (AbstractC1664a.f17092i) {
                    return;
                }
                long a2 = AbstractC1664a.a();
                synchronized (obj) {
                    AbstractC1664a.j = a2;
                    AbstractC1664a.f17092i = true;
                }
            }
        }
    }

    @Override // R1.u
    public boolean o() {
        return false;
    }

    @Override // q4.g
    public boolean p(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    @Override // q.InterfaceC1542b
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
        return (!task.isSuccessful() && (task.getException() instanceof C1031e) && ((C1031e) task.getException()).f12676a.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
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

    @Override // u2.H
    public void l() {
    }

    @Override // F1.m
    public void n() {
    }

    @Override // d4.InterfaceC0964a
    public void e(C0782b c0782b) {
    }

    @Override // F1.m
    public void m(F1.s sVar) {
    }

    @Override // A0.d
    public void c(int i7, Serializable serializable) {
    }
}
