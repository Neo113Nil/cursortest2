package sg.bigo.ads.k1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.widget.Toast;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.U3;
import java.util.HashMap;
import org.json.JSONObject;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.k1.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5271l {

    /* renamed from: a, reason: collision with root package name */
    public final int f13038a;
    public final O b;
    public InterfaceC5267h c;
    public C5270k d;
    public sg.bigo.ads.O0.b e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final C5265f i;

    public C5271l(int i) {
        O o = new O();
        this.g = false;
        this.h = false;
        this.i = new C5265f(this);
        this.f13038a = i;
        this.b = o;
    }

    public static boolean b(String str) {
        if ("true".equals(str)) {
            return true;
        }
        if ("false".equals(str)) {
            return false;
        }
        throw new C5272m("Invalid boolean parameter: " + str);
    }

    public static int c(String str) {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new C5272m("Invalid numeric parameter: " + str);
        }
    }

    public final void a(C5270k c5270k) {
        this.d = c5270k;
        c5270k.getSettings().setJavaScriptEnabled(true);
        if (this.f13038a == 2) {
            c5270k.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.d.setScrollContainer(false);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setHorizontalScrollBarEnabled(false);
        this.d.setBackgroundColor(0);
        this.d.setWebViewClient(this.i);
        this.d.setWebChromeClient(new C5262c(this));
        this.e = new sg.bigo.ads.O0.b(this.d.getContext());
        this.d.setOnTouchListener(new ViewOnTouchListenerC5263d(this));
        this.d.setVisibilityChangedListener(new C5264e(this));
    }

    public static int a(int i, int i2) {
        if (i < i2 || i > 100000) {
            throw new C5272m("Integer parameter out of range: " + i);
        }
        return i;
    }

    public static C5270k a(Context context) {
        try {
            return new C5270k(context);
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3000, 10100, Log.getStackTraceString(e), (sg.bigo.ads.P.c) null);
            return null;
        }
    }

    public final void a() {
        C5270k c5270k = this.d;
        if (c5270k != null) {
            c5270k.setOnTouchListener(null);
            this.d.setVisibilityChangedListener(null);
            this.d.destroy();
            this.d = null;
        }
    }

    public final void a(I i, String str) {
        a("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(i.f13015a) + ", " + JSONObject.quote(str) + ")");
    }

    public static HashMap a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, TextUtils.join(",", uri.getQueryParameters(str)));
        }
        return hashMap;
    }

    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        String str = (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed";
        AbstractC5496a.a("MraidBridge", str);
        a();
        InterfaceC5267h interfaceC5267h = this.c;
        if (interfaceC5267h != null) {
            interfaceC5267h.a(str);
        }
    }

    public final void a(String str) {
        C5270k c5270k = this.d;
        if (c5270k == null) {
            AbstractC5496a.a("MraidBridge", "Attempted to inject Javascript into MRAID WebView while was not attached:\n\t" + str);
        } else {
            c5270k.loadUrl("javascript:" + str);
        }
    }

    public final void a(C5261b c5261b) {
        a("mraidbridge.notifyExposureChangeEvent(" + (String.valueOf(c5261b.f13028a) + ", " + C5261b.a(c5261b.b) + ", null") + ");");
    }

    public final void a(Q q) {
        String str;
        StringBuilder sb = new StringBuilder("mraidbridge.setScreenSize(");
        Rect rect = q.c;
        StringBuilder append = sb.append(rect.width() + "," + rect.height()).append(");mraidbridge.setMaxSize(");
        Rect rect2 = q.e;
        StringBuilder append2 = append.append(rect2.width() + "," + rect2.height()).append(");mraidbridge.setCurrentPosition(");
        Rect rect3 = q.g;
        StringBuilder append3 = append2.append(rect3.left + "," + rect3.top + "," + rect3.width() + "," + rect3.height()).append(");mraidbridge.setDefaultPosition(");
        Rect rect4 = q.i;
        StringBuilder append4 = append3.append(rect4.left + "," + rect4.top + "," + rect4.width() + "," + rect4.height()).append(");mraidbridge.setCurrentAppOrientation(");
        C5270k c5270k = this.d;
        if (c5270k == null) {
            str = "";
        } else {
            Context context = c5270k.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            str = "'" + (context.getResources().getConfiguration().orientation == 2 ? U3.i.C : U3.i.D) + "', " + ((activity == null || activity.getRequestedOrientation() == -1) ? false : true);
        }
        a(append4.append(str).append(")").toString());
        StringBuilder sb2 = new StringBuilder("mraidbridge.notifySizeChangeEvent(");
        Rect rect5 = q.g;
        a(sb2.append(rect5.width() + "," + rect5.height()).append(")").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(I i, HashMap hashMap) {
        sg.bigo.ads.l1.a aVar;
        sg.bigo.ads.l1.a aVar2;
        sg.bigo.ads.O0.b bVar;
        if (i.a(this.f13038a) && (((bVar = this.e) == null || (!this.g ? System.currentTimeMillis() - bVar.b <= 3000 : bVar.f12474a.f12473a)) && (i != I.b || !this.h))) {
            throw new C5272m("Cannot execute this command unless the user clicks");
        }
        if (this.c == null) {
            throw new C5272m("Invalid state to execute this command");
        }
        if (this.d == null) {
            throw new C5272m("The current WebView is being destroyed");
        }
        int i2 = 1;
        switch (i.ordinal()) {
            case 0:
                this.c.a();
                return;
            case 1:
                this.c.b();
                return;
            case 2:
                String str = (String) hashMap.get("url");
                String str2 = (String) hashMap.get("shouldUseCustomClose");
                this.c.a(str, str2 != null ? b(str2) : false);
                return;
            case 3:
                String str3 = (String) hashMap.get("shouldUseCustomClose");
                this.c.b(str3 != null ? b(str3) : false);
                return;
            case 4:
                String str4 = (String) hashMap.get("url");
                if (str4 == null) {
                    throw new C5272m("Parameter cannot be null");
                }
                this.c.a(str4, this.d.getClickPoints());
                return;
            case 5:
                int a2 = a(c((String) hashMap.get("width")), 0);
                int a3 = a(c((String) hashMap.get("height")), 0);
                int a4 = a(c((String) hashMap.get("offsetX")), -100000);
                int a5 = a(c((String) hashMap.get("offsetY")), -100000);
                String str5 = (String) hashMap.get("customClosePosition");
                sg.bigo.ads.l1.a aVar3 = sg.bigo.ads.l1.a.d;
                if (!TextUtils.isEmpty(str5)) {
                    if (str5.equals(U3.e.c)) {
                        aVar2 = sg.bigo.ads.l1.a.b;
                    } else if (!str5.equals(U3.e.b)) {
                        if (str5.equals("center")) {
                            aVar2 = sg.bigo.ads.l1.a.e;
                        } else if (str5.equals(U3.e.e)) {
                            aVar2 = sg.bigo.ads.l1.a.f;
                        } else if (str5.equals(U3.e.d)) {
                            aVar2 = sg.bigo.ads.l1.a.h;
                        } else if (str5.equals("top-center")) {
                            aVar2 = sg.bigo.ads.l1.a.c;
                        } else {
                            if (!str5.equals("bottom-center")) {
                                throw new C5272m("Invalid close position: ".concat(str5));
                            }
                            aVar2 = sg.bigo.ads.l1.a.g;
                        }
                    }
                    aVar = aVar2;
                    String str6 = (String) hashMap.get("allowOffscreen");
                    this.c.a(a2, a3, a4, a5, aVar, str6 != null ? b(str6) : true);
                    this.c.b(false);
                    return;
                }
                aVar = aVar3;
                String str62 = (String) hashMap.get("allowOffscreen");
                this.c.a(a2, a3, a4, a5, aVar, str62 != null ? b(str62) : true);
                this.c.b(false);
                return;
            case 6:
                boolean b = b((String) hashMap.get("allowOrientationChange"));
                String str7 = (String) hashMap.get("forceOrientation");
                if (!U3.i.D.equals(str7)) {
                    if (U3.i.C.equals(str7)) {
                        i2 = 2;
                    } else {
                        if (!"none".equals(str7)) {
                            throw new C5272m("Invalid orientation: " + str7);
                        }
                        i2 = 3;
                    }
                }
                this.c.a(i2, b);
                return;
            case 7:
                String str8 = (String) hashMap.get(ShareConstants.MEDIA_URI);
                if (str8 == null) {
                    throw new C5272m("Parameter cannot be null");
                }
                this.c.b(str8);
                return;
            case 8:
                String str9 = (String) hashMap.get(ShareConstants.MEDIA_URI);
                if (str9 != null) {
                    O o = this.b;
                    Context context = this.d.getContext();
                    C5266g c5266g = new C5266g(this, i);
                    o.getClass();
                    if (!O.a(context)) {
                        AbstractC5496a.a("MraidBridge", "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                        throw new C5272m("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
                    }
                    if (context instanceof Activity) {
                        new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new L(o, (Activity) context, str9, c5266g)).setCancelable(true).show();
                        return;
                    } else {
                        Toast.makeText(context, "Downloading image", 0).show();
                        O.a(context, str9, c5266g);
                        return;
                    }
                }
                throw new C5272m("Parameter cannot be null");
            case 9:
                O o2 = this.b;
                Context context2 = this.d.getContext();
                o2.getClass();
                if (!O.a(context2, new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"))) {
                    AbstractC5496a.a("MraidBridge", "unsupported action createCalendarEvent for devices pre-ICS");
                    throw new C5272m("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
                }
                try {
                    HashMap a6 = O.a(hashMap);
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                    for (String str10 : a6.keySet()) {
                        Object obj = a6.get(str10);
                        if (obj instanceof Long) {
                            type.putExtra(str10, ((Long) obj).longValue());
                        } else if (obj instanceof Integer) {
                            type.putExtra(str10, ((Integer) obj).intValue());
                        } else {
                            type.putExtra(str10, (String) obj);
                        }
                    }
                    type.setFlags(268435456);
                    context2.startActivity(type);
                    return;
                } catch (ActivityNotFoundException unused) {
                    AbstractC5496a.a("MraidBridge", "no calendar app installed");
                    throw new C5272m("Action is unsupported on this device - no calendar app installed");
                } catch (IllegalArgumentException e) {
                    AbstractC5496a.a("MraidBridge", "create calendar: invalid parameters " + e.getMessage());
                    throw new C5272m(e);
                } catch (Exception e2) {
                    AbstractC5496a.a("MraidBridge", "could not create calendar event");
                    throw new C5272m(e2);
                }
            case 10:
                throw new C5272m("Unspecified MRAID Javascript command");
            default:
                return;
        }
    }
}
