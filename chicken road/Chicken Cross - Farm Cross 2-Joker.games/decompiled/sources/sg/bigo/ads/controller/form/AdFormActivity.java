package sg.bigo.ads.controller.form;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.P;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.L0.z;
import sg.bigo.ads.P.n;
import sg.bigo.ads.P.o;
import sg.bigo.ads.R;
import sg.bigo.ads.U0.b;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.common.form.render.a;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.e.h;
import sg.bigo.ads.l0.AbstractC5291b;
import sg.bigo.ads.l0.C5290a;
import sg.bigo.ads.l0.C5292c;
import sg.bigo.ads.l0.C5294e;
import sg.bigo.ads.l0.C5295f;
import sg.bigo.ads.l0.C5296g;
import sg.bigo.ads.m0.AbstractC5348a;
import sg.bigo.ads.m0.C5353f;
import sg.bigo.ads.m0.InterfaceC5352e;
import sg.bigo.ads.m0.ViewOnAttachStateChangeListenerC5350c;
import sg.bigo.ads.m0.ViewOnClickListenerC5351d;
import sg.bigo.ads.m0.l;
import sg.bigo.ads.n0.AbstractC5416a;
import sg.bigo.ads.n0.d;
import sg.bigo.ads.n0.e;
import sg.bigo.ads.s0.p;

