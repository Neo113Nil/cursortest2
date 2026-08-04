package R5;

import android.net.http.SslError;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.List;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements A5.c, A5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6071a;

    public /* synthetic */ D(Object obj, int i7) {
        this.f6071a = i7;
    }

    @Override // A5.c
    public void f(Object obj) {
        switch (this.f6071a) {
            case 0:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "");
                    int i7 = C0411g.f6164e;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i8 = C0411g.f6164e;
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i9 = C0411g.f6164e;
                    }
                }
                break;
            case 1:
            case 5:
            case 6:
            case 11:
            case 13:
            case 14:
            default:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "");
                    int i10 = C0411g.f6164e;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i11 = C0411g.f6164e;
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i12 = C0411g.f6164e;
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "");
                    int i13 = C0411g.f6164e;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i14 = C0411g.f6164e;
                    } else {
                        Object obj6 = list3.get(0);
                        t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i15 = C0411g.f6164e;
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj8 = list4.get(0);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        t6.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "");
                    int i16 = C0411g.f6164e;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i17 = C0411g.f6164e;
                    } else {
                        Object obj10 = list5.get(0);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i18 = C0411g.f6164e;
                    }
                }
                break;
            case 7:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "");
                    int i19 = C0411g.f6164e;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i20 = C0411g.f6164e;
                    } else {
                        Object obj12 = list6.get(0);
                        t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        t6.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i21 = C0411g.f6164e;
                    }
                }
                break;
            case 8:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "");
                    int i22 = C0411g.f6164e;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i23 = C0411g.f6164e;
                    } else {
                        Object obj14 = list7.get(0);
                        t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        t6.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i24 = C0411g.f6164e;
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "");
                    int i25 = C0411g.f6164e;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i26 = C0411g.f6164e;
                    } else {
                        Object obj16 = list8.get(0);
                        t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        t6.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i27 = C0411g.f6164e;
                    }
                }
                break;
            case 10:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "");
                    int i28 = C0411g.f6164e;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i29 = C0411g.f6164e;
                    } else {
                        Object obj18 = list9.get(0);
                        t6.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i30 = C0411g.f6164e;
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "");
                    int i31 = C0411g.f6164e;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i32 = C0411g.f6164e;
                    } else {
                        Object obj20 = list10.get(0);
                        t6.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i33 = C0411g.f6164e;
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "");
                    int i34 = C0411g.f6164e;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i35 = C0411g.f6164e;
                    } else {
                        Object obj22 = list11.get(0);
                        t6.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        t6.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i36 = C0411g.f6164e;
                    }
                }
                break;
            case 16:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i37 = Z.f6121h;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i38 = Z.f6121h;
                    } else {
                        Object obj24 = list12.get(0);
                        t6.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        t6.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i39 = Z.f6121h;
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i40 = Z.f6121h;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        int i41 = Z.f6121h;
                    } else {
                        Object obj26 = list13.get(0);
                        t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i42 = Z.f6121h;
                    }
                }
                break;
            case 18:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i43 = Z.f6121h;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i44 = Z.f6121h;
                    } else {
                        Object obj28 = list14.get(0);
                        t6.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i45 = Z.f6121h;
                    }
                }
                break;
            case 19:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i46 = Z.f6121h;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        int i47 = Z.f6121h;
                    } else {
                        Object obj30 = list15.get(0);
                        t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        t6.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i48 = Z.f6121h;
                    }
                }
                break;
            case 20:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i49 = Z.f6121h;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        int i50 = Z.f6121h;
                    } else {
                        Object obj32 = list16.get(0);
                        t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        t6.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i51 = Z.f6121h;
                    }
                }
                break;
            case zzbbd.zzt.zzm /* 21 */:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i52 = Z.f6121h;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        int i53 = Z.f6121h;
                    } else {
                        Object obj34 = list17.get(0);
                        t6.h.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        t6.h.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj34, (String) obj35, (String) list17.get(2)));
                        int i54 = Z.f6121h;
                    }
                }
                break;
            case 22:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i55 = Z.f6121h;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        int i56 = Z.f6121h;
                    } else {
                        Object obj36 = list18.get(0);
                        t6.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj36, (String) obj37, (String) list18.get(2)));
                        int i57 = Z.f6121h;
                    }
                }
                break;
            case 23:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "");
                    int i58 = C0411g.f6164e;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        int i59 = C0411g.f6164e;
                    } else {
                        Object obj38 = list19.get(0);
                        t6.h.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list19.get(1);
                        t6.h.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj38, (String) obj39, (String) list19.get(2)));
                        int i60 = C0411g.f6164e;
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", "");
                    int i61 = C0411g.f6164e;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() <= 1) {
                        int i62 = C0411g.f6164e;
                    } else {
                        Object obj40 = list20.get(0);
                        t6.h.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        Object obj41 = list20.get(1);
                        t6.h.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj40, (String) obj41, (String) list20.get(2)));
                        int i63 = C0411g.f6164e;
                    }
                }
                break;
            case 25:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "");
                    int i64 = C0411g.f6164e;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        int i65 = C0411g.f6164e;
                    } else {
                        Object obj42 = list21.get(0);
                        t6.h.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        Object obj43 = list21.get(1);
                        t6.h.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj42, (String) obj43, (String) list21.get(2)));
                        int i66 = C0411g.f6164e;
                    }
                }
                break;
            case 26:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "");
                    int i67 = C0411g.f6164e;
                } else {
                    List list22 = (List) obj;
                    if (list22.size() <= 1) {
                        int i68 = C0411g.f6164e;
                    } else {
                        Object obj44 = list22.get(0);
                        t6.h.c(obj44, "null cannot be cast to non-null type kotlin.String");
                        Object obj45 = list22.get(1);
                        t6.h.c(obj45, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj44, (String) obj45, (String) list22.get(2)));
                        int i69 = C0411g.f6164e;
                    }
                }
                break;
            case 27:
                if (!(obj instanceof List)) {
                    p150v0.a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "");
                    int i70 = C0411g.f6164e;
                } else {
                    List list23 = (List) obj;
                    if (list23.size() <= 1) {
                        int i71 = C0411g.f6164e;
                    } else {
                        Object obj46 = list23.get(0);
                        t6.h.c(obj46, "null cannot be cast to non-null type kotlin.String");
                        Object obj47 = list23.get(1);
                        t6.h.c(obj47, "null cannot be cast to non-null type kotlin.String");
                        p003a.a.h(new C0405a((String) obj46, (String) obj47, (String) list23.get(2)));
                        int i72 = C0411g.f6164e;
                    }
                }
                break;
        }
    }

    @Override // A5.b
    public void i(Object obj, V0 v6) {
        List listW0;
        List listW1;
        List listW2;
        List listW3;
        U u4;
        List listW4;
        List listW5;
        List listW6;
        switch (this.f6071a) {
            case 1:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj2;
                Object obj3 = list.get(1);
                t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj3;
                Object obj4 = list.get(2);
                t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                Object obj5 = list.get(3);
                t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, zBooleanValue, ((Boolean) obj5).booleanValue());
                    listW0 = Y4.D.D(null);
                    break;
                } catch (Throwable th) {
                    listW0 = p003a.a.w0(th);
                }
                v6.f(listW0);
                return;
            case 5:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                t6.h.c(obj6, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj6;
                Object obj7 = list2.get(1);
                t6.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj7).toArray(new String[0]));
                    listW1 = Y4.D.D(null);
                    break;
                } catch (Throwable th2) {
                    listW1 = p003a.a.w0(th2);
                }
                v6.f(listW1);
                return;
            case 6:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj8).deny();
                    listW2 = Y4.D.D(null);
                    break;
                } catch (Throwable th3) {
                    listW2 = p003a.a.w0(th3);
                }
                v6.f(listW2);
                return;
            case 11:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj9 = ((List) obj).get(0);
                t6.h.c(obj9, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj9).getPrimaryError();
                    if (primaryError == 0) {
                        u4 = U.NOT_YET_VALID;
                    } else if (primaryError == 1) {
                        u4 = U.EXPIRED;
                    } else if (primaryError == 2) {
                        u4 = U.ID_MISMATCH;
                    } else if (primaryError == 3) {
                        u4 = U.UNTRUSTED;
                    } else if (primaryError != 4) {
                        u4 = primaryError != 5 ? U.UNKNOWN : U.INVALID;
                    } else {
                        u4 = U.DATE_INVALID;
                    }
                    listW3 = Y4.D.D(u4);
                    break;
                } catch (Throwable th4) {
                    listW3 = p003a.a.w0(th4);
                }
                v6.f(listW3);
                return;
            case 13:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj10 = ((List) obj).get(0);
                t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj10).cancel();
                    listW4 = Y4.D.D(null);
                    break;
                } catch (Throwable th5) {
                    listW4 = p003a.a.w0(th5);
                }
                v6.f(listW4);
                return;
            case 14:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj11 = ((List) obj).get(0);
                t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj11).proceed();
                    listW5 = Y4.D.D(null);
                    break;
                } catch (Throwable th6) {
                    listW5 = p003a.a.w0(th6);
                }
                v6.f(listW5);
                return;
            default:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj12 = list3.get(0);
                t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj12;
                Object obj13 = list3.get(1);
                t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                try {
                    if (!S0.w.f6285S.b()) {
                        throw S0.w.a();
                    }
                    R0.q.a(webSettings).o(zBooleanValue2);
                    listW6 = Y4.D.D(null);
                    v6.f(listW6);
                    return;
                } catch (Throwable th7) {
                    listW6 = p003a.a.w0(th7);
                }
                break;
        }
    }
}
