package O3;

import A.C0008h;
import A0.C0025f0;
import A0.C0028g0;
import P.C0327y;
import P.EnumC0330z0;
import P.F0;
import P.InterfaceC0289e0;
import P0.C0331a;
import P0.C0334d;
import P0.C0335e;
import P0.t;
import P0.u;
import P0.v;
import S3.C0411n;
import S3.C0416t;
import S3.C0417u;
import S3.I;
import S3.Y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.C1390oj;
import d.C1905e;
import e.C1919b;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSeasonChoiceUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogUiState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.x;
import n.AbstractC2107A;
import q4.C2313c;
import r.C2322H;
import s4.M;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4058k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4060m;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f4058k = i;
        this.f4059l = obj;
        this.f4060m = obj2;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        String concat;
        StringBuilder sb;
        int i;
        switch (this.f4058k) {
            case 0:
                Context context = (Context) obj;
                kotlin.jvm.internal.l.f("context", context);
                J2.j jVar = new J2.j(context);
                jVar.setAdSize((J2.i) this.f4060m);
                jVar.setAdUnitId((String) this.f4059l);
                jVar.a(new J2.h(new J2.g(0)));
                return jVar;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                kotlin.jvm.internal.l.f("adContainer", frameLayout);
                NativeAd nativeAd = (NativeAd) ((InterfaceC0289e0) this.f4060m).getValue();
                if (frameLayout.getTag() != nativeAd) {
                    frameLayout.removeAllViews();
                    frameLayout.setTag(nativeAd);
                    if (nativeAd != null) {
                        Context context2 = (Context) this.f4059l;
                        kotlin.jvm.internal.l.f("context", context2);
                        m mVar = new m(context2);
                        Z2.e eVar = new Z2.e(context2);
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(1);
                        float d5 = mVar.d(14);
                        int d6 = mVar.d(1);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(-2230793);
                        gradientDrawable.setCornerRadius(d5);
                        if (d6 > 0) {
                            gradientDrawable.setStroke(d6, -14235942);
                        }
                        linearLayout.setBackground(gradientDrawable);
                        linearLayout.setElevation(mVar.d(2));
                        int d7 = mVar.d(12);
                        linearLayout.setPadding(d7, d7, d7, d7);
                        TextView textView = new TextView(context2);
                        textView.setTextColor(-15722464);
                        textView.setTextSize(2, 15.0f);
                        textView.setTypeface(textView.getTypeface(), 1);
                        textView.setMaxLines(1);
                        TextView textView2 = new TextView(context2);
                        textView2.setTextColor(-12490384);
                        textView2.setTextSize(2, 12.0f);
                        textView2.setMaxLines(1);
                        textView2.setPadding(0, mVar.d(2), 0, 0);
                        ImageView imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mVar.d(36), mVar.d(36));
                        layoutParams.setMarginEnd(mVar.d(10));
                        imageView.setLayoutParams(layoutParams);
                        TextView textView3 = new TextView(context2);
                        textView3.setText("AD");
                        textView3.setTextColor(-1);
                        textView3.setTextSize(2, 10.0f);
                        textView3.setTypeface(textView3.getTypeface(), 1);
                        textView3.setGravity(17);
                        textView3.setPadding(mVar.d(6), mVar.d(2), mVar.d(6), mVar.d(2));
                        float d8 = mVar.d(3);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setColor(-15298656);
                        gradientDrawable2.setCornerRadius(d8);
                        textView3.setBackground(gradientDrawable2);
                        Z2.b bVar = new Z2.b(context2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, mVar.d(140));
                        layoutParams2.topMargin = mVar.d(10);
                        bVar.setLayoutParams(layoutParams2);
                        Button button = new Button(context2);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, mVar.d(44));
                        layoutParams3.topMargin = mVar.d(10);
                        button.setLayoutParams(layoutParams3);
                        button.setTextColor(-1);
                        button.setTextSize(2, 15.0f);
                        button.setTypeface(button.getTypeface(), 1);
                        button.setAllCaps(false);
                        float d9 = mVar.d(10);
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setColor(-14235942);
                        gradientDrawable3.setCornerRadius(d9);
                        button.setBackground(gradientDrawable3);
                        button.setStateListAnimator(null);
                        button.setElevation(0.0f);
                        LinearLayout linearLayout2 = new LinearLayout(eVar.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                        linearLayout2.addView(textView);
                        linearLayout2.addView(textView2);
                        LinearLayout linearLayout3 = new LinearLayout(eVar.getContext());
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.addView(imageView);
                        linearLayout3.addView(linearLayout2);
                        linearLayout3.addView(textView3);
                        linearLayout.addView(linearLayout3);
                        linearLayout.addView(bVar);
                        linearLayout.addView(button);
                        eVar.addView(linearLayout);
                        String c5 = nativeAd.c();
                        if (c5 == null) {
                            c5 = "";
                        }
                        textView.setText(c5);
                        eVar.setHeadlineView(textView);
                        String a5 = nativeAd.a();
                        if (a5 == null) {
                            a5 = "";
                        }
                        if (a5.length() == 0) {
                            textView2.setVisibility(8);
                        } else {
                            textView2.setText(a5);
                            textView2.setVisibility(0);
                            eVar.setBodyView(textView2);
                        }
                        String b3 = nativeAd.b();
                        String str = b3 != null ? b3 : "";
                        if (str.length() == 0) {
                            button.setVisibility(8);
                        } else {
                            button.setText(str);
                            button.setVisibility(0);
                            eVar.setCallToActionView(button);
                        }
                        C1390oj d10 = nativeAd.d();
                        if (d10 == null) {
                            imageView.setVisibility(8);
                        } else {
                            imageView.setImageDrawable((Drawable) d10.f14828m);
                            imageView.setVisibility(0);
                            eVar.setIconView(imageView);
                        }
                        eVar.setMediaView(bVar);
                        eVar.setNativeAd(nativeAd);
                        frameLayout.addView(eVar, new FrameLayout.LayoutParams(-1, -2));
                    }
                }
                return W3.o.f6046a;
            case 2:
                ((C0327y) this.f4059l).z(obj);
                C2322H c2322h = (C2322H) this.f4060m;
                if (c2322h != null) {
                    c2322h.a(obj);
                }
                return W3.o.f6046a;
            case 3:
                F0 f02 = (F0) this.f4059l;
                Throwable th = (Throwable) this.f4060m;
                Throwable th2 = (Throwable) obj;
                synchronized (f02.f4291b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                AbstractC2425d.j(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    f02.f4293d = th;
                    M m5 = f02.f4307t;
                    EnumC0330z0 enumC0330z0 = EnumC0330z0.f4607k;
                    m5.getClass();
                    m5.j(null, enumC0330z0);
                }
                return W3.o.f6046a;
            case 4:
                P0.g gVar = (P0.g) obj;
                String str2 = ((P0.g) this.f4059l) == gVar ? " > " : "   ";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                ((v3.g) this.f4060m).getClass();
                if (gVar instanceof C0331a) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    C0331a c0331a = (C0331a) gVar;
                    sb.append(c0331a.f4621a.f2829l.length());
                    sb.append(", newCursorPosition=");
                    i = c0331a.f4622b;
                } else {
                    if (!(gVar instanceof u)) {
                        if (gVar instanceof t) {
                            concat = ((t) gVar).toString();
                        } else if (gVar instanceof C0335e) {
                            concat = ((C0335e) gVar).toString();
                        } else if (gVar instanceof P0.f) {
                            concat = ((P0.f) gVar).toString();
                        } else if (gVar instanceof v) {
                            concat = ((v) gVar).toString();
                        } else if (gVar instanceof P0.i) {
                            ((P0.i) gVar).getClass();
                            concat = "FinishComposingTextCommand()";
                        } else if (gVar instanceof C0334d) {
                            ((C0334d) gVar).getClass();
                            concat = "DeleteAllCommand()";
                        } else {
                            String b5 = x.a(gVar.getClass()).b();
                            if (b5 == null) {
                                b5 = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(b5);
                        }
                        sb2.append(concat);
                        return sb2.toString();
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    u uVar = (u) gVar;
                    sb.append(uVar.f4675a.f2829l.length());
                    sb.append(", newCursorPosition=");
                    i = uVar.f4676b;
                }
                concat = AbstractC2107A.t(sb, i, ')');
                sb2.append(concat);
                return sb2.toString();
            case 5:
                C0008h c0008h = (C0008h) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c0008h);
                ArrayList arrayList = (ArrayList) this.f4059l;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    W3.h hVar = (W3.h) obj2;
                    String str3 = (String) hVar.f6036k;
                    List list = (List) hVar.f6037l;
                    L1.a.h(c0008h, L1.a.m("hdr-", str3), new X.d(-578036774, new C0411n(2, str3, list), true), 2);
                    c0008h.a(list.size(), new C0028g0(23, new C0416t(1), list), new C0417u(2, list), new X.d(-632812321, new I(list, (i4.c) this.f4060m, 0), true));
                }
                return W3.o.f6046a;
            case 6:
                C0008h c0008h2 = (C0008h) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c0008h2);
                List<Integer> season_par_Choices = ((AquaSeasonChoiceUiState) ((InterfaceC0289e0) this.f4059l).getValue()).getSeason_par_Choices();
                c0008h2.a(season_par_Choices.size(), new C0417u(new C0416t(2), season_par_Choices), new C0417u(4, season_par_Choices), new X.d(-632812321, new I(season_par_Choices, (InterfaceC0289e0) this.f4060m, 1), true));
                return W3.o.f6046a;
            case 7:
                C0008h c0008h3 = (C0008h) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c0008h3);
                List<AquaCompetitionBundle> visib_par_leRows = ((AquaTournamentCatalogUiState) ((InterfaceC0289e0) this.f4059l).getValue()).getVisib_par_leRows();
                c0008h3.a(visib_par_leRows.size(), new C0028g0(26, new C0416t(4), visib_par_leRows), new C0417u(7, visib_par_leRows), new X.d(-632812321, new Y(visib_par_leRows, (i4.e) this.f4060m, 1), true));
                return W3.o.f6046a;
            case 8:
                C1919b c1919b = (C1919b) this.f4059l;
                C1905e c1905e = (C1905e) this.f4060m;
                c1919b.a(c1905e);
                return new C0025f0(7, c1919b, c1905e);
            case 9:
                C1919b c1919b2 = (C1919b) this.f4059l;
                d.i iVar = (d.i) this.f4060m;
                c1919b2.a(iVar);
                return new C0025f0(8, c1919b2, iVar);
            case 10:
                ((C2313c) this.f4059l).f18894m.removeCallbacks((D3.h) this.f4060m);
                return W3.o.f6046a;
            default:
                ((x4.b) this.f4060m).getClass();
                ((x4.c) this.f4059l).d(null);
                return W3.o.f6046a;
        }
    }
}
