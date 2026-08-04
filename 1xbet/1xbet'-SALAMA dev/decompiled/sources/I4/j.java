package I4;

import A5.p;
import A5.s;
import F2.C0254t;
import I2.J;
import I4.j;
import P2.BinderC0386l;
import P2.v;
import P5.C0392d;
import R5.C0407c;
import R5.C0409e;
import R5.C0411g;
import R5.C0422s;
import U5.p0;
import Y4.D;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbyc;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzgay;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.protobuf.AbstractC0867k;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.ryanheise.audioservice.AudioService;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p019c5.b;
import p151v2.t;
import p155w1.AbstractC0994h1;
import p155w1.C1009l0;
import p155w1.InterfaceC0990g1;

/* JADX INFO: loaded from: classes2.dex */
public class j implements zzgay, Continuation, p048g4.d, A5.q, p068j2.f, InterfaceC0990g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3682f;

    public /* synthetic */ j(int i7) {
        this.f3677a = i7;
    }

    public static String c(String str) {
        if (str == null || !C6.o.p0(str, "/", false)) {
            return "*";
        }
        String strSubstring = str.substring(0, C6.o.t0(0, 6, str, "/", false));
        t6.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static void i(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public A5.n a() {
        if (((C0411g) this.f3680d) == null) {
            this.f3680d = new C0411g(this);
        }
        C0411g c0411g = (C0411g) this.f3680d;
        t6.h.b(c0411g);
        return c0411g;
    }

    public Context b() {
        p121q5.c cVar = (p121q5.c) this.f3679c;
        return cVar != null ? cVar : (Context) this.f3678b;
    }

    @Override // p068j2.f
    public int d(long j) {
        long[] jArr = (long[]) this.f3679c;
        int iB = t.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // p048g4.d
    public Object e(p048g4.r rVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((p048g4.q) this.f3678b, (p048g4.q) this.f3679c, (p048g4.q) this.f3680d, (p048g4.q) this.f3681e, (p048g4.q) this.f3682f, rVar);
    }

    public File f() {
        return new File(b().getCacheDir(), "share_plus");
    }

    public void g(String str, HashMap map, A5.r rVar) {
        if (p049g5.l.f13275C) {
            ((s) this.f3679c).a(str, map, rVar);
        } else {
            ((LinkedList) this.f3682f).add(new p049g5.k(str, map, rVar));
        }
    }

    @Override // p068j2.f
    public long h(int i7) {
        return ((long[]) this.f3679c)[i7];
    }

    public void j(String str, Bundle bundle) {
        ((p117q0.j) this.f3678b).notifyChildrenChanged(str);
    }

    public void k() {
        p117q0.j jVar = new p117q0.j(this, (p117q0.s) this.f3682f);
        this.f3678b = jVar;
        jVar.onCreate();
    }

    public void l(Runnable runnable) {
        Context context = (Context) this.f3681e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    @Override // p068j2.f
    public List m(long j) {
        p118q2.e eVar = (p118q2.e) this.f3678b;
        ArrayList<Pair> arrayList = new ArrayList();
        eVar.g(j, eVar.f15822h, arrayList);
        TreeMap treeMap = new TreeMap();
        eVar.i(j, false, eVar.f15822h, treeMap);
        HashMap map = (HashMap) this.f3681e;
        eVar.h(j, (Map) this.f3680d, map, eVar.f15822h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) ((HashMap) this.f3682f).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                p118q2.f fVar = (p118q2.f) map.get(pair.first);
                fVar.getClass();
                arrayList2.add(new p068j2.b(null, null, null, bitmapDecodeByteArray, fVar.f15829c, 0, fVar.f15831e, fVar.f15828b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f15832f, fVar.f15833g, false, -16777216, fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            p118q2.f fVar2 = (p118q2.f) map.get(entry.getKey());
            fVar2.getClass();
            p068j2.a aVar = (p068j2.a) entry.getValue();
            CharSequence charSequence = aVar.f14557a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (p118q2.a aVar2 : (p118q2.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p118q2.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i7, i10 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == '\n') {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f14561e = fVar2.f15829c;
            aVar.f14562f = fVar2.f15830d;
            aVar.f14563g = fVar2.f15831e;
            aVar.f14564h = fVar2.f15828b;
            aVar.f14567l = fVar2.f15832f;
            aVar.f14566k = fVar2.f15835i;
            aVar.j = fVar2.f15834h;
            aVar.f14571p = fVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public void n(String str, String str2, boolean z4) {
        Intent intentCreateChooser;
        t6.h.e(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        if (z4) {
            Context context = (Context) this.f3678b;
            intentCreateChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((p044f6.g) this.f3682f).getValue()).intValue() | 134217728).getIntentSender());
        } else {
            intentCreateChooser = Intent.createChooser(intent, null);
        }
        t6.h.b(intentCreateChooser);
        q(intentCreateChooser, z4);
    }

    public void o(List list, List list2, String str, String str2, boolean z4) throws IOException {
        Intent intentCreateChooser;
        boolean zB0;
        File fileF = f();
        File[] fileArrListFiles = fileF.listFiles();
        if (fileF.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileF.delete();
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = new File((String) it.next());
            try {
                String canonicalPath = file2.getCanonicalPath();
                t6.h.b(canonicalPath);
                String canonicalPath2 = f().getCanonicalPath();
                t6.h.d(canonicalPath2, "getCanonicalPath(...)");
                zB0 = C6.o.B0(canonicalPath, canonicalPath2);
            } catch (IOException unused) {
                zB0 = false;
            }
            if (zB0) {
                throw new IOException("Shared file can not be located in '" + f().getCanonicalPath() + '\'');
            }
            File fileF2 = f();
            if (!fileF2.exists()) {
                fileF2.mkdirs();
            }
            File file3 = new File(fileF2, file2.getName());
            if (!file2.exists()) {
                throw new p115p6.b(file2, null, "The source file doesn't exist.");
            }
            if (file3.exists() && !file3.delete()) {
                throw new p115p6.b(file2, file3, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (!file2.isDirectory()) {
                File parentFile = file3.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        p113p3.f.u(fileInputStream, fileOutputStream, 8192);
                        p115p6.a.e(fileOutputStream, null);
                        p115p6.a.e(fileInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p115p6.a.e(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p115p6.a.e(fileInputStream, th3);
                        throw th4;
                    }
                }
            } else if (!file3.mkdirs()) {
                throw new Z4.b(file2, file3, "Failed to create target directory.");
            }
            arrayList.add(G.l.getUriForFile(b(), (String) ((p044f6.g) this.f3681e).getValue(), file3));
        }
        Intent intent = new Intent();
        if (arrayList.isEmpty()) {
            if (!(str == null || C6.o.u0(str))) {
                n(str, str2, z4);
                return;
            }
        }
        String str3 = "*/*";
        if (arrayList.size() == 1) {
            str3 = list2 == null || list2.isEmpty() ? "*/*" : (String) p050g6.h.Q0(list2);
            intent.setAction("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) p050g6.h.Q0(arrayList));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            if (!(list2 != null ? list2.isEmpty() : true)) {
                t6.h.b(list2);
                if (list2.size() != 1) {
                    String strConcat = (String) p050g6.h.Q0(list2);
                    int iL0 = p050g6.i.L0(list2);
                    if (1 > iL0) {
                        str3 = strConcat;
                        break;
                    }
                    int i7 = 1;
                    while (true) {
                        if (!t6.h.a(strConcat, list2.get(i7))) {
                            if (!c(strConcat).equals(c((String) list2.get(i7)))) {
                                break;
                            } else {
                                strConcat = c((String) list2.get(i7)).concat("/*");
                            }
                        }
                        if (i7 == iL0) {
                            str3 = strConcat;
                            break;
                        }
                        i7++;
                    }
                } else {
                    str3 = (String) p050g6.h.Q0(list2);
                }
            }
            intent.setType(str3);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        intent.addFlags(1);
        if (z4) {
            Context context = (Context) this.f3678b;
            intentCreateChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((p044f6.g) this.f3682f).getValue()).intValue() | 134217728).getIntentSender());
        } else {
            intentCreateChooser = Intent.createChooser(intent, null);
        }
        List<ResolveInfo> listQueryIntentActivities = b().getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
        t6.h.d(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it2 = listQueryIntentActivities.iterator();
        while (it2.hasNext()) {
            String str4 = ((ResolveInfo) it2.next()).activityInfo.packageName;
            Iterator<? extends Parcelable> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b().grantUriPermission(str4, (Uri) it3.next(), 3);
            }
        }
        t6.h.b(intentCreateChooser);
        q(intentCreateChooser, z4);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        int[] iArr;
        try {
            final Map map = (Map) oVar.f677b;
            switch (oVar.f676a) {
                case "setMediaItem":
                    final A5.p pVar = (A5.p) rVar;
                    final int i7 = 0;
                    Executors.newSingleThreadExecutor().execute(new Runnable(this) { // from class: g5.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ j f13257b;

                        {
                            this.f13257b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    Map map2 = map;
                                    final p pVar2 = pVar;
                                    Handler handler = (Handler) this.f13257b.f3681e;
                                    try {
                                        AudioService.f12300P.k(l.g((Map) map2.get("mediaItem")));
                                        handler.post(new b(pVar2, 2));
                                        return;
                                    } catch (Exception e7) {
                                        final int i8 = 1;
                                        handler.post(new Runnable() { // from class: g5.h
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i8) {
                                                    case 0:
                                                        pVar2.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e7));
                                                        break;
                                                    default:
                                                        pVar2.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e7));
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                default:
                                    j jVar = this.f13257b;
                                    Map map3 = map;
                                    final p pVar3 = pVar;
                                    jVar.getClass();
                                    try {
                                        ArrayList arrayListC = l.c((List) map3.get("queue"));
                                        AudioService audioService = AudioService.f12300P;
                                        synchronized (audioService) {
                                            AudioService.f12303S = arrayListC;
                                            audioService.f12306B.z0(arrayListC);
                                        }
                                        ((Handler) jVar.f3681e).post(new b(pVar3, 1));
                                        return;
                                    } catch (Exception e8) {
                                        final int i9 = 0;
                                        ((Handler) jVar.f3681e).post(new Runnable() { // from class: g5.h
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i9) {
                                                    case 0:
                                                        pVar3.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e8));
                                                        break;
                                                    default:
                                                        pVar3.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e8));
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                            }
                        }
                    });
                    break;
                case "setQueue":
                    final A5.p pVar2 = (A5.p) rVar;
                    final int i8 = 1;
                    Executors.newSingleThreadExecutor().execute(new Runnable(this) { // from class: g5.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ j f13257b;

                        {
                            this.f13257b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i8) {
                                case 0:
                                    Map map2 = map;
                                    final p pVar3 = pVar2;
                                    Handler handler = (Handler) this.f13257b.f3681e;
                                    try {
                                        AudioService.f12300P.k(l.g((Map) map2.get("mediaItem")));
                                        handler.post(new b(pVar3, 2));
                                        return;
                                    } catch (Exception e7) {
                                        final int i9 = 1;
                                        handler.post(new Runnable() { // from class: g5.h
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i9) {
                                                    case 0:
                                                        pVar3.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e7));
                                                        break;
                                                    default:
                                                        pVar3.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e7));
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                default:
                                    j jVar = this.f13257b;
                                    Map map3 = map;
                                    final p pVar4 = pVar2;
                                    jVar.getClass();
                                    try {
                                        ArrayList arrayListC = l.c((List) map3.get("queue"));
                                        AudioService audioService = AudioService.f12300P;
                                        synchronized (audioService) {
                                            AudioService.f12303S = arrayListC;
                                            audioService.f12306B.z0(arrayListC);
                                        }
                                        ((Handler) jVar.f3681e).post(new b(pVar4, 1));
                                        return;
                                    } catch (Exception e8) {
                                        final int i10 = 0;
                                        ((Handler) jVar.f3681e).post(new Runnable() { // from class: g5.h
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i10) {
                                                    case 0:
                                                        pVar4.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e8));
                                                        break;
                                                    default:
                                                        pVar4.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(e8));
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                            }
                        }
                    });
                    break;
                case "setState":
                    Map map2 = (Map) map.get(SentryThread.JsonKeys.STATE);
                    int i9 = p136t.e.f(6)[((Integer) map2.get("processingState")).intValue()];
                    boolean zBooleanValue = ((Boolean) map2.get("playing")).booleanValue();
                    List<Map> list = (List) map2.get("controls");
                    List list2 = (List) map2.get("androidCompactActionIndices");
                    List list3 = (List) map2.get("systemActions");
                    long jLongValue = p049g5.l.j(map2.get("updatePosition")).longValue();
                    long jLongValue2 = p049g5.l.j(map2.get("bufferedPosition")).longValue();
                    float fDoubleValue = (float) ((Double) map2.get("speed")).doubleValue();
                    long jCurrentTimeMillis = map2.get("updateTime") == null ? System.currentTimeMillis() : p049g5.l.j(map2.get("updateTime")).longValue();
                    Integer num = (Integer) map2.get("errorCode");
                    String str = (String) map2.get("errorMessage");
                    int iIntValue = ((Integer) map2.get("repeatMode")).intValue();
                    int iIntValue2 = ((Integer) map2.get("shuffleMode")).intValue();
                    Long lJ = p049g5.l.j(map2.get("queueIndex"));
                    boolean zBooleanValue2 = ((Boolean) map2.get("captioningEnabled")).booleanValue();
                    long j = jCurrentTimeMillis - p049g5.l.f13273A;
                    ArrayList arrayList = new ArrayList();
                    long jIntValue = 0;
                    for (Map map3 : list) {
                        String str2 = (String) map3.get("androidIcon");
                        String str3 = (String) map3.get("label");
                        long jIntValue2 = 1 << ((Integer) map3.get("action")).intValue();
                        jIntValue |= jIntValue2;
                        Map map4 = (Map) map3.get("customAction");
                        arrayList.add(new p049g5.n(str2, str3, jIntValue2, map4 != null ? new p049g5.m((String) map4.get("name"), (Map) map4.get("extras")) : null));
                    }
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        jIntValue |= (long) (1 << ((Integer) it.next()).intValue());
                    }
                    if (list2 != null) {
                        int iMin = Math.min(3, list2.size());
                        iArr = new int[iMin];
                        for (int i10 = 0; i10 < iMin; i10++) {
                            iArr[i10] = ((Integer) list2.get(i10)).intValue();
                        }
                    } else {
                        iArr = null;
                    }
                    AudioService.f12300P.m(arrayList, jIntValue, iArr, i9, zBooleanValue, jLongValue, jLongValue2, fDoubleValue, j, num, str, iIntValue, iIntValue2, zBooleanValue2, lJ);
                    ((A5.p) rVar).success(null);
                    break;
                case "setAndroidPlaybackInfo":
                    Map map5 = (Map) map.get("playbackInfo");
                    AudioService.f12300P.l(((Integer) map5.get("playbackType")).intValue(), (Integer) map5.get("volumeControlType"), (Integer) map5.get("maxVolume"), (Integer) map5.get("volume"));
                    ((A5.p) rVar).success(null);
                    break;
                case "notifyChildrenChanged":
                    AudioService.f12300P.a((String) map.get("parentMediaId"), p049g5.l.l((Map) map.get(RRWebOptionsEvent.EVENT_TAG)));
                    ((A5.p) rVar).success(null);
                    break;
                case "androidForceEnableMediaButtons":
                    if (((AudioTrack) this.f3680d) == null) {
                        AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, 2048, 0);
                        this.f3680d = audioTrack;
                        audioTrack.write(new byte[2048], 0, 2048);
                    }
                    ((AudioTrack) this.f3680d).reloadStaticData();
                    ((AudioTrack) this.f3680d).play();
                    ((A5.p) rVar).success(null);
                    break;
                case "stopService":
                    AudioService audioService = AudioService.f12300P;
                    if (audioService != null) {
                        if (audioService.f12306B.p0()) {
                            audioService.f12306B.w0(false);
                        }
                        ((NotificationManager) audioService.getSystemService("notification")).cancel(1124);
                        audioService.stopSelf();
                    }
                    ((A5.p) rVar).success(null);
                    break;
                default:
                    break;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            ((A5.p) rVar).error(e7.getMessage(), null, null);
        }
    }

    @Override // p068j2.f
    public int p() {
        return ((long[]) this.f3679c).length;
    }

    public void q(Intent intent, boolean z4) {
        A5.p pVar;
        p121q5.c cVar = (p121q5.c) this.f3679c;
        if (cVar != null) {
            if (z4) {
                cVar.startActivityForResult(intent, 22643);
                return;
            } else {
                cVar.startActivity(intent);
                return;
            }
        }
        intent.addFlags(268435456);
        if (z4) {
            p107o5.b bVar = (p107o5.b) this.f3680d;
            if (bVar.f15621b.compareAndSet(false, true) && (pVar = bVar.f15620a) != null) {
                pVar.success("dev.fluttercommunity.plus/share/unavailable");
                bVar.f15620a = null;
            }
        }
        ((Context) this.f3678b).startActivity(intent);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3681e;
        if (zIsSuccessful) {
            com.google.firebase.storage.h hVar = (com.google.firebase.storage.h) task.getResult();
            ArrayList arrayList = hVar.f12024a;
            ArrayList arrayList2 = (ArrayList) this.f3680d;
            arrayList2.addAll(arrayList);
            ArrayList arrayList3 = hVar.f12025b;
            ArrayList arrayList4 = (ArrayList) this.f3678b;
            arrayList4.addAll(arrayList3);
            String str = hVar.f12026c;
            if (str != null) {
                ((com.google.firebase.storage.m) this.f3682f).c(str, null).continueWithTask((p0) this.f3679c, this);
            } else {
                taskCompletionSource.setResult(new com.google.firebase.storage.h(arrayList2, arrayList4, null));
            }
        } else {
            taskCompletionSource.setException(task.getException());
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f3677a) {
            case 2:
                return "RemoteEvent{snapshotVersion=" + ((H4.n) this.f3679c) + ", targetChanges=" + ((Map) this.f3678b) + ", targetMismatches=" + ((Map) this.f3680d) + ", documentUpdates=" + ((Map) this.f3681e) + ", resolvedLimboDocuments=" + ((Set) this.f3682f) + '}';
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f3678b) + ", mProviderPackage: " + ((String) this.f3679c) + ", mQuery: " + ((String) this.f3680d) + ", mCertificates:");
                int i7 = 0;
                while (true) {
                    List list = (List) this.f3681e;
                    if (i7 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i7);
                    for (int i8 = 0; i8 < list2.size(); i8++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i7++;
                }
                break;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhJ)).booleanValue()) {
            E2.o.f1952C.f1961g.zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            E2.o.f1952C.f1961g.zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzffy zzffyVarB0 = BinderC0386l.B0((I3.b) this.f3678b, (zzbyc) this.f3679c);
        if (((Boolean) zzbdr.zze.zze()).booleanValue() && zzffyVarB0 != null) {
            zzffn zzffnVar = (zzffn) this.f3681e;
            zzffnVar.zzh(th);
            zzffnVar.zzg(false);
            zzffyVarB0.zza(zzffnVar);
            zzffyVarB0.zzh();
        }
        zzbxv zzbxvVar = (zzbxv) this.f3680d;
        if (zzbxvVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            zzbxvVar.zzb(message);
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            J2.j.e("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zzb(Object obj) {
        v vVar = (v) obj;
        zzffy zzffyVarB0 = BinderC0386l.B0((I3.b) this.f3678b, (zzbyc) this.f3679c);
        BinderC0386l binderC0386l = (BinderC0386l) this.f3682f;
        binderC0386l.f5510S.set(true);
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhE)).booleanValue();
        zzbxv zzbxvVar = (zzbxv) this.f3680d;
        zzffn zzffnVar = (zzffn) this.f3681e;
        if (!zBooleanValue) {
            if (zzbxvVar != null) {
                try {
                    zzbxvVar.zzb("QueryInfo generation has been disabled.");
                } catch (RemoteException e7) {
                    String strConcat = "QueryInfo generation has been disabled.".concat(e7.toString());
                    int i7 = J.f3546b;
                    J2.j.d(strConcat);
                }
            }
            if (!((Boolean) zzbdr.zze.zze()).booleanValue() || zzffyVarB0 == null) {
                return;
            }
            zzffnVar.zzc("QueryInfo generation has been disabled.");
            zzffnVar.zzg(false);
            zzffyVarB0.zza(zzffnVar);
            zzffyVarB0.zzh();
            return;
        }
        try {
            if (vVar == null) {
                if (zzbxvVar != null) {
                    zzbxvVar.zzc(null, null, null);
                }
                zzffnVar.zzg(true);
                if (!((Boolean) zzbdr.zze.zze()).booleanValue() || zzffyVarB0 == null) {
                    return;
                }
                zzffyVarB0.zza(zzffnVar);
                zzffyVarB0.zzh();
                return;
            }
            try {
                String str = vVar.f5563a;
                if (TextUtils.isEmpty((!TextUtils.isEmpty(vVar.f5565c) ? new JSONObject(vVar.f5565c) : new JSONObject(vVar.f5564b)).optString("request_id", ""))) {
                    int i8 = J.f3546b;
                    J2.j.g("The request ID is empty in request JSON.");
                    if (zzbxvVar != null) {
                        zzbxvVar.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzffnVar.zzc("Request ID empty");
                    zzffnVar.zzg(false);
                    if (!((Boolean) zzbdr.zze.zze()).booleanValue() || zzffyVarB0 == null) {
                        return;
                    }
                    zzffyVarB0.zza(zzffnVar);
                    zzffyVarB0.zzh();
                    return;
                }
                Bundle bundle = vVar.f5568f;
                if (binderC0386l.f5498G && bundle != null && bundle.getInt(binderC0386l.f5500I, -1) == -1) {
                    bundle.putInt(binderC0386l.f5500I, binderC0386l.f5501J.get());
                }
                if (binderC0386l.f5497F && bundle != null && TextUtils.isEmpty(bundle.getString(binderC0386l.f5499H))) {
                    if (TextUtils.isEmpty(binderC0386l.f5503L)) {
                        binderC0386l.f5503L = E2.o.f1952C.f1957c.x(binderC0386l.f5516b, binderC0386l.f5502K.f10834a);
                    }
                    bundle.putString(binderC0386l.f5499H, binderC0386l.f5503L);
                }
                if (zzbxvVar != null) {
                    if (TextUtils.isEmpty(vVar.f5565c)) {
                        zzbxvVar.zzc(str, vVar.f5564b, bundle);
                    } else {
                        zzbxvVar.zzc(str, vVar.f5565c, bundle);
                    }
                }
                zzffnVar.zzg(true);
                if (!((Boolean) zzbdr.zze.zze()).booleanValue() || zzffyVarB0 == null) {
                    return;
                }
                zzffyVarB0.zza(zzffnVar);
                zzffyVarB0.zzh();
            } catch (JSONException e8) {
                int i9 = J.f3546b;
                J2.j.g("Failed to create JSON object from the request string.");
                if (zzbxvVar != null) {
                    zzbxvVar.zzb("Internal error for request JSON: " + e8.toString());
                }
                zzffnVar.zzh(e8);
                zzffnVar.zzg(false);
                E2.o.f1952C.f1961g.zzw(e8, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbdr.zze.zze()).booleanValue() || zzffyVarB0 == null) {
                    return;
                }
                zzffyVarB0.zza(zzffnVar);
                zzffyVarB0.zzh();
            }
        } catch (RemoteException e9) {
            zzffnVar.zzh(e9);
            zzffnVar.zzg(false);
            int i10 = J.f3546b;
            J2.j.e("", e9);
            E2.o.f1952C.f1961g.zzw(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbdr.zze.zze()).booleanValue() && zzffyVarB0 != null) {
                zzffyVarB0.zza(zzffnVar);
                zzffyVarB0.zzh();
            }
        }
    }

    public j(BinderC0386l binderC0386l, I3.b bVar, zzbyc zzbycVar, zzbxv zzbxvVar, zzffn zzffnVar) {
        this.f3677a = 4;
        this.f3678b = bVar;
        this.f3679c = zzbycVar;
        this.f3680d = zzbxvVar;
        this.f3681e = zzffnVar;
        this.f3682f = binderC0386l;
    }

    public j(Context context, p107o5.b bVar) {
        this.f3677a = 9;
        t6.h.e(context, "context");
        t6.h.e(bVar, "manager");
        this.f3678b = context;
        this.f3679c = null;
        this.f3680d = bVar;
        this.f3681e = D.C(new androidx.activity.d(this, 1));
        this.f3682f = D.C(new C0392d(2));
    }

    public j(A5.f fVar, Context context, C0422s c0422s) {
        this.f3677a = 5;
        t6.h.e(fVar, "binaryMessenger");
        this.f3678b = fVar;
        this.f3679c = new C0407c(new p033e3.h(new C0409e(fVar)));
        this.f3681e = context;
        this.f3682f = c0422s;
    }

    public j(i iVar, H4.n nVar, ArrayList arrayList, AbstractC0867k abstractC0867k, p075k4.c cVar) {
        this.f3677a = 0;
        this.f3678b = iVar;
        this.f3679c = nVar;
        this.f3680d = arrayList;
        this.f3681e = abstractC0867k;
        this.f3682f = cVar;
    }

    public j(H4.n nVar, Map map, Map map2, Map map3, Set set) {
        this.f3677a = 2;
        this.f3679c = nVar;
        this.f3678b = map;
        this.f3680d = map2;
        this.f3681e = map3;
        this.f3682f = set;
    }

    public j(p118q2.e eVar, HashMap map, HashMap map2, HashMap map3) {
        this.f3677a = 11;
        this.f3678b = eVar;
        this.f3681e = map2;
        this.f3682f = map3;
        this.f3680d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        eVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f3679c = jArr;
    }

    public j(MotionLayout motionLayout) {
        this.f3677a = 13;
        this.f3680d = new ArrayList();
        this.f3682f = new ArrayList();
        this.f3678b = motionLayout;
    }

    public j(Context context, C1009l0 c1009l0) {
        MessageDigest messageDigest;
        String strEncodeToString;
        this.f3677a = 12;
        this.f3680d = context;
        this.f3678b = c1009l0;
        context.getPackageName();
        char[] cArr = new char[32];
        for (int i7 = 0; i7 < 32; i7++) {
            SecureRandom secureRandom = AbstractC0994h1.f17734a;
            char[] cArr2 = AbstractC0994h1.f17735b;
            cArr[i7] = cArr2[secureRandom.nextInt(cArr2.length)];
        }
        SecureRandom secureRandom2 = AbstractC0994h1.f17734a;
        String str = new String(cArr);
        this.f3679c = str;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest != null) {
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
        } else {
            strEncodeToString = "";
        }
        this.f3681e = strEncodeToString;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        language = TextUtils.isEmpty(language) ? InterfaceC0990g1.f17724w : language;
        String country = locale.getCountry();
        this.f3682f = p031e1.k.f(language, "-", TextUtils.isEmpty(country) ? InterfaceC0990g1.f17723v : country);
    }

    public j(String str, String str2, String str3, List list) {
        this.f3677a = 3;
        str.getClass();
        this.f3678b = str;
        str2.getClass();
        this.f3679c = str2;
        this.f3680d = str3;
        list.getClass();
        this.f3681e = list;
        this.f3682f = str + "-" + str2 + "-" + str3;
    }

    public j(A5.f fVar) {
        this.f3677a = 8;
        this.f3681e = new Handler(Looper.getMainLooper());
        this.f3682f = new LinkedList();
        this.f3678b = fVar;
        s sVar = new s(fVar, "com.ryanheise.audio_service.handler.methods");
        this.f3679c = sVar;
        sVar.b(this);
    }

    public j(p117q0.s sVar) {
        this.f3677a = 10;
        this.f3682f = sVar;
        this.f3677a = 10;
        this.f3681e = sVar;
        this.f3680d = new ArrayList();
    }

    public j(com.google.firebase.storage.m mVar, ArrayList arrayList, ArrayList arrayList2, p0 p0Var, TaskCompletionSource taskCompletionSource) {
        this.f3677a = 6;
        this.f3682f = mVar;
        this.f3680d = arrayList;
        this.f3678b = arrayList2;
        this.f3679c = p0Var;
        this.f3681e = taskCompletionSource;
    }
}
