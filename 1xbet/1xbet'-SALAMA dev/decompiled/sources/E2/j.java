package E2;

import F2.C0252s;
import F2.InterfaceC0266z;
import I2.J;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzfcb;

/* JADX INFO: loaded from: classes.dex */
public final class j extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1937a;

    public j(n nVar) {
        this.f1937a = nVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        n nVar = this.f1937a;
        InterfaceC0266z interfaceC0266z = nVar.f1949x;
        if (interfaceC0266z != null) {
            try {
                interfaceC0266z.zzf(zzfcb.zzd(1, null, null));
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                J2.j.i("#007 Could not call remote method.", e7);
            }
        }
        InterfaceC0266z interfaceC0266z2 = nVar.f1949x;
        if (interfaceC0266z2 != null) {
            try {
                interfaceC0266z2.zze(0);
            } catch (RemoteException e8) {
                int i8 = J.f3546b;
                J2.j.i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        n nVar = this.f1937a;
        int iP = 0;
        if (str.startsWith(nVar.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            InterfaceC0266z interfaceC0266z = nVar.f1949x;
            if (interfaceC0266z != null) {
                try {
                    interfaceC0266z.zzf(zzfcb.zzd(3, null, null));
                } catch (RemoteException e7) {
                    int i7 = J.f3546b;
                    J2.j.i("#007 Could not call remote method.", e7);
                }
            }
            InterfaceC0266z interfaceC0266z2 = nVar.f1949x;
            if (interfaceC0266z2 != null) {
                try {
                    interfaceC0266z2.zze(3);
                } catch (RemoteException e8) {
                    int i8 = J.f3546b;
                    J2.j.i("#007 Could not call remote method.", e8);
                }
            }
            nVar.Z(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            InterfaceC0266z interfaceC0266z3 = nVar.f1949x;
            if (interfaceC0266z3 != null) {
                try {
                    interfaceC0266z3.zzf(zzfcb.zzd(1, null, null));
                } catch (RemoteException e9) {
                    int i9 = J.f3546b;
                    J2.j.i("#007 Could not call remote method.", e9);
                }
            }
            InterfaceC0266z interfaceC0266z4 = nVar.f1949x;
            if (interfaceC0266z4 != null) {
                try {
                    interfaceC0266z4.zze(0);
                } catch (RemoteException e10) {
                    int i10 = J.f3546b;
                    J2.j.i("#007 Could not call remote method.", e10);
                }
            }
            nVar.Z(0);
            return true;
        }
        boolean zStartsWith = str.startsWith("gmsg://adResized");
        Context context = nVar.f1946d;
        if (zStartsWith) {
            InterfaceC0266z interfaceC0266z5 = nVar.f1949x;
            if (interfaceC0266z5 != null) {
                try {
                    interfaceC0266z5.zzi();
                } catch (RemoteException e11) {
                    int i11 = J.f3546b;
                    J2.j.i("#007 Could not call remote method.", e11);
                }
            }
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    J2.d dVar = C0252s.f2717f.f2718a;
                    iP = J2.d.p(Integer.parseInt(queryParameter), context);
                } catch (NumberFormatException unused) {
                }
            }
            nVar.Z(iP);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        InterfaceC0266z interfaceC0266z6 = nVar.f1949x;
        if (interfaceC0266z6 != null) {
            try {
                interfaceC0266z6.zzc();
                nVar.f1949x.zzh();
            } catch (RemoteException e12) {
                int i12 = J.f3546b;
                J2.j.i("#007 Could not call remote method.", e12);
            }
        }
        if (nVar.f1950y != null) {
            Uri uriZza = Uri.parse(str);
            try {
                uriZza = nVar.f1950y.zza(uriZza, context, null, null);
            } catch (zzaup e13) {
                int i13 = J.f3546b;
                J2.j.h("Unable to process ad data", e13);
            }
            str = uriZza.toString();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }
}
