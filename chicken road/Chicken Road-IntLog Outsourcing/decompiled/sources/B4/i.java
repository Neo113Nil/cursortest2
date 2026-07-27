package B4;

import B0.t;
import G0.F;
import N2.C0114e;
import N2.C0116g;
import N2.H;
import N2.I;
import N2.InterfaceC0115f;
import N2.J;
import N2.L;
import W.AbstractC0156a;
import W.C0157b;
import a0.C0175f;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.AbstractC0245o;
import androidx.lifecycle.AbstractServiceC0253x;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import b.C0257b;
import b.InterfaceC0259d;
import b1.C0265b;
import b1.C0267d;
import b1.C0273j;
import b1.C0274k;
import com.google.android.gms.internal.play_billing.C0338i;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import e4.InterfaceC0412a;
import f2.AbstractC0421e;
import g4.AbstractC0464i;
import g4.AbstractC0465j;
import g4.AbstractC0476u;
import h.AbstractC0477a;
import h2.C0482c;
import io.appmetrica.analytics.impl.C0793l9;
import io.flutter.embedding.engine.FlutterJNI;
import j5.v;
import j5.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import k1.C1206b;
import k4.InterfaceC1218d;
import l.q0;
import l4.EnumC1260a;
import o.BinderC1346a;
import o1.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;
import r.C1396f;
import s0.C1416d;
import t0.C1423b;
import u.C1472m;
import u.C1473n;
import v2.ThreadFactoryC1496a;
import w.AbstractC1504f;
import w.InterfaceC1500b;
import x.AbstractC1529d;
import y2.C1557b;
import y2.C1562g;

/* loaded from: classes.dex */
public final class i implements E0.a, H2.d, InterfaceC0115f, G4.d, X0.b, v, I1.c {

    /* renamed from: e, reason: collision with root package name */
    public static i f309e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310a;

    /* renamed from: b, reason: collision with root package name */
    public Object f311b;

    /* renamed from: c, reason: collision with root package name */
    public Object f312c;

    /* renamed from: d, reason: collision with root package name */
    public Object f313d;

    public /* synthetic */ i(int i2, boolean z) {
        this.f310a = i2;
    }