/* loaded from: classes3.dex */
public class AdFormActivity extends Activity implements InterfaceC5352e {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public h f12717a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public Map f;
    public C5296g g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        h hVar;
        char c;
        Locale locale;
        n nVar;
        View view;
        AbstractC5416a hVar2;
        int a2;
        RelativeLayout relativeLayout;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.inter_main);
        if (frameLayout == null || (hVar = this.f12717a) == null) {
            return;
        }
        n nVar2 = ((b) hVar.e()).u0;
        String str = nVar2.b;
        str.getClass();
        str.hashCode();
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3201:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3246:
                if (str.equals("es")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3259:
                if (str.equals("fa")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3276:
                if (str.equals("fr")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3325:
                if (str.equals("he")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3329:
                if (str.equals("hi")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3383:
                if (str.equals("ja")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3428:
                if (str.equals("ko")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3494:
                if (str.equals("ms")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3588:
                if (str.equals("pt")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3651:
                if (str.equals("ru")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3700:
                if (str.equals("th")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 3749:
                if (str.equals("uz")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 3763:
                if (str.equals("vi")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                locale = new Locale("ar", "");
                break;
            case 1:
                locale = Locale.GERMAN;
                break;
            case 2:
                locale = new Locale("es", "");
                break;
            case 3:
                locale = new Locale("fa", "");
                break;
            case 4:
                locale = Locale.FRENCH;
                break;
            case 5:
                locale = new Locale("he", "");
                break;
            case 6:
                locale = new Locale("hi", "");
                break;
            case 7:
                locale = new Locale("id", "");
                break;
            case '\b':
                locale = Locale.JAPANESE;
                break;
            case '\t':
                locale = Locale.KOREAN;
                break;
            case '\n':
                locale = new Locale("ms", "");
                break;
            case 11:
                locale = new Locale("pt", "");
                break;
            case '\f':
                locale = new Locale("ru", "");
                break;
            case '\r':
                locale = new Locale("th", "");
                break;
            case 14:
                locale = new Locale("tr", "");
                break;
            case 15:
                locale = new Locale("uz", "");
                break;
            case 16:
                locale = new Locale("vi", "");
                break;
            default:
                locale = Locale.ENGLISH;
                break;
        }
        AbstractC5291b.f13054a = locale;
        boolean z = this.f12717a.v;
        this.d = z;
        C5353f c5353f = new C5353f(this, nVar2, this.f, this.e, this.c, this);
        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC4944a.a(this, AbstractC5348a.a(3), null, false);
        c5353f.e = relativeLayout2;
        if (relativeLayout2 == null) {
            relativeLayout = null;
            nVar = nVar2;
        } else {
            nVar = nVar2;
            if (z) {
                a.a(relativeLayout2, this, nVar, c5353f, 5);
            } else {
                TextView textView = (TextView) relativeLayout2.findViewById(R.id.inter_form_content_title);
                String str2 = nVar.c;
                if (textView != null) {
                    if (TextUtils.isEmpty(str2)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(str2);
                    }
                }
                TextView textView2 = (TextView) c5353f.e.findViewById(R.id.inter_form_content_description);
                String str3 = nVar.d;
                if (textView2 != null) {
                    if (TextUtils.isEmpty(str3)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(str3);
                    }
                }
                RelativeLayout relativeLayout3 = c5353f.e;
                o oVar = nVar.f;
                if (oVar == null || I.a((CharSequence) oVar.c)) {
                    ViewGroup viewGroup = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_icon_layout);
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_content_layout);
                    if (viewGroup2 != null) {
                        viewGroup2.setPadding(0, 0, 0, 0);
                    }
                } else {
                    ImageView imageView = (ImageView) relativeLayout3.findViewById(R.id.inter_form_content_icon);
                    if (imageView != null) {
                        new p(imageView, 0).a(null, nVar.f.c, true);
                    }
                }
                RelativeLayout relativeLayout4 = c5353f.e;
                View findViewById = relativeLayout4.findViewById(R.id.inter_blank_viewholder);
                if (findViewById != null) {
                    o[] oVarArr = nVar.e;
                    if (((oVarArr == null || oVarArr.length <= 0) ? null : oVarArr[0]) != null) {
                        int a3 = a.a(this, nVar);
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        layoutParams.height = a3 - AbstractC4963u.a(this, 8);
                        findViewById.setLayoutParams(layoutParams);
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) relativeLayout4.findViewById(R.id.inter_form_icon_layout);
                if (frameLayout2 != null) {
                    o[] oVarArr2 = nVar.e;
                    if (((oVarArr2 == null || oVarArr2.length <= 0) ? null : oVarArr2[0]) == null) {
                        a2 = 0;
                    } else {
                        a2 = a.a(this, nVar) - AbstractC4963u.a(this, 33);
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams2.topMargin = a2;
                        frameLayout2.setLayoutParams(layoutParams2);
                    }
                    HeightScrollView heightScrollView = (HeightScrollView) relativeLayout4.findViewById(R.id.inter_form_scroll);
                    if (heightScrollView != null) {
                        heightScrollView.setBlankView(findViewById);
                        heightScrollView.setOnScrollListener(new l(frameLayout2, a2));
                    }
                }
                Button button = (Button) c5353f.e.findViewById(R.id.inter_form_submit);
                c5353f.d = button;
                if (button != null) {
                    button.setText(AbstractC5291b.a(this, R.string.bigo_ad_form_submit));
                    c5353f.d.setOnClickListener(new ViewOnClickListenerC5351d(c5353f));
                }
                ViewGroup viewGroup3 = (ViewGroup) c5353f.e.findViewById(R.id.inter_form_content);
                if (viewGroup3 != null) {
                    e eVar = c5353f.c;
                    View a4 = AbstractC4944a.a(eVar.f13202a, AbstractC5348a.a(5), null, false);
                    eVar.f = a4;
                    if (a4 == null) {
                        view = null;
                    } else {
                        ViewGroup viewGroup4 = (ViewGroup) a4.findViewById(R.id.bigo_ad_id_form_question);
                        sg.bigo.ads.O.e[] eVarArr = eVar.e;
                        if (eVarArr != null && viewGroup4 != null) {
                            for (sg.bigo.ads.O.e eVar2 : eVarArr) {
                                Map map = eVar.c;
                                Context context = eVar.f13202a;
                                if (eVar2 != null) {
                                    int i = eVar2.b;
                                    if (i == 1) {
                                        hVar2 = new sg.bigo.ads.n0.h(eVar2, map, context, eVar);
                                    } else if (i == 2 || i == 3) {
                                        hVar2 = new d(eVar2, map, context, eVar);
                                    }
                                    if (hVar2 == null) {
                                        eVar.h.add(hVar2);
                                        View b = hVar2.b();
                                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                                        layoutParams3.bottomMargin = AbstractC4963u.a(eVar.f13202a, 27);
                                        X.a(b, viewGroup4, layoutParams3, -1);
                                    }
                                }
                                hVar2 = null;
                                if (hVar2 == null) {
                                }
                            }
                        }
                        TextView textView3 = (TextView) eVar.f.findViewById(R.id.inter_form_question_purpose);
                        if (textView3 != null) {
                            textView3.setText(eVar.d.g);
                        }
                        eVar.g = a.a(eVar.f, eVar.d, eVar.c, eVar.i);
                        view = eVar.f;
                    }
                    X.a(view, viewGroup3, null, -1);
                }
            }
            X.a(c5353f.e, new ViewOnAttachStateChangeListenerC5350c(c5353f));
            relativeLayout = c5353f.e;
        }
        C5296g c5296g = new C5296g(relativeLayout, c5353f);
        c5296g.d.setType(0);
        c5296g.d.setRadius(AbstractC4963u.a(this, 3));
        c5296g.d.setPadding(AbstractC4963u.a(this, 4), AbstractC4963u.a(this, 3), AbstractC4963u.a(this, 4), AbstractC4963u.a(this, 3));
        c5296g.c.setViewStyle(3);
        c5296g.c.setFlipInterval(5000);
        c5296g.c.setOnItemChangeListener(new C5295f(c5296g));
        c5296g.c.getLayoutParams().height = a.a(this, nVar);
        o[] oVarArr3 = nVar.e;
        if (!A.c(oVarArr3)) {
            for (o oVar2 : oVarArr3) {
                ImageView imageView2 = new ImageView(this);
                new p(imageView2).a(null, oVar2.c, false);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                z zVar = new z();
                ((ViewGroup.LayoutParams) zVar).width = -1;
                ((ViewGroup.LayoutParams) zVar).height = -2;
                zVar.e = 48;
                zVar.d = 3;
                c5296g.c.addView(imageView2, zVar);
                if (nVar.j != 0) {
                }
            }
        }
        this.g = c5296g;
        X.a(c5296g.b, frameLayout, null, -1);
        this.g.c.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText ? !X.b((int) motionEvent.getX(), (int) motionEvent.getY(), currentFocus) : false) {
                currentFocus.clearFocus();
                X.a(this);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.d) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.b = getIntent().getIntExtra("ad_identifier", -1);
            this.e = getIntent().getIntExtra("open_form_time", 0);
            h a2 = D.a(this.b);
            this.f12717a = a2;
            if (a2 == null) {
                finish();
                return;
            }
            int hashCode = a2.e().hashCode();
            this.c = hashCode;
            C5294e.c.getClass();
            ConcurrentHashMap concurrentHashMap = C5294e.d;
            this.f = concurrentHashMap.containsKey(Integer.valueOf(hashCode)) ? (Map) concurrentHashMap.get(Integer.valueOf(hashCode)) : null;
            setContentView(R.layout.bigo_ad_activity_form);
            Window window = getWindow();
            if (window != null) {
                P.a(window);
            }
            View findViewById = findViewById(R.id.bigo_ad_btn_close);
            if (findViewById != null) {
                findViewById.setOnClickListener(new sg.bigo.ads.W0.a(this));
            }
            a();
        } catch (Throwable th) {
            h hVar = this.f12717a;
            sg.bigo.ads.s1.b.a(3000, 10221, Log.getStackTraceString(th), hVar != null ? hVar.e() : null);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C5296g c5296g;
        C5353f c5353f;
        super.onDestroy();
        try {
            if (this.f12717a != null && (c5296g = this.g) != null && (c5353f = c5296g.f13058a) != null) {
                n nVar = c5353f.b;
                e eVar = c5353f.c;
                PrivacyCheckBox privacyCheckBox = eVar.g;
                HashMap a2 = AbstractC5291b.a(nVar, privacyCheckBox != null && privacyCheckBox.f, eVar.a());
                boolean z = this.d;
                if (!z) {
                    int i = this.c;
                    C5294e.c.getClass();
                    C5294e.d.put(Integer.valueOf(i), a2);
                } else if (z) {
                    int i2 = this.c;
                    C5294e c5294e = C5294e.c;
                    c5294e.getClass();
                    ConcurrentHashMap concurrentHashMap = C5294e.d;
                    Map map = concurrentHashMap.containsKey(Integer.valueOf(i2)) ? (Map) concurrentHashMap.get(Integer.valueOf(i2)) : null;
                    C5290a c5290a = new C5290a(i2);
                    if (c5294e.b != null && map != null) {
                        sg.bigo.ads.s1.b.a(1, 3, "");
                        c5294e.b.a(map, new C5292c(c5290a, map, 3));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
