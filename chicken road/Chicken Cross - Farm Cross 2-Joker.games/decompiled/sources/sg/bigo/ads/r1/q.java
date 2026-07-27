package sg.bigo.ads.r1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.C.t;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5151c0;
import sg.bigo.ads.h.C5168g1;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x1.w;

/* loaded from: classes3.dex */
public abstract class q extends FrameLayout implements a, sg.bigo.ads.R.a {

    /* renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.C1.a f13281a;
    public final Context b;
    public final sg.bigo.ads.R.b c;
    public final InterfaceC5087a d;
    public final ImageView e;
    public boolean f;
    public final ImageView g;
    public final p h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Context context, sg.bigo.ads.R.b bVar, InterfaceC5087a interfaceC5087a) {
        super(context);
        int i;
        this.f = true;
        o oVar = new o(this);
        this.h = new p(this);
        this.i = false;
        this.j = true;
        this.b = context;
        this.c = bVar;
        this.d = interfaceC5087a;
        if (!bVar.c) {
            int b = AbstractC4944a.b(context, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setOnClickListener(oVar);
            imageView.setPadding(b, b, b, b);
            int b2 = (b * 2) + AbstractC4944a.b(context, R.dimen.bigo_ad_volume_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2, 85);
            layoutParams.rightMargin = b;
            layoutParams.bottomMargin = b;
            imageView.setId(200011);
            imageView.setVisibility(0);
            X.a(imageView, this, layoutParams, -1);
        }
        int b3 = AbstractC4944a.b(context, R.dimen.bigo_ad_replay_size);
        if (interfaceC5087a != 0 && ((sg.bigo.ads.U0.b) interfaceC5087a).l == 2 && (i = sg.bigo.ads.R.b.f) > 0) {
            b3 = AbstractC4963u.a(context, i);
        }
        ImageView imageView2 = new ImageView(context);
        this.g = imageView2;
        imageView2.setImageDrawable(AbstractC4944a.c(context, R.drawable.bigo_ad_ic_media_play));
        X.a(imageView2, this, new FrameLayout.LayoutParams(b3, b3, 17), -1);
        setId(200012);
        setOnClickListener(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, int[] iArr) {
        t tVar;
        VideoController videoController;
        VideoController.VideoLifeCallback videoLifeCallback;
        sg.bigo.ads.N.j jVar;
        sg.bigo.ads.N.h hVar;
        InterfaceC5087a interfaceC5087a;
        boolean z;
        int i;
        sg.bigo.ads.C1.a aVar = this.f13281a;
        if (aVar != null) {
            tVar = ((sg.bigo.ads.C.m) aVar).f12233a;
            videoController = tVar.getVideoController();
            if (videoController != null) {
                videoLifeCallback = videoController.getVideoLifeCallback();
                jVar = videoController.getProgressChangeListener();
                hVar = videoController.getBackupLoadCallback();
            } else {
                videoLifeCallback = null;
                jVar = null;
                hVar = null;
            }
            interfaceC5087a = (InterfaceC5087a) tVar.k.f12482a;
            str.hashCode();
            switch (str) {
                case "AdClosed":
                    sg.bigo.ads.n1.o oVar = tVar.k0;
                    if (oVar != null) {
                        oVar.a(oVar.f13215a.e, "va_close");
                        break;
                    }
                    break;
                case "AdBackupImgReady":
                    if (hVar != null) {
                        if (iArr == null || iArr.length <= 0) {
                            z = false;
                            i = 0;
                        } else {
                            z = false;
                            i = iArr[0];
                        }
                        hVar.a(i == 0 ? z : true);
                        break;
                    }
                    break;
                case "AdLoaded":
                    sg.bigo.ads.n1.o oVar2 = tVar.k0;
                    if (oVar2 != null) {
                        oVar2.c = true;
                        break;
                    }
                    break;
                case "AdVideoBuffered":
                    if (videoLifeCallback instanceof sg.bigo.ads.api.c) {
                        ((sg.bigo.ads.api.c) videoLifeCallback).a();
                        break;
                    }
                    break;
                case "AdVideoComplete":
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onVideoEnd();
                    }
                    sg.bigo.ads.n1.o oVar3 = tVar.k0;
                    if (oVar3 != null) {
                        oVar3.a(oVar3.f13215a.d, "va_comp");
                        oVar3.a(oVar3.f13215a.b, "va_prog1");
                        oVar3.a(oVar3.f13215a.c, "va_prog2");
                        if (!oVar3.j) {
                            oVar3.j = true;
                            sg.bigo.ads.n1.o.a(interfaceC5087a, 6);
                            sg.bigo.ads.m1.c cVar = oVar3.g;
                            if (cVar != null) {
                                cVar.b(4);
                            }
                        }
                    }
                    if (tVar.c(((sg.bigo.ads.U0.b) interfaceC5087a).l) && videoController != null) {
                        videoController.play();
                        break;
                    }
                    break;
                case "AdVolumeChange":
                    if (iArr != null && iArr.length > 0) {
                        int i2 = iArr[0];
                        if (videoLifeCallback != null) {
                            videoLifeCallback.onMuteChange(i2 == 0);
                        }
                        sg.bigo.ads.n1.o oVar4 = tVar.k0;
                        if (oVar4 != null) {
                            sg.bigo.ads.n1.o.a(interfaceC5087a, i2 == 0 ? 7 : 17);
                            sg.bigo.ads.z1.p pVar = oVar4.f13215a;
                            if (pVar != null) {
                                Iterator it = pVar.g.iterator();
                                while (it.hasNext()) {
                                    sg.bigo.ads.z1.j jVar2 = (sg.bigo.ads.z1.j) it.next();
                                    if ((i2 == 0 && jVar2.e) || (i2 == 100 && !jVar2.e)) {
                                        oVar4.a(jVar2, "va_mst");
                                        it.remove();
                                    }
                                }
                            }
                            oVar4.h = i2 / 100 == 0;
                            sg.bigo.ads.m1.c cVar2 = oVar4.g;
                            if (cVar2 != null) {
                                float f = i2 / 100.0f;
                                MediaEvents mediaEvents = cVar2.c;
                                if (mediaEvents != null && cVar2.d) {
                                    mediaEvents.volumeChange(f);
                                    cVar2.f13123a.getAdSessionId();
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "AdSkipped":
                    sg.bigo.ads.n1.o oVar5 = tVar.k0;
                    if (oVar5 != null) {
                        oVar5.a(oVar5.f13215a.f, "va_skip");
                        sg.bigo.ads.m1.c cVar3 = oVar5.g;
                        if (cVar3 != null) {
                            cVar3.a(5);
                            break;
                        }
                    }
                    break;
                case "AdError":
                case "AdVideoTooLate":
                    sg.bigo.ads.n1.o oVar6 = tVar.k0;
                    if (oVar6 != null) {
                        ArrayList arrayList = oVar6.f13215a.k;
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                sg.bigo.ads.z1.n nVar = (sg.bigo.ads.z1.n) it2.next();
                                String str2 = nVar.f13447a;
                                if (I.a((CharSequence) str2) || (nVar.b && !nVar.c)) {
                                    AbstractC5496a.a("VASTController", "invalidate tracking url or is tracked");
                                } else {
                                    String a2 = sg.bigo.ads.n1.o.a(str2);
                                    String a3 = I.a((CharSequence) a2) ? "" : I.a(a2, "[ERRORCODE]", "400", false);
                                    nVar.b = true;
                                    if (!I.a((CharSequence) a3)) {
                                        sg.bigo.ads.x1.f fVar = oVar6.f;
                                        new w(fVar.g, fVar.e, fVar.h, "va_err", a3, nVar.d).a(oVar6.i, 0);
                                    }
                                }
                                it2.remove();
                            }
                        }
                        sg.bigo.ads.n1.o.a(interfaceC5087a, 16);
                        if (iArr != null) {
                            sg.bigo.ads.s1.b.a(tVar.k.f12482a, new AdError(2002, 0, "Video error: " + iArr[0]), tVar.t(), false);
                            C5168g1 c5168g1 = tVar.q0;
                            if (c5168g1 != null) {
                                int i3 = iArr[0];
                                AbstractC5151c0 abstractC5151c0 = c5168g1.f12887a.S;
                                if (abstractC5151c0 != null) {
                                    abstractC5151c0.Q();
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "AdVideoPaused":
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onVideoPause();
                    }
                    sg.bigo.ads.n1.o oVar7 = tVar.k0;
                    if (oVar7 != null) {
                        oVar7.d = true;
                        Iterator it3 = oVar7.f13215a.h.iterator();
                        while (it3.hasNext()) {
                            oVar7.a((sg.bigo.ads.z1.n) it3.next(), "va_pau");
                        }
                        sg.bigo.ads.m1.c cVar4 = oVar7.g;
                        if (cVar4 != null) {
                            cVar4.a(1);
                            break;
                        }
                    }
                    break;
                case "AdVideoStart":
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onVideoStart();
                        break;
                    }
                    break;
                case "AdVideoBuffering":
                    if (videoLifeCallback instanceof sg.bigo.ads.api.c) {
                        ((sg.bigo.ads.api.c) videoLifeCallback).b();
                        break;
                    }
                    break;
                case "AdVideoPlaying":
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onVideoPlay();
                    }
                    sg.bigo.ads.n1.o oVar8 = tVar.k0;
                    if (oVar8 != null && oVar8.d) {
                        oVar8.d = false;
                        Iterator it4 = oVar8.f13215a.i.iterator();
                        while (it4.hasNext()) {
                            oVar8.a((sg.bigo.ads.z1.n) it4.next(), "va_res");
                        }
                        sg.bigo.ads.m1.c cVar5 = oVar8.g;
                        if (cVar5 != null) {
                            cVar5.a(2);
                            break;
                        }
                    }
                    break;
                case "AdRemainingTimeChange":
                    if (iArr != null && iArr.length > 2) {
                        sg.bigo.ads.n1.o oVar9 = tVar.k0;
                        if (oVar9 != null && iArr.length > 2) {
                            int i4 = iArr[0];
                            int i5 = iArr[2];
                            Iterator it5 = oVar9.f13215a.b.iterator();
                            while (it5.hasNext()) {
                                sg.bigo.ads.z1.m mVar = (sg.bigo.ads.z1.m) it5.next();
                                if (i5 >= mVar.e) {
                                    oVar9.a(mVar, "va_prog1");
                                    it5.remove();
                                }
                            }
                            Iterator it6 = oVar9.f13215a.c.iterator();
                            while (it6.hasNext()) {
                                sg.bigo.ads.z1.d dVar = (sg.bigo.ads.z1.d) it6.next();
                                if (i4 >= dVar.e) {
                                    oVar9.a(dVar, "va_prog2");
                                    it6.remove();
                                }
                            }
                            Iterator it7 = oVar9.l.iterator();
                            while (it7.hasNext()) {
                                int intValue = ((Integer) it7.next()).intValue();
                                if (i4 >= intValue) {
                                    if (intValue == 2000) {
                                        intValue = 11;
                                    } else if (intValue == 3000) {
                                        intValue = 12;
                                    } else if (intValue == 5000) {
                                        intValue = 13;
                                    } else if (intValue == 8000) {
                                        intValue = 14;
                                    } else if (intValue == 10000) {
                                        intValue = 15;
                                    }
                                    sg.bigo.ads.n1.o.a(interfaceC5087a, intValue);
                                    it7.remove();
                                }
                            }
                            Iterator it8 = oVar9.k.iterator();
                            while (it8.hasNext()) {
                                int intValue2 = ((Integer) it8.next()).intValue();
                                if (i5 >= intValue2) {
                                    if (intValue2 == 0) {
                                        sg.bigo.ads.m1.c cVar6 = oVar9.g;
                                        if (cVar6 != null) {
                                            float f2 = oVar9.f13215a.s;
                                            float f3 = oVar9.h ? 0.0f : 1.0f;
                                            MediaEvents mediaEvents2 = cVar6.c;
                                            if (mediaEvents2 != null) {
                                                mediaEvents2.start(f2, f3);
                                                cVar6.d = true;
                                                cVar6.f13123a.getAdSessionId();
                                            }
                                        }
                                        intValue2 = 2;
                                    } else if (intValue2 == 25) {
                                        sg.bigo.ads.m1.c cVar7 = oVar9.g;
                                        if (cVar7 != null) {
                                            cVar7.b(1);
                                        }
                                        intValue2 = 3;
                                    } else if (intValue2 == 50) {
                                        sg.bigo.ads.m1.c cVar8 = oVar9.g;
                                        if (cVar8 != null) {
                                            cVar8.b(2);
                                        }
                                        intValue2 = 4;
                                    } else if (intValue2 == 75) {
                                        sg.bigo.ads.m1.c cVar9 = oVar9.g;
                                        if (cVar9 != null) {
                                            cVar9.b(3);
                                        }
                                        intValue2 = 5;
                                    }
                                    sg.bigo.ads.n1.o.a(interfaceC5087a, intValue2);
                                    it8.remove();
                                }
                            }
                        }
                        if (jVar != null) {
                            jVar.a(iArr[0], iArr[1]);
                            break;
                        }
                    }
                    break;
            }
        }
    }

    public abstract void b(boolean z);

    public abstract boolean d();

    public void e() {
        f();
    }

    public final void f() {
        if (d()) {
            if (getPlayStatus() == 2) {
                removeCallbacks(this.h);
                this.i = true;
                a();
                a(8);
                setPlayOrPauseViewHidden(false);
                ImageView imageView = this.g;
                if (imageView != null) {
                    imageView.setImageDrawable(AbstractC4944a.c(this.b, R.drawable.bigo_ad_ic_media_play));
                    return;
                }
                return;
            }
            removeCallbacks(this.h);
            if (this.i) {
                a(9);
            }
            b(false);
            this.g.setVisibility(0);
            setPlayOrPauseViewHidden(false);
            ImageView imageView2 = this.g;
            if (imageView2 != null) {
                imageView2.setImageDrawable(AbstractC4944a.c(this.b, R.drawable.bigo_ad_ic_media_pause));
            }
            postDelayed(this.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.m);
        }
    }

    public abstract /* synthetic */ int getAdDuration();

