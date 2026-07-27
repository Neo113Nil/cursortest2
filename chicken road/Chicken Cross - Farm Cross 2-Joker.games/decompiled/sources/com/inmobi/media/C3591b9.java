package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3591b9 {

    /* renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f7027a;
    public final Oj b;
    public final Y9 c;
    public final CoroutineScope d;
    public final CoroutineScope e;
    public Job f;
    public final WeakReference g;
    public boolean h;
    public final HtmlVideoPlayerConfig i;
    public final C4043r8 j;
    public boolean k;
    public C4193wj l;
    public Cj m;
    public boolean n;
    public Ag o;
    public final AtomicReference p;

    public C3591b9(Ej renderView, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest videoRequestConfig, Cj cj, Oj oj, Y9 y9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(videoRequestConfig, "videoRequestConfig");
        this.f7027a = videoRequestConfig;
        this.b = oj;
        this.c = y9;
        C3563a9 c3563a9 = new C3563a9(CoroutineExceptionHandler.INSTANCE, this);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(c3563a9));
        this.d = CoroutineScope;
        this.e = AbstractC4012q5.a(CoroutineScope, c3563a9);
        this.g = new WeakReference(renderView.getContext());
        this.i = videoRequestConfig.getConfig();
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.j = new C4043r8(context, hybridNativeConfig, CoroutineScope, videoRequestConfig, y9);
        this.m = cj;
        this.p = new AtomicReference(Y8.f6968a);
    }

    public static /* synthetic */ boolean a(C3591b9 c3591b9, Y8[] y8Arr, String str, String str2, Y8 y8, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            y8 = null;
        }
        return c3591b9.a(y8Arr, str, str2, y8);
    }

    public final boolean b(boolean z) {
        Y8[] y8Arr = {Y8.c, Y8.e, Y8.f, Y8.g};
        G8[] g8Arr = G8.f6577a;
        if (!a(this, y8Arr, "executeVideoPlayerActions", z ? "show" : "hide", null, 8)) {
            return false;
        }
        C4043r8 c4043r8 = this.j;
        if (!c4043r8.h.get()) {
            if (z) {
                c4043r8.f();
            } else {
                c4043r8.g();
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                c4043r8.l.setVisibility(z ? 0 : 8);
            } else {
                BuildersKt__Builders_commonKt.launch$default(c4043r8.c, null, null, new C3590b8(null, c4043r8, z), 3, null);
            }
        }
        return true;
    }

    public final boolean a(Y8[] y8Arr, String str, String str2, Y8 y8) {
        Y8 y82 = (Y8) this.p.get();
        boolean z = false;
        if (ArraysKt.contains(y8Arr, y82)) {
            if (y8 != null && !a(y8, str, str2)) {
                z = true;
            }
            return !z;
        }
        if (str != null) {
            String format = String.format("Invalid state %s for %s. Allowed: %s", Arrays.copyOf(new Object[]{y82, str2, ArraysKt.joinToString$default(y8Arr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            a(str, format, str2);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r5 == com.inmobi.media.Y8.i) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r5 != com.inmobi.media.Y8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r5 != com.inmobi.media.Y8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r5 != com.inmobi.media.Y8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r5 == com.inmobi.media.Y8.i) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if (r5 != com.inmobi.media.Y8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0073, code lost:
    
        if (r5 != com.inmobi.media.Y8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007c, code lost:
    
        if (r5 != com.inmobi.media.Y8.i) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Y8 y8, String str, String str2) {
        Y9 y9;
        Y8 y82 = (Y8) this.p.get();
        if (y82 == y8) {
            return true;
        }
        Intrinsics.checkNotNull(y82);
        switch (y82.ordinal()) {
            case 0:
                if (y8 != Y8.b) {
                    break;
                }
                y9 = this.c;
                if (y9 != null) {
                    ((Z9) y9).a("HybridVideoPlayerHandler", "State transition: " + y82 + " -> " + y8 + " (cause=" + str2 + ")");
                }
                this.p.set(y8);
                return true;
            case 1:
                if (y8 != Y8.c) {
                    if (y8 != Y8.d) {
                        if (y8 != Y8.h) {
                            break;
                        }
                    }
                }
                y9 = this.c;
                if (y9 != null) {
                }
                this.p.set(y8);
                return true;
            case 2:
                if (y8 != Y8.e) {
                    if (y8 != Y8.f) {
                        if (y8 != Y8.i) {
                            break;
                        }
                    }
                }
                y9 = this.c;
                if (y9 != null) {
                }
                this.p.set(y8);
                return true;
            case 3:
                break;
            case 4:
                if (y8 != Y8.f) {
                    if (y8 != Y8.g) {
                        if (y8 != Y8.h) {
                            break;
                        }
                    }
                }
                y9 = this.c;
                if (y9 != null) {
                }
                this.p.set(y8);
                return true;
            case 5:
                if (y8 != Y8.e) {
                    if (y8 != Y8.i) {
                        break;
                    }
                }
                y9 = this.c;
                if (y9 != null) {
                }
                this.p.set(y8);
                return true;
            case 6:
                if (y8 != Y8.e) {
                    if (y8 != Y8.i) {
                        break;
                    }
                }
                y9 = this.c;
                if (y9 != null) {
                }
                this.p.set(y8);
                return true;
            case 7:
                break;
            case 8:
                if (str == null) {
                    return false;
                }
                String format = String.format("Illegal state transition from %s to %s for %s", Arrays.copyOf(new Object[]{y82, y8, str2 == null ? "state transition" : str2}, 3));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                a(str, format, str2);
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void a(String str, String str2, String str3) {
        Y9 y9 = this.c;
        if (y9 != null) {
            ((Z9) y9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        G8[] g8Arr = G8.f6577a;
        if (Intrinsics.areEqual(str, "unknown")) {
            return;
        }
        B8 obj = new B8(str3);
        Cj cj = this.m;
        if (cj != null) {
            V8 htmlVideoTemplateEvents = V8.e;
            Intrinsics.checkNotNullParameter(obj, "obj");
            JSONObject params = AbstractC3875lb.a(obj, B8.class);
            if (params == null) {
                params = new JSONObject();
            }
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            Intrinsics.checkNotNullParameter(params, "params");
            cj.f6496a.a("VideoCommandError", params);
        }
    }

    public final boolean a(boolean z) {
        Y8[] y8Arr = {Y8.c, Y8.e, Y8.f};
        G8[] g8Arr = G8.f6577a;
        if (!a(this, y8Arr, "executeVideoPlayerActions", z ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, null, 8)) {
            return false;
        }
        C4043r8 c4043r8 = this.j;
        if (!c4043r8.h.get()) {
            if (z) {
                C4182w8 c4182w8 = c4043r8.y;
                c4182w8.a();
                c4182w8.d.a();
            } else {
                C4182w8 c4182w82 = c4043r8.y;
                AbstractC4012q5.a(c4182w82.f7453a, new C4155v8(c4182w82, null));
            }
        }
        return true;
    }

    public final void a() {
        ViewGroup viewGroup;
        Object obj = this.p.get();
        Y8 y8 = Y8.i;
        if (obj == y8) {
            return;
        }
        G8[] g8Arr = G8.f6577a;
        a(y8, "executeVideoPlayerActions", (String) null);
        Y9 y9 = this.c;
        if (y9 != null) {
            ((Z9) y9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        C4043r8 c4043r8 = this.j;
        if (!c4043r8.h.getAndSet(true)) {
            Y9 y92 = c4043r8.b;
            if (y92 != null) {
                ((Z9) y92).a("HtmlMediaPlayer", "destroy called");
            }
            Job job = c4043r8.t;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            c4043r8.t = null;
            c4043r8.j.set(Kh.h);
            c4043r8.g.set(false);
            AbstractC4012q5.a(c4043r8.i);
            c4043r8.x.a();
            if (c4043r8.f.get()) {
                c4043r8.f.set(false);
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    BuildersKt__Builders_commonKt.launch$default(c4043r8.c, null, null, new C3902m8(null, c4043r8), 3, null);
                } else {
                    c4043r8.n.removeListener(c4043r8.B);
                }
            }
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(c4043r8.c, null, null, new C3872l8(null, c4043r8), 3, null);
            } else {
                c4043r8.n.stop();
                c4043r8.n.clearMediaItems();
                c4043r8.n.release();
                c4043r8.z.a();
                c4043r8.y.d.d();
            }
            c4043r8.l.setOnPositionChangeListener(null);
            C4099t8 c4099t8 = c4043r8.z.d;
            c4099t8.f = null;
            c4099t8.f7388a.setOnPositionChangeListener(null);
            c4043r8.l.removeAllViews();
            WeakReference weakReference = c4043r8.p;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(c4043r8.l);
            }
            WeakReference weakReference2 = c4043r8.p;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            CoroutineScopeKt.cancel$default(c4043r8.c, null, 1, null);
            CoroutineScopeKt.cancel$default(c4043r8.d, null, 1, null);
        }
        C4043r8 c4043r82 = this.j;
        c4043r82.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", c4043r82.n.getDuration());
        jSONObject.put("playbackTime", c4043r82.n.getCurrentPosition());
        jSONObject.put("bufferTime", c4043r82.n.getBufferedPosition());
        String durationPayload = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(durationPayload, "toString(...)");
        Oj oj = this.b;
        if (oj != null) {
            Intrinsics.checkNotNullParameter(durationPayload, "durationPayload");
            Map a2 = oj.a();
            a2.put("payload", durationPayload);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("VideoDestroyed", a2, EnumC3944nm.f7271a);
        }
        Cj cj = this.m;
        if (cj != null) {
            V8 htmlVideoTemplateEvents = V8.k;
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            cj.f6496a.a(htmlVideoTemplateEvents, (Object) null);
        }
        Job job2 = this.f;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f = null;
        this.l = null;
    }

    public final void a(AbstractC3691eo obj) {
        Oj oj;
        Cj cj;
        Cj cj2;
        C4193wj c4193wj;
        Cj cj3;
        Ag ag;
        Y9 y9 = this.c;
        if (y9 != null) {
            ((Z9) y9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + obj);
        }
        boolean z = obj instanceof Ko;
        if (z) {
            Cj cj4 = this.m;
            if (cj4 != null) {
                V8 htmlVideoTemplateEvents = V8.h;
                F8[] f8Arr = F8.f6552a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
                cj4.f6496a.a(htmlVideoTemplateEvents, "q1");
            }
        } else if (obj instanceof C4199wp) {
            Cj cj5 = this.m;
            if (cj5 != null) {
                V8 htmlVideoTemplateEvents2 = V8.h;
                F8[] f8Arr2 = F8.f6552a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents2, "htmlVideoTemplateEvents");
                cj5.f6496a.a(htmlVideoTemplateEvents2, "q2");
            }
        } else if (obj instanceof Fp) {
            Cj cj6 = this.m;
            if (cj6 != null) {
                V8 htmlVideoTemplateEvents3 = V8.h;
                F8[] f8Arr3 = F8.f6552a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents3, "htmlVideoTemplateEvents");
                cj6.f6496a.a(htmlVideoTemplateEvents3, "q3");
            }
        } else if (obj instanceof Lo) {
            Cj cj7 = this.m;
            if (cj7 != null) {
                V8 htmlVideoTemplateEvents4 = V8.h;
                F8[] f8Arr4 = F8.f6552a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents4, "htmlVideoTemplateEvents");
                cj7.f6496a.a(htmlVideoTemplateEvents4, "q4");
            }
        } else if (obj instanceof C3607bo) {
            if (a(Y8.g, (String) null, (String) null) && (cj3 = this.m) != null) {
                V8 htmlVideoTemplateEvents5 = V8.c;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents5, "htmlVideoTemplateEvents");
                cj3.f6496a.a(htmlVideoTemplateEvents5, (Object) null);
            }
        } else if (obj instanceof M8) {
            if (a(this, new Y8[]{Y8.b}, null, null, Y8.c, 6)) {
                C4193wj c4193wj2 = this.l;
                if (c4193wj2 != null) {
                    HtmlVideoPlaybackState obj2 = ((M8) obj).f6711a;
                    Intrinsics.checkNotNullParameter(obj2, "videoInfo");
                    Y9 y92 = c4193wj2.f7462a.i;
                    if (y92 != null) {
                        ((Z9) y92).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                    }
                    Ej ej = c4193wj2.f7462a;
                    V8 v8 = V8.b;
                    Intrinsics.checkNotNullParameter(obj2, "obj");
                    ej.a(v8, AbstractC3875lb.a(obj2, HtmlVideoPlaybackState.class));
                }
                if (this.n) {
                    this.j.f();
                }
            }
        } else if (obj instanceof H8) {
            if (a(this, new Y8[]{Y8.b}, null, null, Y8.d, 6) && (c4193wj = this.l) != null) {
                c4193wj.a((H8) obj);
            }
        } else if (obj instanceof O8) {
            a(Y8.h, (String) null, (String) null);
            Cj cj8 = this.m;
            if (cj8 != null) {
                V8 htmlVideoTemplateEvents6 = V8.d;
                Intrinsics.checkNotNullParameter(obj, "obj");
                JSONObject params = AbstractC3875lb.a(obj, obj.getClass());
                if (params == null) {
                    params = new JSONObject();
                }
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents6, "htmlVideoTemplateEvents");
                Intrinsics.checkNotNullParameter(params, "params");
                cj8.f6496a.a("VideoPlaybackError", params);
            }
        } else if (obj instanceof C3636cp) {
            Y8[] y8Arr = {Y8.e};
            Y8 y8 = Y8.f;
            a(this, y8Arr, null, null, y8, 6);
            if (this.p.get() == y8 && (cj2 = this.m) != null) {
                V8 htmlVideoTemplateEvents7 = V8.f;
                HtmlVideoPlaybackState obj3 = this.j.b();
                Intrinsics.checkNotNullParameter(obj3, "obj");
                JSONObject a2 = AbstractC3875lb.a(obj3, HtmlVideoPlaybackState.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents7, "htmlVideoTemplateEvents");
                cj2.f6496a.a(htmlVideoTemplateEvents7, a2);
            }
        } else if (obj instanceof C4172vp) {
            Y8[] y8Arr2 = {Y8.c, Y8.f, Y8.g};
            Y8 y82 = Y8.e;
            a(this, y8Arr2, null, null, y82, 6);
            if (this.p.get() == y82 && (cj = this.m) != null) {
                V8 htmlVideoTemplateEvents8 = V8.f;
                HtmlVideoPlaybackState obj4 = this.j.b();
                Intrinsics.checkNotNullParameter(obj4, "obj");
                JSONObject a3 = AbstractC3875lb.a(obj4, HtmlVideoPlaybackState.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents8, "htmlVideoTemplateEvents");
                cj.f6496a.a(htmlVideoTemplateEvents8, a3);
            }
        } else if (obj instanceof C4253yp) {
            Cj cj9 = this.m;
            if (cj9 != null) {
                V8 htmlVideoTemplateEvents9 = V8.h;
                F8[] f8Arr5 = F8.f6552a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents9, "htmlVideoTemplateEvents");
                cj9.f6496a.a(htmlVideoTemplateEvents9, "q0");
            }
        } else if (obj instanceof R8) {
            R8 r8 = (R8) obj;
            float f = r8.f6822a / 1000.0f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", Float.valueOf(f));
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, Float.valueOf(r8.b / 1000.0f));
            Cj cj10 = this.m;
            if (cj10 != null) {
                V8 htmlVideoTemplateEvents10 = V8.g;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents10, "htmlVideoTemplateEvents");
                cj10.f6496a.a(htmlVideoTemplateEvents10, jSONObject);
            }
        } else if (obj instanceof Q8) {
            VideoViewPosition obj5 = ((Q8) obj).f6797a;
            Intrinsics.checkNotNullParameter(obj5, "obj");
            JSONObject a4 = AbstractC3875lb.a(obj5, VideoViewPosition.class);
            Cj cj11 = this.m;
            if (cj11 != null) {
                V8 htmlVideoTemplateEvents11 = V8.m;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents11, "htmlVideoTemplateEvents");
                cj11.f6496a.a(htmlVideoTemplateEvents11, a4);
            }
            Cj cj12 = this.m;
            if (cj12 != null) {
                V8 htmlVideoTemplateEvents12 = V8.q;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents12, "htmlVideoTemplateEvents");
                cj12.f6496a.a(htmlVideoTemplateEvents12, a4);
            }
        } else if (obj instanceof D8) {
            Cj cj13 = this.m;
            if (cj13 != null) {
                V8 htmlVideoTemplateEvents13 = V8.p;
                VideoViewPosition obj6 = ((D8) obj).f6508a;
                Intrinsics.checkNotNullParameter(obj6, "obj");
                JSONObject a5 = AbstractC3875lb.a(obj6, VideoViewPosition.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents13, "htmlVideoTemplateEvents");
                cj13.f6496a.a(htmlVideoTemplateEvents13, a5);
            }
        } else if (obj instanceof A8) {
            Cj cj14 = this.m;
            if (cj14 != null) {
                V8 htmlVideoTemplateEvents14 = V8.n;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents14, "htmlVideoTemplateEvents");
                cj14.f6496a.a(htmlVideoTemplateEvents14, (Object) null);
            }
        } else if (obj instanceof N8) {
            Cj cj15 = this.m;
            if (cj15 != null) {
                V8 htmlVideoTemplateEvents15 = V8.o;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents15, "htmlVideoTemplateEvents");
                cj15.f6496a.a(htmlVideoTemplateEvents15, (Object) null);
            }
        } else if (obj instanceof C3866l2) {
            Cj cj16 = this.m;
            if (cj16 != null) {
                V8 htmlVideoTemplateEvents16 = V8.f;
                HtmlVideoPlaybackState obj7 = this.j.b();
                Intrinsics.checkNotNullParameter(obj7, "obj");
                JSONObject a6 = AbstractC3875lb.a(obj7, HtmlVideoPlaybackState.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents16, "htmlVideoTemplateEvents");
                cj16.f6496a.a(htmlVideoTemplateEvents16, a6);
            }
        } else if ((obj instanceof W8) && (oj = this.b) != null) {
            Map a7 = oj.a();
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("ViewStateOnParentAttached", a7, EnumC3944nm.f7271a);
        }
        if ((z || (obj instanceof C4199wp) || (obj instanceof Fp) || (obj instanceof C3607bo) || (obj instanceof C4253yp) || (obj instanceof C3636cp) || (obj instanceof C4172vp) || (obj instanceof O8) || (obj instanceof C3866l2)) && (ag = this.o) != null) {
            Intrinsics.checkNotNullParameter(obj, "videoEvent");
            Bf bf = ag.e;
            if (bf != null) {
                bf.a(obj);
            }
        }
    }
}