    public static i K() {
        if (f309e == null) {
            C1423b c1423b = new C1423b();
            ThreadFactoryC1496a threadFactoryC1496a = new ThreadFactoryC1496a();
            threadFactoryC1496a.f12094a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC1496a);
            FlutterJNI flutterJNI = new FlutterJNI();
            B2.e eVar = new B2.e();
            eVar.f251a = false;
            eVar.f252b = false;
            eVar.f256f = flutterJNI;
            eVar.f257g = newCachedThreadPool;
            i iVar = new i(28, false);
            iVar.f311b = eVar;
            iVar.f312c = c1423b;
            iVar.f313d = newCachedThreadPool;
            f309e = iVar;
        }
        return f309e;
    }

    public static i M(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public void A(int i2, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f312c).dispatchSemanticsAction(i2, dVar, serializable);
    }

    public void B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        HashMap hashMap = (HashMap) this.f312c;
        HashMap hashMap2 = (HashMap) this.f311b;
        U1.f fVar = new U1.f(byteArrayOutputStream, hashMap2, hashMap, (T1.a) this.f313d);
        R1.d dVar = (R1.d) hashMap2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new R1.b("No encoder for " + obj.getClass());
        }
    }

    public int C(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f313d;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0156a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public T D(String key, Class cls) {
        T viewModel;
        kotlin.jvm.internal.i.e(key, "key");
        Y y5 = (Y) this.f311b;
        y5.getClass();
        LinkedHashMap linkedHashMap = y5.f4563a;
        T t5 = (T) linkedHashMap.get(key);
        boolean isInstance = cls.isInstance(t5);
        W w3 = (W) this.f312c;
        if (!isInstance) {
            S.c cVar = new S.c((S.b) this.f313d);
            cVar.f2736a.put(U.f4559b, key);
            try {
                viewModel = w3.a(cls, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = w3.b(cls);
            }
            kotlin.jvm.internal.i.e(viewModel, "viewModel");
            T t6 = (T) linkedHashMap.put(key, viewModel);
            if (t6 != null) {
                t6.onCleared();
            }
            return viewModel;
        }
        P p5 = w3 instanceof P ? (P) w3 : null;
        if (p5 != null) {
            kotlin.jvm.internal.i.b(t5);
            AbstractC0245o abstractC0245o = p5.f4551d;
            if (abstractC0245o != null) {
                C0175f c0175f = p5.f4552e;
                kotlin.jvm.internal.i.b(c0175f);
                M.a(t5, c0175f, abstractC0245o);
            }
        }
        kotlin.jvm.internal.i.c(t5, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t5;
    }

    public ColorStateList E(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f312c;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            Object obj = AbstractC0477a.f5759a;
            ColorStateList colorStateList = ((Context) this.f311b).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public Drawable F(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f312c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0477a.a((Context) this.f311b, resourceId);
    }

    public Typeface G(int i2, int i3, G2.f fVar) {
        int i6 = 26;
        int resourceId = ((TypedArray) this.f312c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f313d) == null) {
            this.f313d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f313d;
        Object obj = AbstractC1504f.f12108a;
        Context context = (Context) this.f311b;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            fVar.a();
            return null;
        }
        int i7 = typedValue.assetCookie;
        C1396f c1396f = AbstractC1529d.f12237b;
        Typeface typeface = (Typeface) c1396f.a(AbstractC1529d.b(resources, resourceId, charSequence2, i7, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new B3.c(fVar, i6, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                InterfaceC1500b Y5 = K1.b.Y(resources.getXml(resourceId), resources);
                if (Y5 != null) {
                    return AbstractC1529d.a(context, Y5, resources, resourceId, charSequence2, typedValue.assetCookie, i3, fVar);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                fVar.a();
                return null;
            }
            int i8 = typedValue.assetCookie;
            Typeface i9 = AbstractC1529d.f12236a.i(context, resources, resourceId, charSequence2, i3);
            if (i9 != null) {
                c1396f.b(AbstractC1529d.b(resources, resourceId, charSequence2, i8, i3), i9);
            }
            if (i9 != null) {
                new Handler(Looper.getMainLooper()).post(new B3.c(fVar, i6, i9));
            } else {
                fVar.a();
            }
            return i9;
        } catch (IOException e3) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e3);
            fVar.a();
            return null;
        } catch (XmlPullParserException e6) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e6);
            fVar.a();
            return null;
        }
    }

    public View H(int i2) {
        return ((RecyclerView) ((U.e) this.f311b).f3053a).getChildAt(i2);
    }

    public int I() {
        return ((RecyclerView) ((U.e) this.f311b).f3053a).getChildCount();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(83:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(80:272|273|(1:24)|25|26|27|(1:29)|269|31|32|(3:244|245|(75:247|(67:249|(1:251)|35|(1:37)|38|(1:40)|41|(58:43|(1:229)|47|(1:49)|50|(1:52)(2:219|(1:224)(1:223))|(1:54)|55|(1:57)(5:207|(1:209)|210|(1:212)(1:218)|(1:214)(2:215|(1:217)))|58|(1:60)(6:189|(4:192|(2:200|201)(1:198)|199|190)|202|203|(1:205)|206)|61|(1:63)(1:188)|(1:65)|66|(41:184|185|(1:72)|73|(1:75)|76|(35:175|(1:179)|(1:80)|81|(31:170|(1:174)|(1:85)|86|(27:167|(1:169)|(1:90)|91|(23:163|164|(1:95)|96|(3:153|154|(20:156|(1:158)|159|(1:100)|101|(4:138|139|140|(2:142|(14:144|(3:105|(1:110)(1:108)|109)|111|(1:113)|114|(1:116)|117|(1:137)|119|(4:126|127|(1:129)(1:132)|130)|121|(1:123)|124|125)(2:145|146))(2:147|148))|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)(2:160|161))|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|68|(41:180|181|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|70|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|230|(2:239|240)|(1:238)(1:237)|47|(0)|50|(0)(0)|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|(0)|66|(0)|68|(0)|70|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|252|(70:254|(1:256)|35|(0)|38|(0)|41|(0)|230|(1:232)|239|240|(1:235)|238|47|(0)|50|(0)(0)|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|(0)|66|(0)|68|(0)|70|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)(1:265)|257|(3:259|(1:261)(1:263)|262)|264|35|(0)|38|(0)|41|(0)|230|(0)|239|240|(0)|238|47|(0)|50|(0)(0)|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|(0)|66|(0)|68|(0)|70|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125))|34|35|(0)|38|(0)|41|(0)|230|(0)|239|240|(0)|238|47|(0)|50|(0)(0)|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|(0)|66|(0)|68|(0)|70|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125)|22|(0)|25|26|27|(0)|269|31|32|(0)|34|35|(0)|38|(0)|41|(0)|230|(0)|239|240|(0)|238|47|(0)|50|(0)(0)|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|(0)|66|(0)|68|(0)|70|(0)|73|(0)|76|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|98|(0)|101|(0)|103|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|(0)|124|125) */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0204, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0205, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x00c4, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0481 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd A[Catch: NameNotFoundException -> 0x00c3, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x00c3, blocks: (B:27:0x00b7, B:29:0x00bd), top: B:26:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean J() {
        f2.n nVar;
        FirebaseMessagingService firebaseMessagingService;
        V0.j jVar;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String H5;
        String H6;
        String J4;
        int i2;
        int i3;
        String J5;
        Uri defaultUri;
        String J6;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String J7;
        Integer valueOf;
        String J8;
        Integer F2;
        Integer F5;
        Integer F6;
        String J9;
        Long valueOf2;
        JSONArray G5;
        long[] jArr;
        JSONArray G6;
        int[] iArr;
        String J10;
        IconCompat iconCompat;
        boolean z;
        int i6;
        ApplicationInfo applicationInfo;
        if (((V0.j) this.f313d).E("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f312c;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String J11 = ((V0.j) this.f313d).J("gcm.n.image");
        if (!TextUtils.isEmpty(J11)) {
            try {
                nVar = new f2.n(new URL(J11));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + J11);
            }
            if (nVar != null) {
                ExecutorService executorService = (ExecutorService) this.f311b;
                I1.h hVar = new I1.h();
                nVar.f5621b = executorService.submit(new B3.c(nVar, 14, hVar));
                nVar.f5622c = hVar.f1248a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f312c;
            jVar = (V0.j) this.f313d;
            AtomicInteger atomicInteger = AbstractC0421e.f5599a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String J12 = jVar.J("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(J12)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(J12);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + J12 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        u.p pVar = new u.p(firebaseMessagingService, J12);
                        H5 = jVar.H(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(H5)) {
                            pVar.f12008e = u.p.b(H5);
                        }
                        H6 = jVar.H(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(H6)) {
                            pVar.f12009f = u.p.b(H6);
                            C1473n c1473n = new C1473n(0);
                            c1473n.f12003f = u.p.b(H6);
                            pVar.g(c1473n);
                        }
                        J4 = jVar.J("gcm.n.icon");
                        if (!TextUtils.isEmpty(J4)) {
                            i3 = resources.getIdentifier(J4, "drawable", packageName);
                            if ((i3 == 0 || !AbstractC0421e.a(resources, i3)) && ((i3 = resources.getIdentifier(J4, "mipmap", packageName)) == 0 || !AbstractC0421e.a(resources, i3))) {
                                Log.w("FirebaseMessaging", "Icon resource " + J4 + " not found. Notification will use default icon.");
                            }
                            pVar.f12025v.icon = i3;
                            J5 = jVar.J("gcm.n.sound2");
                            if (TextUtils.isEmpty(J5)) {
                                J5 = jVar.J("gcm.n.sound");
                            }
                            if (!TextUtils.isEmpty(J5)) {
                                defaultUri = null;
                            } else if ("default".equals(J5) || resources.getIdentifier(J5, "raw", packageName) == 0) {
                                defaultUri = RingtoneManager.getDefaultUri(2);
                            } else {
                                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + J5);
                            }
                            if (defaultUri != null) {
                                pVar.f(defaultUri);
                            }
                            J6 = jVar.J("gcm.n.click_action");
                            if (TextUtils.isEmpty(J6)) {
                                launchIntentForPackage = new Intent(J6);
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setFlags(268435456);
                            } else {
                                String J13 = jVar.J("gcm.n.link_android");
                                if (TextUtils.isEmpty(J13)) {
                                    J13 = jVar.J("gcm.n.link");
                                }
                                Uri parse = !TextUtils.isEmpty(J13) ? Uri.parse(J13) : null;
                                if (parse != null) {
                                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setData(parse);
                                } else {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                    if (launchIntentForPackage == null) {
                                        Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                }
                            }
                            AtomicInteger atomicInteger2 = AbstractC0421e.f5599a;
                            if (launchIntentForPackage != null) {
                                activity = null;
                            } else {
                                launchIntentForPackage.addFlags(67108864);
                                Bundle bundle3 = (Bundle) jVar.f3212b;
                                Bundle bundle4 = new Bundle(bundle3);
                                for (String str : bundle3.keySet()) {
                                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                        bundle4.remove(str);
                                    }
                                }
                                launchIntentForPackage.putExtras(bundle4);
                                if (jVar.E("google.c.a.e")) {
                                    launchIntentForPackage.putExtra("gcm.n.analytics_data", jVar.N());
                                }
                                activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                            }
                            pVar.f12010g = activity;
                            broadcast = jVar.E("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(jVar.N())), 1140850688);
                            if (broadcast != null) {
                                pVar.f12025v.deleteIntent = broadcast;
                            }
                            J7 = jVar.J("gcm.n.color");
                            if (!TextUtils.isEmpty(J7)) {
                                try {
                                    valueOf = Integer.valueOf(Color.parseColor(J7));
                                } catch (IllegalArgumentException unused2) {
                                    Log.w("FirebaseMessaging", "Color is invalid: " + J7 + ". Notification will use default color.");
                                }
                                if (valueOf != null) {
                                    pVar.f12020q = valueOf.intValue();
                                }
                                pVar.d(16, !jVar.E("gcm.n.sticky"));
                                pVar.f12018o = jVar.E("gcm.n.local_only");
                                J8 = jVar.J("gcm.n.ticker");
                                if (J8 != null) {
                                    pVar.f12025v.tickerText = u.p.b(J8);
                                }
                                F2 = jVar.F("gcm.n.notification_priority");
                                if (F2 != null) {
                                    if (F2.intValue() < -2 || F2.intValue() > 2) {
                                        Log.w("FirebaseMessaging", "notificationPriority is invalid " + F2 + ". Skipping setting notificationPriority.");
                                    }
                                    if (F2 != null) {
                                        pVar.f12013j = F2.intValue();
                                    }
                                    F5 = jVar.F("gcm.n.visibility");
                                    if (F5 != null) {
                                        if (F5.intValue() < -1 || F5.intValue() > 1) {
                                            Log.w("NotificationParams", "visibility is invalid: " + F5 + ". Skipping setting visibility.");
                                        }
                                        if (F5 != null) {
                                            pVar.f12021r = F5.intValue();
                                        }
                                        F6 = jVar.F("gcm.n.notification_count");
                                        if (F6 != null) {
                                            if (F6.intValue() < 0) {
                                                Log.w("FirebaseMessaging", "notificationCount is invalid: " + F6 + ". Skipping setting notificationCount.");
                                            }
                                            if (F6 != null) {
                                                pVar.f12012i = F6.intValue();
                                            }
                                            J9 = jVar.J("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(J9)) {
                                                try {
                                                    valueOf2 = Long.valueOf(Long.parseLong(J9));
                                                } catch (NumberFormatException unused3) {
                                                    Log.w("NotificationParams", "Couldn't parse value of " + V0.j.S("gcm.n.event_time") + "(" + J9 + ") into a long");
                                                }
                                                if (valueOf2 != null) {
                                                    pVar.f12014k = true;
                                                    pVar.f12025v.when = valueOf2.longValue();
                                                }
                                                G5 = jVar.G("gcm.n.vibrate_timings");
                                                if (G5 != null) {
                                                    try {
                                                    } catch (NumberFormatException | JSONException unused4) {
                                                        Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + G5 + ". Skipping setting vibrateTimings.");
                                                    }
                                                    if (G5.length() <= 1) {
                                                        throw new JSONException("vibrateTimings have invalid length");
                                                    }
                                                    int length = G5.length();
                                                    jArr = new long[length];
                                                    for (int i7 = 0; i7 < length; i7++) {
                                                        jArr[i7] = G5.optLong(i7);
                                                    }
                                                    if (jArr != null) {
                                                        pVar.f12025v.vibrate = jArr;
                                                    }
                                                    G6 = jVar.G("gcm.n.light_settings");
                                                    if (G6 != null) {
                                                        iArr = new int[3];
                                                        try {
                                                        } catch (IllegalArgumentException e3) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + G6 + ". " + e3.getMessage() + ". Skipping setting LightSettings");
                                                        } catch (JSONException unused5) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + G6 + ". Skipping setting LightSettings");
                                                        }
                                                        if (G6.length() != 3) {
                                                            throw new JSONException("lightSettings don't have all three fields");
                                                        }
                                                        int parseColor = Color.parseColor(G6.optString(0));
                                                        if (parseColor == -16777216) {
                                                            throw new IllegalArgumentException("Transparent color is invalid");
                                                        }
                                                        iArr[0] = parseColor;
                                                        iArr[1] = G6.optInt(1);
                                                        iArr[2] = G6.optInt(2);
                                                        if (iArr != null) {
                                                            int i8 = iArr[0];
                                                            int i9 = iArr[1];
                                                            int i10 = iArr[2];
                                                            Notification notification = pVar.f12025v;
                                                            notification.ledARGB = i8;
                                                            notification.ledOnMS = i9;
                                                            notification.ledOffMS = i10;
                                                            notification.flags = ((i9 == 0 || i10 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                        }
                                                        boolean E5 = jVar.E("gcm.n.default_sound");
                                                        boolean z5 = E5;
                                                        if (jVar.E("gcm.n.default_vibrate_timings")) {
                                                            z5 = (E5 ? 1 : 0) | 2;
                                                        }
                                                        int i11 = z5;
                                                        if (jVar.E("gcm.n.default_light_settings")) {
                                                            i11 = (z5 ? 1 : 0) | 4;
                                                        }
                                                        pVar.c(i11);
                                                        J10 = jVar.J("gcm.n.tag");
                                                        if (TextUtils.isEmpty(J10)) {
                                                            J10 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                        }
                                                        String str2 = J10;
                                                        if (nVar != null) {
                                                            try {
                                                                I1.o oVar = nVar.f5622c;
                                                                u.g(oVar);
                                                                Bitmap bitmap = (Bitmap) B0.f.a(oVar, 5L, TimeUnit.SECONDS);
                                                                pVar.e(bitmap);
                                                                C1472m c1472m = new C1472m();
                                                                if (bitmap == null) {
                                                                    iconCompat = null;
                                                                    z = true;
                                                                } else {
                                                                    z = true;
                                                                    iconCompat = new IconCompat(1);
                                                                    iconCompat.f4309b = bitmap;
                                                                }
                                                                c1472m.f11999e = iconCompat;
                                                                c1472m.f12000f = null;
                                                                c1472m.f12001g = z;
                                                                pVar.g(c1472m);
                                                            } catch (InterruptedException unused6) {
                                                                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                nVar.close();
                                                                Thread.currentThread().interrupt();
                                                            } catch (ExecutionException e6) {
                                                                Log.w("FirebaseMessaging", "Failed to download image: " + e6.getCause());
                                                            } catch (TimeoutException unused7) {
                                                                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                nVar.close();
                                                            }
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                            Log.d("FirebaseMessaging", "Showing notification");
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str2, 0, pVar.a());
                                                        return true;
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean E52 = jVar.E("gcm.n.default_sound");
                                                    boolean z52 = E52;
                                                    if (jVar.E("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i112 = z52;
                                                    if (jVar.E("gcm.n.default_light_settings")) {
                                                    }
                                                    pVar.c(i112);
                                                    J10 = jVar.J("gcm.n.tag");
                                                    if (TextUtils.isEmpty(J10)) {
                                                    }
                                                    String str22 = J10;
                                                    if (nVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str22, 0, pVar.a());
                                                    return true;
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                G6 = jVar.G("gcm.n.light_settings");
                                                if (G6 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean E522 = jVar.E("gcm.n.default_sound");
                                                boolean z522 = E522;
                                                if (jVar.E("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i1122 = z522;
                                                if (jVar.E("gcm.n.default_light_settings")) {
                                                }
                                                pVar.c(i1122);
                                                J10 = jVar.J("gcm.n.tag");
                                                if (TextUtils.isEmpty(J10)) {
                                                }
                                                String str222 = J10;
                                                if (nVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str222, 0, pVar.a());
                                                return true;
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            G5 = jVar.G("gcm.n.vibrate_timings");
                                            if (G5 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            G6 = jVar.G("gcm.n.light_settings");
                                            if (G6 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean E5222 = jVar.E("gcm.n.default_sound");
                                            boolean z5222 = E5222;
                                            if (jVar.E("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i11222 = z5222;
                                            if (jVar.E("gcm.n.default_light_settings")) {
                                            }
                                            pVar.c(i11222);
                                            J10 = jVar.J("gcm.n.tag");
                                            if (TextUtils.isEmpty(J10)) {
                                            }
                                            String str2222 = J10;
                                            if (nVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str2222, 0, pVar.a());
                                            return true;
                                        }
                                        F6 = null;
                                        if (F6 != null) {
                                        }
                                        J9 = jVar.J("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(J9)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        G5 = jVar.G("gcm.n.vibrate_timings");
                                        if (G5 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        G6 = jVar.G("gcm.n.light_settings");
                                        if (G6 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean E52222 = jVar.E("gcm.n.default_sound");
                                        boolean z52222 = E52222;
                                        if (jVar.E("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i112222 = z52222;
                                        if (jVar.E("gcm.n.default_light_settings")) {
                                        }
                                        pVar.c(i112222);
                                        J10 = jVar.J("gcm.n.tag");
                                        if (TextUtils.isEmpty(J10)) {
                                        }
                                        String str22222 = J10;
                                        if (nVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str22222, 0, pVar.a());
                                        return true;
                                    }
                                    F5 = null;
                                    if (F5 != null) {
                                    }
                                    F6 = jVar.F("gcm.n.notification_count");
                                    if (F6 != null) {
                                    }
                                    F6 = null;
                                    if (F6 != null) {
                                    }
                                    J9 = jVar.J("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(J9)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    G5 = jVar.G("gcm.n.vibrate_timings");
                                    if (G5 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    G6 = jVar.G("gcm.n.light_settings");
                                    if (G6 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean E522222 = jVar.E("gcm.n.default_sound");
                                    boolean z522222 = E522222;
                                    if (jVar.E("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i1122222 = z522222;
                                    if (jVar.E("gcm.n.default_light_settings")) {
                                    }
                                    pVar.c(i1122222);
                                    J10 = jVar.J("gcm.n.tag");
                                    if (TextUtils.isEmpty(J10)) {
                                    }
                                    String str222222 = J10;
                                    if (nVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str222222, 0, pVar.a());
                                    return true;
                                }
                                F2 = null;
                                if (F2 != null) {
                                }
                                F5 = jVar.F("gcm.n.visibility");
                                if (F5 != null) {
                                }
                                F5 = null;
                                if (F5 != null) {
                                }
                                F6 = jVar.F("gcm.n.notification_count");
                                if (F6 != null) {
                                }
                                F6 = null;
                                if (F6 != null) {
                                }
                                J9 = jVar.J("gcm.n.event_time");
                                if (!TextUtils.isEmpty(J9)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                G5 = jVar.G("gcm.n.vibrate_timings");
                                if (G5 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                G6 = jVar.G("gcm.n.light_settings");
                                if (G6 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean E5222222 = jVar.E("gcm.n.default_sound");
                                boolean z5222222 = E5222222;
                                if (jVar.E("gcm.n.default_vibrate_timings")) {
                                }
                                int i11222222 = z5222222;
                                if (jVar.E("gcm.n.default_light_settings")) {
                                }
                                pVar.c(i11222222);
                                J10 = jVar.J("gcm.n.tag");
                                if (TextUtils.isEmpty(J10)) {
                                }
                                String str2222222 = J10;
                                if (nVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str2222222, 0, pVar.a());
                                return true;
                            }
                            i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i6 != 0) {
                                try {
                                    valueOf = Integer.valueOf(v.b.a(firebaseMessagingService, i6));
                                } catch (Resources.NotFoundException unused8) {
                                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                }
                                if (valueOf != null) {
                                }
                                pVar.d(16, !jVar.E("gcm.n.sticky"));
                                pVar.f12018o = jVar.E("gcm.n.local_only");
                                J8 = jVar.J("gcm.n.ticker");
                                if (J8 != null) {
                                }
                                F2 = jVar.F("gcm.n.notification_priority");
                                if (F2 != null) {
                                }
                                F2 = null;
                                if (F2 != null) {
                                }
                                F5 = jVar.F("gcm.n.visibility");
                                if (F5 != null) {
                                }
                                F5 = null;
                                if (F5 != null) {
                                }
                                F6 = jVar.F("gcm.n.notification_count");
                                if (F6 != null) {
                                }
                                F6 = null;
                                if (F6 != null) {
                                }
                                J9 = jVar.J("gcm.n.event_time");
                                if (!TextUtils.isEmpty(J9)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                G5 = jVar.G("gcm.n.vibrate_timings");
                                if (G5 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                G6 = jVar.G("gcm.n.light_settings");
                                if (G6 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean E52222222 = jVar.E("gcm.n.default_sound");
                                boolean z52222222 = E52222222;
                                if (jVar.E("gcm.n.default_vibrate_timings")) {
                                }
                                int i112222222 = z52222222;
                                if (jVar.E("gcm.n.default_light_settings")) {
                                }
                                pVar.c(i112222222);
                                J10 = jVar.J("gcm.n.tag");
                                if (TextUtils.isEmpty(J10)) {
                                }
                                String str22222222 = J10;
                                if (nVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str22222222, 0, pVar.a());
                                return true;
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            pVar.d(16, !jVar.E("gcm.n.sticky"));
                            pVar.f12018o = jVar.E("gcm.n.local_only");
                            J8 = jVar.J("gcm.n.ticker");
                            if (J8 != null) {
                            }
                            F2 = jVar.F("gcm.n.notification_priority");
                            if (F2 != null) {
                            }
                            F2 = null;
                            if (F2 != null) {
                            }
                            F5 = jVar.F("gcm.n.visibility");
                            if (F5 != null) {
                            }
                            F5 = null;
                            if (F5 != null) {
                            }
                            F6 = jVar.F("gcm.n.notification_count");
                            if (F6 != null) {
                            }
                            F6 = null;
                            if (F6 != null) {
                            }
                            J9 = jVar.J("gcm.n.event_time");
                            if (!TextUtils.isEmpty(J9)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            G5 = jVar.G("gcm.n.vibrate_timings");
                            if (G5 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            G6 = jVar.G("gcm.n.light_settings");
                            if (G6 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean E522222222 = jVar.E("gcm.n.default_sound");
                            boolean z522222222 = E522222222;
                            if (jVar.E("gcm.n.default_vibrate_timings")) {
                            }
                            int i1122222222 = z522222222;
                            if (jVar.E("gcm.n.default_light_settings")) {
                            }
                            pVar.c(i1122222222);
                            J10 = jVar.J("gcm.n.tag");
                            if (TextUtils.isEmpty(J10)) {
                            }
                            String str222222222 = J10;
                            if (nVar != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str222222222, 0, pVar.a());
                            return true;
                        }
                        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i2 != 0 || !AbstractC0421e.a(resources, i2)) {
                            i2 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i3 = (i2 == 0 && AbstractC0421e.a(resources, i2)) ? i2 : 17301651;
                        pVar.f12025v.icon = i3;
                        J5 = jVar.J("gcm.n.sound2");
                        if (TextUtils.isEmpty(J5)) {
                        }
                        if (!TextUtils.isEmpty(J5)) {
                        }
                        if (defaultUri != null) {
                        }
                        J6 = jVar.J("gcm.n.click_action");
                        if (TextUtils.isEmpty(J6)) {
                        }
                        AtomicInteger atomicInteger22 = AbstractC0421e.f5599a;
                        if (launchIntentForPackage != null) {
                        }
                        pVar.f12010g = activity;
                        if (jVar.E("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        J7 = jVar.J("gcm.n.color");
                        if (!TextUtils.isEmpty(J7)) {
                        }
                        i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i6 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        pVar.d(16, !jVar.E("gcm.n.sticky"));
                        pVar.f12018o = jVar.E("gcm.n.local_only");
                        J8 = jVar.J("gcm.n.ticker");
                        if (J8 != null) {
                        }
                        F2 = jVar.F("gcm.n.notification_priority");
                        if (F2 != null) {
                        }
                        F2 = null;
                        if (F2 != null) {
                        }
                        F5 = jVar.F("gcm.n.visibility");
                        if (F5 != null) {
                        }
                        F5 = null;
                        if (F5 != null) {
                        }
                        F6 = jVar.F("gcm.n.notification_count");
                        if (F6 != null) {
                        }
                        F6 = null;
                        if (F6 != null) {
                        }
                        J9 = jVar.J("gcm.n.event_time");
                        if (!TextUtils.isEmpty(J9)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        G5 = jVar.G("gcm.n.vibrate_timings");
                        if (G5 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        G6 = jVar.G("gcm.n.light_settings");
                        if (G6 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean E5222222222 = jVar.E("gcm.n.default_sound");
                        boolean z5222222222 = E5222222222;
                        if (jVar.E("gcm.n.default_vibrate_timings")) {
                        }
                        int i11222222222 = z5222222222;
                        if (jVar.E("gcm.n.default_light_settings")) {
                        }
                        pVar.c(i11222222222);
                        J10 = jVar.J("gcm.n.tag");
                        if (TextUtils.isEmpty(J10)) {
                        }
                        String str2222222222 = J10;
                        if (nVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str2222222222, 0, pVar.a());
                        return true;
                    }
                    J12 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(J12)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(J12);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        u.p pVar2 = new u.p(firebaseMessagingService, J12);
                        H5 = jVar.H(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(H5)) {
                        }
                        H6 = jVar.H(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(H6)) {
                        }
                        J4 = jVar.J("gcm.n.icon");
                        if (!TextUtils.isEmpty(J4)) {
                        }
                        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i2 != 0) {
                        }
                        i2 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i2 == 0) {
                        }
                        pVar2.f12025v.icon = i3;
                        J5 = jVar.J("gcm.n.sound2");
                        if (TextUtils.isEmpty(J5)) {
                        }
                        if (!TextUtils.isEmpty(J5)) {
                        }
                        if (defaultUri != null) {
                        }
                        J6 = jVar.J("gcm.n.click_action");
                        if (TextUtils.isEmpty(J6)) {
                        }
                        AtomicInteger atomicInteger222 = AbstractC0421e.f5599a;
                        if (launchIntentForPackage != null) {
                        }
                        pVar2.f12010g = activity;
                        if (jVar.E("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        J7 = jVar.J("gcm.n.color");
                        if (!TextUtils.isEmpty(J7)) {
                        }
                        i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i6 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        pVar2.d(16, !jVar.E("gcm.n.sticky"));
                        pVar2.f12018o = jVar.E("gcm.n.local_only");
                        J8 = jVar.J("gcm.n.ticker");
                        if (J8 != null) {
                        }
                        F2 = jVar.F("gcm.n.notification_priority");
                        if (F2 != null) {
                        }
                        F2 = null;
                        if (F2 != null) {
                        }
                        F5 = jVar.F("gcm.n.visibility");
                        if (F5 != null) {
                        }
                        F5 = null;
                        if (F5 != null) {
                        }
                        F6 = jVar.F("gcm.n.notification_count");
                        if (F6 != null) {
                        }
                        F6 = null;
                        if (F6 != null) {
                        }
                        J9 = jVar.J("gcm.n.event_time");
                        if (!TextUtils.isEmpty(J9)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        G5 = jVar.G("gcm.n.vibrate_timings");
                        if (G5 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        G6 = jVar.G("gcm.n.light_settings");
                        if (G6 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean E52222222222 = jVar.E("gcm.n.default_sound");
                        boolean z52222222222 = E52222222222;
                        if (jVar.E("gcm.n.default_vibrate_timings")) {
                        }
                        int i112222222222 = z52222222222;
                        if (jVar.E("gcm.n.default_light_settings")) {
                        }
                        pVar2.c(i112222222222);
                        J10 = jVar.J("gcm.n.tag");
                        if (TextUtils.isEmpty(J10)) {
                        }
                        String str22222222222 = J10;
                        if (nVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str22222222222, 0, pVar2.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(W1.h.d(string));
                    }
                    J12 = "fcm_fallback_notification_channel";
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    u.p pVar22 = new u.p(firebaseMessagingService, J12);
                    H5 = jVar.H(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(H5)) {
                    }
                    H6 = jVar.H(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(H6)) {
                    }
                    J4 = jVar.J("gcm.n.icon");
                    if (!TextUtils.isEmpty(J4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i2 != 0) {
                    }
                    i2 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i2 == 0) {
                    }
                    pVar22.f12025v.icon = i3;
                    J5 = jVar.J("gcm.n.sound2");
                    if (TextUtils.isEmpty(J5)) {
                    }
                    if (!TextUtils.isEmpty(J5)) {
                    }
                    if (defaultUri != null) {
                    }
                    J6 = jVar.J("gcm.n.click_action");
                    if (TextUtils.isEmpty(J6)) {
                    }
                    AtomicInteger atomicInteger2222 = AbstractC0421e.f5599a;
                    if (launchIntentForPackage != null) {
                    }
                    pVar22.f12010g = activity;
                    if (jVar.E("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    J7 = jVar.J("gcm.n.color");
                    if (!TextUtils.isEmpty(J7)) {
                    }
                    i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i6 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    pVar22.d(16, !jVar.E("gcm.n.sticky"));
                    pVar22.f12018o = jVar.E("gcm.n.local_only");
                    J8 = jVar.J("gcm.n.ticker");
                    if (J8 != null) {
                    }
                    F2 = jVar.F("gcm.n.notification_priority");
                    if (F2 != null) {
                    }
                    F2 = null;
                    if (F2 != null) {
                    }
                    F5 = jVar.F("gcm.n.visibility");
                    if (F5 != null) {
                    }
                    F5 = null;
                    if (F5 != null) {
                    }
                    F6 = jVar.F("gcm.n.notification_count");
                    if (F6 != null) {
                    }
                    F6 = null;
                    if (F6 != null) {
                    }
                    J9 = jVar.J("gcm.n.event_time");
                    if (!TextUtils.isEmpty(J9)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    G5 = jVar.G("gcm.n.vibrate_timings");
                    if (G5 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    G6 = jVar.G("gcm.n.light_settings");
                    if (G6 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean E522222222222 = jVar.E("gcm.n.default_sound");
                    boolean z522222222222 = E522222222222;
                    if (jVar.E("gcm.n.default_vibrate_timings")) {
                    }
                    int i1122222222222 = z522222222222;
                    if (jVar.E("gcm.n.default_light_settings")) {
                    }
                    pVar22.c(i1122222222222);
                    J10 = jVar.J("gcm.n.tag");
                    if (TextUtils.isEmpty(J10)) {
                    }
                    String str222222222222 = J10;
                    if (nVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str222222222222, 0, pVar22.a());
                    return true;
                }
            }
            J12 = null;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            u.p pVar222 = new u.p(firebaseMessagingService, J12);
            H5 = jVar.H(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(H5)) {
            }
            H6 = jVar.H(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(H6)) {
            }
            J4 = jVar.J("gcm.n.icon");
            if (!TextUtils.isEmpty(J4)) {
            }
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i2 != 0) {
            }
            i2 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i2 == 0) {
            }
            pVar222.f12025v.icon = i3;
            J5 = jVar.J("gcm.n.sound2");
            if (TextUtils.isEmpty(J5)) {
            }
            if (!TextUtils.isEmpty(J5)) {
            }
            if (defaultUri != null) {
            }
            J6 = jVar.J("gcm.n.click_action");
            if (TextUtils.isEmpty(J6)) {
            }
            AtomicInteger atomicInteger22222 = AbstractC0421e.f5599a;
            if (launchIntentForPackage != null) {
            }
            pVar222.f12010g = activity;
            if (jVar.E("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            J7 = jVar.J("gcm.n.color");
            if (!TextUtils.isEmpty(J7)) {
            }
            i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i6 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            pVar222.d(16, !jVar.E("gcm.n.sticky"));
            pVar222.f12018o = jVar.E("gcm.n.local_only");
            J8 = jVar.J("gcm.n.ticker");
            if (J8 != null) {
            }
            F2 = jVar.F("gcm.n.notification_priority");
            if (F2 != null) {
            }
            F2 = null;
            if (F2 != null) {
            }
            F5 = jVar.F("gcm.n.visibility");
            if (F5 != null) {
            }
            F5 = null;
            if (F5 != null) {
            }
            F6 = jVar.F("gcm.n.notification_count");
            if (F6 != null) {
            }
            F6 = null;
            if (F6 != null) {
            }
            J9 = jVar.J("gcm.n.event_time");
            if (!TextUtils.isEmpty(J9)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            G5 = jVar.G("gcm.n.vibrate_timings");
            if (G5 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            G6 = jVar.G("gcm.n.light_settings");
            if (G6 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean E5222222222222 = jVar.E("gcm.n.default_sound");
            boolean z5222222222222 = E5222222222222;
            if (jVar.E("gcm.n.default_vibrate_timings")) {
            }
            int i11222222222222 = z5222222222222;
            if (jVar.E("gcm.n.default_light_settings")) {
            }
            pVar222.c(i11222222222222);
            J10 = jVar.J("gcm.n.tag");
            if (TextUtils.isEmpty(J10)) {
            }
            String str2222222222222 = J10;
            if (nVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str2222222222222, 0, pVar222.a());
            return true;
        }
        nVar = null;
        if (nVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f312c;
        jVar = (V0.j) this.f313d;
        AtomicInteger atomicInteger3 = AbstractC0421e.f5599a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String J122 = jVar.J("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        J122 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        u.p pVar2222 = new u.p(firebaseMessagingService, J122);
        H5 = jVar.H(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(H5)) {
        }
        H6 = jVar.H(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(H6)) {
        }
        J4 = jVar.J("gcm.n.icon");
        if (!TextUtils.isEmpty(J4)) {
        }
        i2 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i2 != 0) {
        }
        i2 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i2 == 0) {
        }
        pVar2222.f12025v.icon = i3;
        J5 = jVar.J("gcm.n.sound2");
        if (TextUtils.isEmpty(J5)) {
        }
        if (!TextUtils.isEmpty(J5)) {
        }
        if (defaultUri != null) {
        }
        J6 = jVar.J("gcm.n.click_action");
        if (TextUtils.isEmpty(J6)) {
        }
        AtomicInteger atomicInteger222222 = AbstractC0421e.f5599a;
        if (launchIntentForPackage != null) {
        }
        pVar2222.f12010g = activity;
        if (jVar.E("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        J7 = jVar.J("gcm.n.color");
        if (!TextUtils.isEmpty(J7)) {
        }
        i6 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i6 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        pVar2222.d(16, !jVar.E("gcm.n.sticky"));
        pVar2222.f12018o = jVar.E("gcm.n.local_only");
        J8 = jVar.J("gcm.n.ticker");
        if (J8 != null) {
        }
        F2 = jVar.F("gcm.n.notification_priority");
        if (F2 != null) {
        }
        F2 = null;
        if (F2 != null) {
        }
        F5 = jVar.F("gcm.n.visibility");
        if (F5 != null) {
        }
        F5 = null;
        if (F5 != null) {
        }
        F6 = jVar.F("gcm.n.notification_count");
        if (F6 != null) {
        }
        F6 = null;
        if (F6 != null) {
        }
        J9 = jVar.J("gcm.n.event_time");
        if (!TextUtils.isEmpty(J9)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        G5 = jVar.G("gcm.n.vibrate_timings");
        if (G5 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        G6 = jVar.G("gcm.n.light_settings");
        if (G6 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean E52222222222222 = jVar.E("gcm.n.default_sound");
        boolean z52222222222222 = E52222222222222;
        if (jVar.E("gcm.n.default_vibrate_timings")) {
        }
        int i112222222222222 = z52222222222222;
        if (jVar.E("gcm.n.default_light_settings")) {
        }
        pVar2222.c(i112222222222222);
        J10 = jVar.J("gcm.n.tag");
        if (TextUtils.isEmpty(J10)) {
        }
        String str22222222222222 = J10;
        if (nVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f312c).getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(str22222222222222, 0, pVar2222.a());
        return true;
    }

    public void L(Uri uri, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        try {
            ((C0257b) ((InterfaceC0259d) this.f311b)).b((BinderC1346a) this.f312c, uri, bundle, arrayList);
        } catch (RemoteException unused) {
        }
    }

    public void N(Activity activity, m0.k kVar) {
        kotlin.jvm.internal.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f312c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f313d;
        try {
            if (kVar.equals((m0.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((p0.l) ((U.e) this.f311b).f3053a).f11637b.iterator();
            while (it.hasNext()) {
                p0.k kVar2 = (p0.k) it.next();
                if (kVar2.f11631a.equals(activity)) {
                    kVar2.f11633c = kVar;
                    kVar2.f11632b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void O(EnumC0243m enumC0243m) {
        S s2 = (S) this.f313d;
        if (s2 != null) {
            s2.run();
        }
        S s4 = new S((C0252w) this.f311b, enumC0243m);
        this.f313d = s4;
        ((Handler) this.f312c).postAtFrontOfQueue(s4);
    }

    public void P() {
        ((TypedArray) this.f312c).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f753b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f753b = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Q(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            AbstractC0156a instance = (AbstractC0156a) arrayList.get(i2);
            instance.getClass();
            F f3 = (F) this.f311b;
            f3.getClass();
            kotlin.jvm.internal.i.e(instance, "instance");
            int i3 = f3.f753b;
            int i6 = 0;
            while (true) {
                Object[] objArr = (Object[]) f3.f754c;
                if (i6 >= i3) {
                    break;
                } else {
                    if (objArr[i6] == instance) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i6++;
                }
            }
        }
        arrayList.clear();
    }

    public void R(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f311b = str;
    }

    public void S(long j2, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        ((B0.q) this.f312c).f179g = timeUnit.toMillis(j2);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((B0.q) this.f312c).f179g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public void T(t tVar) {
        ((H2.f) this.f311b).i((String) this.f312c, tVar == null ? null : new i(this, tVar));
    }

    public Bundle U() {
        Bundle bundle = new Bundle();
        Integer num = (Integer) this.f311b;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) this.f312c;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) this.f313d;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    @Override // N2.InterfaceC0115f
    public void b(String str, List list, C0116g c0116g) {
        y(c0116g).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((W1.e) this.f313d).o(list))).apply();
    }

    @Override // N2.InterfaceC0115f
    public Long c(String str, C0116g c0116g) {
        long j2;
        SharedPreferences y5 = y(c0116g);
        if (!y5.contains(str)) {
            return null;
        }
        try {
            j2 = y5.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = y5.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    @Override // N2.InterfaceC0115f
    public void d(String str, String str2, C0116g c0116g) {
        y(c0116g).edit().putString(str, str2).apply();
    }

    @Override // N2.InterfaceC0115f
    public Map e(List list, C0116g c0116g) {
        Object value;
        Map<String, ?> all = y(c0116g).getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (I.b(entry.getKey(), entry.getValue(), list != null ? AbstractC0465j.X0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = I.c(value, (W1.e) this.f313d);
                kotlin.jvm.internal.i.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // N2.InterfaceC0115f
    public Boolean f(String str, C0116g c0116g) {
        SharedPreferences y5 = y(c0116g);
        if (y5.contains(str)) {
            return Boolean.valueOf(y5.getBoolean(str, true));
        }
        return null;
    }

    @Override // N2.InterfaceC0115f
    public void g(String str, String str2, C0116g c0116g) {
        y(c0116g).edit().putString(str, str2).apply();
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        switch (this.f310a) {
            case 11:
                return new V0.o(new W1.e(), new l1.j(22), (a1.d) ((B.d) this.f311b).get(), (C0273j) ((q0) this.f312c).get(), (C0274k) ((B0.n) this.f313d).get());
            default:
                return new C0267d((Context) ((V0.j) this.f311b).f3212b, (c1.d) ((InterfaceC0412a) this.f312c).get(), (C0265b) ((W1.e) this.f313d).get());
        }
    }

    @Override // N2.InterfaceC0115f
    public List h(List list, C0116g c0116g) {
        Map<String, ?> all = y(c0116g).getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            kotlin.jvm.internal.i.d(key, "<get-key>(...)");
            if (I.b(key, entry.getValue(), list != null ? AbstractC0465j.X0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0465j.S0(linkedHashMap.keySet());
    }

    @Override // G4.d
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        Object i2 = ((G4.d) this.f311b).i(new G4.l(eVar, (P.d) this.f312c, (H) this.f313d), interfaceC1218d);
        return i2 == EnumC1260a.f11058a ? i2 : f4.v.f5689a;
    }

    @Override // N2.InterfaceC0115f
    public void j(String str, double d6, C0116g c0116g) {
        y(c0116g).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).apply();
    }

    @Override // N2.InterfaceC0115f
    public void k(List list, C0116g c0116g) {
        SharedPreferences y5 = y(c0116g);
        SharedPreferences.Editor edit = y5.edit();
        kotlin.jvm.internal.i.d(edit, "edit(...)");
        Map<String, ?> all = y5.getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (I.b(str, all.get(str), list != null ? AbstractC0465j.X0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.i.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // H2.d
    public void l(ByteBuffer byteBuffer, C1562g c1562g) {
        i iVar = (i) this.f313d;
        String str = ((H2.s) iVar.f313d).d(byteBuffer).f1146a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f312c;
        String str2 = (String) iVar.f312c;
        H2.s sVar = (H2.s) iVar.f313d;
        t tVar = (t) this.f311b;
        if (!equals) {
            if (!str.equals("cancel")) {
                c1562g.a(null);
                return;
            }
            if (((H2.g) atomicReference.getAndSet(null)) == null) {
                c1562g.a(sVar.c("error", "No active stream to cancel", null));
                return;
            }
            try {
                tVar.f208c = null;
                c1562g.a(sVar.a(null));
                return;
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e3);
                c1562g.a(sVar.c("error", e3.getMessage(), null));
                return;
            }
        }
        H2.g gVar = new H2.g(this);
        if (((H2.g) atomicReference.getAndSet(gVar)) != null) {
            try {
                tVar.f208c = null;
            } catch (RuntimeException e6) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e6);
            }
        }
        try {
            tVar.f208c = gVar;
            c1562g.a(sVar.a(null));
        } catch (RuntimeException e7) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e7);
            c1562g.a(sVar.c("error", e7.getMessage(), null));
        }
    }

    @Override // N2.InterfaceC0115f
    public void m(String str, long j2, C0116g c0116g) {
        y(c0116g).edit().putLong(str, j2).apply();
    }

    @Override // N2.InterfaceC0115f
    public Double n(String str, C0116g c0116g) {
        SharedPreferences y5 = y(c0116g);
        if (!y5.contains(str)) {
            return null;
        }
        Object c2 = I.c(y5.getString(str, ""), (W1.e) this.f313d);
        kotlin.jvm.internal.i.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c2;
    }

    @Override // I1.c
    public void onComplete(Task task) {
        C1206b c1206b = (C1206b) this.f311b;
        String str = (String) this.f312c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f313d;
        synchronized (c1206b.f10674a) {
            c1206b.f10674a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // N2.InterfaceC0115f
    public void p(String str, boolean z, C0116g c0116g) {
        y(c0116g).edit().putBoolean(str, z).apply();
    }

    @Override // j5.v
    public j5.u q() {
        return (j5.p) this.f313d;
    }

    @Override // N2.InterfaceC0115f
    public String r(String str, C0116g c0116g) {
        SharedPreferences y5 = y(c0116g);
        if (y5.contains(str)) {
            return y5.getString(str, "");
        }
        return null;
    }

    @Override // j5.v
    public w s() {
        return (j5.q) this.f312c;
    }

    @Override // N2.InterfaceC0115f
    public L t(String str, C0116g c0116g) {
        SharedPreferences y5 = y(c0116g);
        if (!y5.contains(str)) {
            return null;
        }
        String string = y5.getString(str, "");
        kotlin.jvm.internal.i.b(string);
        return r.O(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new L(string, J.f2069d) : r.O(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new L(null, J.f2068c) : new L(null, J.f2070e);
    }

    public String toString() {
        switch (this.f310a) {
            case 13:
                return ((C0157b) this.f312c).toString() + ", hidden list:" + ((ArrayList) this.f313d).size();
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f311b);
                sb.append('{');
                C0338i c0338i = ((C0338i) this.f312c).f5197b;
                String str = "";
                while (c0338i != null) {
                    Object obj = c0338i.f5196a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c0338i = c0338i.f5197b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // N2.InterfaceC0115f
    public ArrayList u(String str, C0116g c0116g) {
        List list;
        SharedPreferences y5 = y(c0116g);
        ArrayList arrayList = null;
        if (y5.contains(str)) {
            String string = y5.getString(str, "");
            kotlin.jvm.internal.i.b(string);
            if (r.O(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) && !r.O(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) && (list = (List) I.c(y5.getString(str, ""), (W1.e) this.f313d)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public V0.i v() {
        String str = ((String) this.f311b) == null ? " backendName" : "";
        if (((S0.d) this.f313d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new V0.i((String) this.f311b, (byte[]) this.f312c, (S0.d) this.f313d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public s0.t w() {
        s0.t tVar = new s0.t((UUID) this.f311b, (B0.q) this.f312c, (LinkedHashSet) this.f313d);
        C1416d c1416d = ((B0.q) this.f312c).f182j;
        boolean z = !c1416d.f11769h.isEmpty() || c1416d.f11765d || c1416d.f11763b || c1416d.f11764c;
        B0.q qVar = (B0.q) this.f312c;
        if (qVar.f189q) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (qVar.f179g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.i.d(randomUUID, "randomUUID()");
        this.f311b = randomUUID;
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.i.d(uuid, "id.toString()");
        B0.q other = (B0.q) this.f312c;
        kotlin.jvm.internal.i.e(other, "other");
        int i2 = other.f174b;
        String str = other.f176d;
        s0.g gVar = new s0.g(other.f177e);
        s0.g gVar2 = new s0.g(other.f178f);
        long j2 = other.f179g;
        C1416d other2 = other.f182j;
        kotlin.jvm.internal.i.e(other2, "other");
        this.f312c = new B0.q(uuid, i2, other.f175c, str, gVar, gVar2, j2, other.f180h, other.f181i, new C1416d(other2.f11762a, other2.f11763b, other2.f11764c, other2.f11765d, other2.f11766e, other2.f11767f, other2.f11768g, other2.f11769h), other.f183k, other.f184l, other.f185m, other.f186n, other.f187o, other.f188p, other.f189q, other.f190r, other.f191s, 524288, 0);
        return tVar;
    }

    public void x(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f312c;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f313d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences y(C0116g c0116g) {
        String str = c0116g.f2086a;
        Context context = (Context) this.f312c;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            kotlin.jvm.internal.i.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        kotlin.jvm.internal.i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void z(int i2, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f312c).dispatchSemanticsAction(i2, dVar);
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i2) {
        this.f310a = i2;
        this.f311b = obj;
        this.f312c = obj2;
        this.f313d = obj3;
    }

    public i(String str) {
        this.f310a = 18;
        C0338i c0338i = new C0338i();
        this.f312c = c0338i;
        this.f313d = c0338i;
        this.f311b = str;
    }

    public i(AbstractServiceC0253x abstractServiceC0253x) {
        this.f310a = 16;
        this.f311b = new C0252w(abstractServiceC0253x);
        this.f312c = new Handler();
    }

    public i(B0.i iVar) {
        this.f310a = 14;
        this.f311b = iVar;
        this.f312c = j5.b.b((k5.d) iVar.f155d);
        k5.c cVar = (k5.c) iVar.f156e;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        this.f313d = new j5.p(cVar);
    }

    public i(ExecutorService executorService) {
        this.f310a = 1;
        this.f312c = new Handler(Looper.getMainLooper());
        this.f313d = new A.c(1, this);
        this.f311b = new C0.n(executorService);
    }

    public i(Y store, W factory, S.b defaultCreationExtras) {
        this.f310a = 17;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f311b = store;
        this.f312c = factory;
        this.f313d = defaultCreationExtras;
    }

    public i(H2.f fVar, String str) {
        this.f310a = 5;
        H2.s sVar = H2.s.f1151b;
        this.f311b = fVar;
        this.f312c = str;
        this.f313d = sVar;
    }

    public i(U.e eVar) {
        this.f310a = 13;
        this.f311b = eVar;
        this.f312c = new C0157b();
        this.f313d = new ArrayList();
    }

    public i(FirebaseMessagingService firebaseMessagingService, V0.j jVar, ExecutorService executorService) {
        this.f310a = 19;
        this.f311b = executorService;
        this.f312c = firebaseMessagingService;
        this.f313d = jVar;
    }

    public i(Context context, TypedArray typedArray) {
        this.f310a = 21;
        this.f311b = context;
        this.f312c = typedArray;
    }

    public i(Class cls) {
        this.f310a = 26;
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.i.d(randomUUID, "randomUUID()");
        this.f311b = randomUUID;
        String uuid = ((UUID) this.f311b).toString();
        kotlin.jvm.internal.i.d(uuid, "id.toString()");
        this.f312c = new B0.q(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0476u.W(1));
        AbstractC0464i.Y(strArr, linkedHashSet);
        this.f313d = linkedHashSet;
        ((B0.q) this.f312c).f176d = OverwritingInputMerger.class.getName();
    }

    public i(W1.e eVar) {
        this.f310a = 12;
        this.f311b = new F(30);
        this.f312c = new ArrayList();
        this.f313d = new ArrayList();
        new l1.j(this);
    }

    public i(C1557b c1557b, FlutterJNI flutterJNI) {
        this.f310a = 2;
        C0482c c0482c = new C0482c(7, this);
        f2.t tVar = new f2.t(c1557b, "flutter/accessibility", H2.r.INSTANCE, null);
        this.f311b = tVar;
        tVar.h(c0482c);
        this.f312c = flutterJNI;
    }

    public i(int i2) {
        this.f310a = i2;
        switch (i2) {
            case C0793l9.f8686H /* 27 */:
                this.f311b = Collections.emptyList();
                this.f312c = Collections.emptyList();
                break;
            default:
                this.f311b = new ConcurrentLinkedQueue();
                break;
        }
    }

    public i(i iVar, t tVar) {
        this.f310a = 4;
        this.f313d = iVar;
        this.f312c = new AtomicReference(null);
        this.f311b = tVar;
    }

    public i(H2.f messenger, Context context, W1.e eVar) {
        this.f310a = 6;
        kotlin.jvm.internal.i.e(messenger, "messenger");
        kotlin.jvm.internal.i.e(context, "context");
        this.f311b = messenger;
        this.f312c = context;
        this.f313d = eVar;
        try {
            InterfaceC0115f.f2085P.getClass();
            C0114e.b(messenger, this, "shared_preferences");
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e3);
        }
    }

    public i(Matcher matcher, String input) {
        this.f310a = 0;
        kotlin.jvm.internal.i.e(input, "input");
        this.f311b = matcher;
        this.f312c = new h(this);
    }

    public i(U.e eVar, byte b6) {
        this.f310a = 25;
        this.f311b = eVar;
        this.f312c = new ReentrantLock();
        this.f313d = new WeakHashMap();
    }
}