    public abstract /* synthetic */ int getAdRemainingTime();

    public abstract /* synthetic */ int getPlayStatus();

    public abstract /* synthetic */ void setMute(boolean z);

    public void setNeedPauseWhenVisiblePercentEqual(boolean z) {
        this.f = z;
    }

    public void setOnEventListener(sg.bigo.ads.C1.a aVar) {
        this.f13281a = aVar;
    }

    public void setPlayOrPauseViewHidden(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 8 : 0);
        }
    }

    public void setStatPrepareEventOnce(boolean z) {
        this.j = z;
    }

    public void setVolumeViewHidden(boolean z) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(z ? 4 : 0);
        }
    }

    public final void a(String str, Object obj, int[] iArr) {
        sg.bigo.ads.C1.a aVar = this.f13281a;
        if (aVar != null) {
            t.a(((sg.bigo.ads.C.m) aVar).f12233a, str, obj, iArr);
        }
    }

    public final void a(boolean z) {
        if (z) {
            sg.bigo.ads.n1.q.f13217a.a(this);
            return;
        }
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        synchronized (rVar) {
            Iterator it = rVar.c.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    if (view == this) {
                        if (getPlayStatus() == 2) {
                            a();
                        }
                    }
                }
                it.remove();
            }
            rVar.c.size();
            if (rVar.c.isEmpty()) {
                rVar.b();
            }
        }
    }

    public final void a(int i) {
        InterfaceC5087a interfaceC5087a = this.d;
        if (interfaceC5087a != null) {
            sg.bigo.ads.s1.b.c(i, ((sg.bigo.ads.U0.k) this.d).F0, ((sg.bigo.ads.U0.k) interfaceC5087a).k(), interfaceC5087a);
        }
    }
}
