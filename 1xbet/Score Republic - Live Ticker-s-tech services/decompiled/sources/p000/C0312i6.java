package p000;

import android.R;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0312i6 implements InterfaceC0201f7, b21, InterfaceC0435lj, InterfaceC0891xv, InterfaceC0350j8, t10 {

    /* JADX INFO: renamed from: o */
    public static pk1 f3444o;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3446j;

    /* JADX INFO: renamed from: k */
    public Object f3447k;

    /* JADX INFO: renamed from: l */
    public Object f3448l;

    /* JADX INFO: renamed from: m */
    public static final int[] f3442m = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: n */
    public static final Object f3443n = new Object();

    /* JADX INFO: renamed from: p */
    public static final u90 f3445p = new u90(17);

    public C0312i6(EditText editText, int i) {
        this.f3446j = i;
        switch (i) {
            case 23:
                this.f3447k = editText;
                C0116cw c0116cw = new C0116cw(editText);
                this.f3448l = c0116cw;
                editText.addTextChangedListener(c0116cw);
                if (C0669rv.f6976b == null) {
                    synchronized (C0669rv.f6975a) {
                        try {
                            if (C0669rv.f6976b == null) {
                                C0669rv c0669rv = new C0669rv();
                                try {
                                    C0669rv.f6977c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0669rv.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C0669rv.f6976b = c0669rv;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C0669rv.f6976b);
                return;
            default:
                this.f3447k = editText;
                this.f3448l = new nu1(editText);
                return;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0312i6 m2533e(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C0312i6(19, channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static v92 m2534f(Context context, Intent intent, boolean z) {
        pk1 pk1Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f3443n) {
            try {
                if (f3444o == null) {
                    f3444o = new pk1(context);
                }
                pk1Var = f3444o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return pk1Var.m3952b(intent).m5128d(new fn0(), new C0042ay(2));
        }
        if (f71.m1647o().m1670q(context)) {
            synchronized (j22.f3798d) {
                try {
                    j22.m2794c(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        j22.f3799e.m4353a();
                    }
                    v92 v92VarM3952b = pk1Var.m3952b(intent);
                    C0468mf c0468mf = new C0468mf(12, intent);
                    v92VarM3952b.getClass();
                    v92VarM3952b.f8141b.m3364n(new vy1(rc1.f6820a, c0468mf));
                    v92VarM3952b.m5139o();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            pk1Var.m3952b(intent);
        }
        return hn0.m2316j(-1);
    }

    /* JADX INFO: renamed from: j */
    public static C0310i4 m2535j(ImageDecoder.Source source, int i, int i2, uu0 uu0Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C0849wq(i, i2, uu0Var));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C0310i4(0, (AnimatedImageDrawable) drawableDecodeDrawable);
        }
        C0042ay.m530g(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m2536A(int i, int i2, int i3, int i4) {
        AbstractC0284hf abstractC0284hf = (AbstractC0284hf) this.f3448l;
        abstractC0284hf.f3195m.set(i, i2, i3, i4);
        Rect rect = abstractC0284hf.f3194l;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: B */
    public ListenableFuture m2537B(InterfaceC0350j8 interfaceC0350j8, Executor executor) {
        executor.getClass();
        final ExecutorC0856wx executorC0856wx = new ExecutorC0856wx(EnumC0819vx.f8278j);
        executorC0856wx.f8717k = executor;
        executorC0856wx.f8716j = this;
        C0312i6 c0312i6 = new C0312i6(25, executorC0856wx, interfaceC0350j8);
        final g71 g71Var = new g71();
        final ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f3447k).getAndSet(g71Var);
        final ve1 ve1Var = new ve1();
        ve1Var.f8186r = new ue1(ve1Var, c0312i6);
        listenableFuture.mo995c(ve1Var, executorC0856wx);
        final ListenableFuture listenableFutureM2994e = k70.m2994e(ve1Var);
        Runnable runnable = new Runnable() { // from class: ux
            @Override // java.lang.Runnable
            public final void run() {
                ve1 ve1Var2 = ve1Var;
                if (ve1Var2.isDone()) {
                    g71Var.m2179n(listenableFuture);
                    return;
                }
                if (listenableFutureM2994e.isCancelled()) {
                    int i = ExecutorC0856wx.f8715n;
                    if (executorC0856wx.compareAndSet(EnumC0819vx.f8278j, EnumC0819vx.f8279k)) {
                        ve1Var2.cancel(false);
                    }
                }
            }
        };
        EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
        listenableFutureM2994e.mo995c(runnable, enumC0113ct);
        ve1Var.mo995c(runnable, enumC0113ct);
        return listenableFutureM2994e;
    }

    /* JADX INFO: renamed from: C */
    public Drawable m2538C(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f3448l) == null) {
                this.f3448l = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m2538C(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* JADX INFO: renamed from: D */
    public void m2539D() {
        Object parcelable;
        Integer num;
        C0177ek c0177ek = (C0177ek) this.f3447k;
        String str = (String) this.f3448l;
        Bundle bundle = c0177ek.f2104g;
        LinkedHashMap linkedHashMap = c0177ek.f2103f;
        if (!c0177ek.f2101d.contains(str) && (num = (Integer) c0177ek.f2099b.remove(str)) != null) {
            c0177ek.f2098a.remove(num);
        }
        c0177ek.f2102e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = AbstractC0491n1.m3458b(bundle, str);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0004a3.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0004a3) parcelable));
            bundle.remove(str);
        }
        if (c0177ek.f2100c.get(str) == null) {
            return;
        }
        dd0.m1158c();
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public void mo608a(InterfaceC0187eu interfaceC0187eu) {
        EnumC0262gu.m2148d((C0251gj) this.f3447k, interfaceC0187eu);
    }

    @Override // p000.InterfaceC0891xv
    /* JADX INFO: renamed from: b */
    public Object mo641b() {
        return (wf1) this.f3447k;
    }

    @Override // p000.InterfaceC0891xv
    /* JADX INFO: renamed from: c */
    public boolean mo642c(CharSequence charSequence, int i, int i2, af1 af1Var) {
        if ((af1Var.f176c & 4) > 0) {
            return true;
        }
        if (((wf1) this.f3447k) == null) {
            this.f3447k = new wf1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((o31) this.f3448l).getClass();
        ((wf1) this.f3447k).setSpan(new bf1(af1Var), i, i2, 33);
        return true;
    }

    @Override // p000.InterfaceC0350j8
    public ListenableFuture call() {
        ExecutorC0856wx executorC0856wx = (ExecutorC0856wx) this.f3447k;
        int i = ExecutorC0856wx.f8715n;
        if (executorC0856wx.compareAndSet(EnumC0819vx.f8278j, EnumC0819vx.f8280l)) {
            return ((InterfaceC0350j8) this.f3448l).call();
        }
        hc0 hc0Var = hc0.f3163q;
        return hc0Var != null ? hc0Var : new hc0();
    }

    @Override // p000.InterfaceC0670rw
    /* JADX INFO: renamed from: g */
    public boolean mo2024g(Object obj, File file, uu0 uu0Var) {
        return ((C0244gc) this.f3448l).mo2024g(new C0354jc((InterfaceC0318ic) this.f3447k, ((BitmapDrawable) ((v11) obj).get()).getBitmap()), file, uu0Var);
    }

    /* JADX INFO: renamed from: i */
    public C0831w8 m2540i() {
        if (((IdentityHashMap) this.f3448l) != null) {
            for (Map.Entry entry : ((C0831w8) this.f3447k).f8455a.entrySet()) {
                if (!((IdentityHashMap) this.f3448l).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f3448l).put((C0794v8) entry.getKey(), entry.getValue());
                }
            }
            this.f3447k = new C0831w8((IdentityHashMap) this.f3448l);
            this.f3448l = null;
        }
        return (C0831w8) this.f3447k;
    }

    /* JADX INFO: renamed from: k */
    public Boolean m2541k(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = (View.OnClickListener) this.f3448l;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick((ViewGroup) this.f3447k);
        return Boolean.TRUE;
    }

    @Override // p000.b21
    /* JADX INFO: renamed from: l */
    public int mo584l(uu0 uu0Var) {
        return 2;
    }

    /* JADX INFO: renamed from: m */
    public KeyListener m2542m(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0312i6) ((nu1) this.f3448l).f5551k).getClass();
        if (keyListener instanceof C0854wv) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0854wv(keyListener);
    }

    /* JADX INFO: renamed from: n */
    public boolean m2543n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo2;
        Bundle bundle2;
        x90 x90Var = (x90) this.f3447k;
        w00 w00Var = x90Var.f8872a;
        w00Var.m5224a();
        boolean zContains = ((Application) w00Var.f8318a).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains("auto_init");
        w00 w00Var2 = x90Var.f8872a;
        if (!zContains) {
            w00Var2.m5224a();
            Application application = (Application) w00Var2.f8318a;
            try {
                PackageManager packageManager = application.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                    w00Var2.m5224a();
                    Application application2 = (Application) w00Var2.f8318a;
                    try {
                        PackageManager packageManager2 = application2.getPackageManager();
                        if (packageManager2 != null && (applicationInfo2 = packageManager2.getApplicationInfo(application2.getPackageName(), 128)) != null && (bundle2 = applicationInfo2.metaData) != null && bundle2.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                            return applicationInfo2.metaData.getBoolean("firebase_inapp_messaging_auto_data_collection_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            return ((AtomicBoolean) this.f3448l).get();
        }
        w00Var2.m5224a();
        SharedPreferences sharedPreferences = ((Application) w00Var2.f8318a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", true);
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void mo2544o(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f3446j) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f3447k;
                oq0 oq0VarM3731n = oq0.m3731n(absSeekBar.getContext(), attributeSet, f3442m, i);
                Drawable drawableM3736f = oq0VarM3731n.m3736f(0);
                if (drawableM3736f != null) {
                    if (drawableM3736f instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM3736f;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM2538C = m2538C(animationDrawable.getFrame(i2), true);
                            drawableM2538C.setLevel(10000);
                            animationDrawable2.addFrame(drawableM2538C, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM3736f = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM3736f);
                }
                Drawable drawableM3736f2 = oq0VarM3731n.m3736f(1);
                if (drawableM3736f2 != null) {
                    absSeekBar.setProgressDrawable(m2538C(drawableM3736f2, false));
                }
                oq0VarM3731n.m3742o();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f3447k).getContext().obtainStyledAttributes(attributeSet, mz0.f5195i, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m2554z(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    @Override // p000.InterfaceC0435lj
    public void onComplete() {
        ((InterfaceC0435lj) this.f3448l).onComplete();
    }

    @Override // p000.InterfaceC0435lj
    public void onError(Throwable th) {
        ((InterfaceC0435lj) this.f3448l).onError(th);
    }

    /* JADX INFO: renamed from: p */
    public C0743tv m2545p(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        nu1 nu1Var = (nu1) this.f3448l;
        if (inputConnection == null) {
            nu1Var.getClass();
            inputConnection2 = null;
        } else {
            C0312i6 c0312i6 = (C0312i6) nu1Var.f5551k;
            c0312i6.getClass();
            if (!(inputConnection instanceof C0743tv)) {
                inputConnection = new C0743tv(editorInfo, inputConnection, (EditText) c0312i6.f3447k);
            }
            inputConnection2 = inputConnection;
        }
        return (C0743tv) inputConnection2;
    }

    /* JADX INFO: renamed from: q */
    public void m2546q(AbstractC0751u2 abstractC0751u2) {
        f71 f71Var = (f71) this.f3447k;
        ((ActionMode.Callback) f71Var.f2334k).onDestroyActionMode(f71Var.m1664j(abstractC0751u2));
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) this.f3448l;
        if (layoutInflaterFactory2C0828w5.f8389E != null) {
            layoutInflaterFactory2C0828w5.f8428u.getDecorView().removeCallbacks(layoutInflaterFactory2C0828w5.f8390F);
        }
        if (layoutInflaterFactory2C0828w5.f8388D != null) {
            ji1 ji1Var = layoutInflaterFactory2C0828w5.f8391G;
            if (ji1Var != null) {
                ji1Var.m2913b();
            }
            ji1 ji1VarM248a = ai1.m248a(layoutInflaterFactory2C0828w5.f8388D);
            ji1VarM248a.m2912a(0.0f);
            layoutInflaterFactory2C0828w5.f8391G = ji1VarM248a;
            ji1VarM248a.m2915d(new C0421l5(2, this));
        }
        layoutInflaterFactory2C0828w5.f8387C = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0828w5.f8393I;
        WeakHashMap weakHashMap = ai1.f194a;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C0828w5.m5244H();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public Object mo622r(u10 u10Var, AbstractC0882xm abstractC0882xm) {
        z10 z10Var;
        Throwable th;
        h41 h41Var;
        C0312i6 c0312i6;
        t10 t10Var;
        c20 c20Var;
        e20 e20Var;
        int i = this.f3446j;
        kf1 kf1Var = kf1.f4365a;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        switch (i) {
            case 27:
                if (abstractC0882xm instanceof z10) {
                    z10Var = (z10) abstractC0882xm;
                    int i2 = z10Var.f9567n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        z10Var.f9567n = i2 - Integer.MIN_VALUE;
                    } else {
                        z10Var = new z10(this, abstractC0882xm);
                    }
                } else {
                    z10Var = new z10(this, abstractC0882xm);
                }
                Object obj = z10Var.f9566m;
                int i3 = z10Var.f9567n;
                if (i3 == 0) {
                    wo1.m5395v(obj);
                    InterfaceC0180en interfaceC0180en = z10Var.f8992k;
                    interfaceC0180en.getClass();
                    h41 h41Var2 = new h41(u10Var, interfaceC0180en);
                    try {
                        C0182ep c0182ep = (C0182ep) this.f3447k;
                        try {
                            z10Var.f9569p = this;
                            z10Var.f9570q = u10Var;
                            z10Var.f9571r = h41Var2;
                            z10Var.f9567n = 1;
                            if (c0182ep.mo1490g(h41Var2, z10Var) != enumC0513nn) {
                                c0312i6 = this;
                                h41Var = h41Var2;
                                h41Var.mo2013o();
                                t10Var = (t10) c0312i6.f3448l;
                                z10Var.f9569p = null;
                                z10Var.f9570q = null;
                                z10Var.f9571r = null;
                                z10Var.f9567n = 2;
                                if (t10Var.mo622r(u10Var, z10Var) != enumC0513nn) {
                                    return kf1Var;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            h41Var = h41Var2;
                            h41Var.mo2013o();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            wo1.m5395v(obj);
                            return kf1Var;
                        }
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h41Var = z10Var.f9571r;
                    u10Var = z10Var.f9570q;
                    c0312i6 = z10Var.f9569p;
                    try {
                        wo1.m5395v(obj);
                        h41Var.mo2013o();
                        t10Var = (t10) c0312i6.f3448l;
                        z10Var.f9569p = null;
                        z10Var.f9570q = null;
                        z10Var.f9571r = null;
                        z10Var.f9567n = 2;
                        if (t10Var.mo622r(u10Var, z10Var) != enumC0513nn) {
                            return kf1Var;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        h41Var.mo2013o();
                        throw th;
                    }
                }
                return enumC0513nn;
            case 28:
                Object objMo622r = ((C0312i6) this.f3447k).mo622r(new b20(new i01(), u10Var, (C0257gp) this.f3448l), abstractC0882xm);
                return objMo622r == enumC0513nn ? objMo622r : kf1Var;
            default:
                if (abstractC0882xm instanceof c20) {
                    c20Var = (c20) abstractC0882xm;
                    int i4 = c20Var.f1069n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c20Var.f1069n = i4 - Integer.MIN_VALUE;
                    } else {
                        c20Var = new c20(this, abstractC0882xm);
                    }
                } else {
                    c20Var = new c20(this, abstractC0882xm);
                }
                Object obj2 = c20Var.f1068m;
                int i5 = c20Var.f1069n;
                if (i5 == 0) {
                    wo1.m5395v(obj2);
                    C0312i6 c0312i7 = (C0312i6) this.f3447k;
                    e20 e20Var2 = new e20((C0219fp) this.f3448l, u10Var);
                    try {
                        c20Var.f1071p = e20Var2;
                        c20Var.f1069n = 1;
                        return c0312i7.mo622r(e20Var2, c20Var) == enumC0513nn ? enumC0513nn : kf1Var;
                    } catch (C0080c e) {
                        e = e;
                        e20Var = e20Var2;
                    }
                } else {
                    if (i5 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e20Var = c20Var.f1071p;
                    try {
                        wo1.m5395v(obj2);
                        return kf1Var;
                    } catch (C0080c e2) {
                        e = e2;
                    }
                }
                if (e.f1054j == e20Var) {
                    return kf1Var;
                }
                throw e;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m2547s(AbstractC0751u2 abstractC0751u2, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0828w5) this.f3448l).f8393I;
        WeakHashMap weakHashMap = ai1.f194a;
        viewGroup.requestApplyInsets();
        f71 f71Var = (f71) this.f3447k;
        ActionMode.Callback callback = (ActionMode.Callback) f71Var.f2334k;
        rb1 rb1VarM1664j = f71Var.m1664j(abstractC0751u2);
        w71 w71Var = (w71) f71Var.f2337n;
        Menu ho0Var = (Menu) w71Var.get(menu);
        if (ho0Var == null) {
            ho0Var = new ho0((Context) f71Var.f2335l, (on0) menu);
            w71Var.put(menu, ho0Var);
        }
        return callback.onPrepareActionMode(rb1VarM1664j, ho0Var);
    }

    /* JADX INFO: renamed from: t */
    public void m2548t(k40 k40Var) {
        ja0 ja0Var = (ja0) this.f3448l;
        an0 an0Var = (an0) this.f3447k;
        int i = k40Var.f4280b;
        if (i == 0) {
            ja0Var.execute(new RunnableC0529o2(an0Var, k40Var.f4279a, 1, false));
        } else {
            ja0Var.execute(new RunnableC0393ke(an0Var, i));
        }
    }

    public String toString() {
        switch (this.f3446j) {
            case 25:
                return ((InterfaceC0350j8) this.f3448l).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public void m2549u(Context context, XmlResourceParser xmlResourceParser) {
        C0103cm c0103cm = new C0103cm();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C0881xl c0881xlM968c = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c0881xlM968c == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0881xlM968c.f8987d.m5811a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c0881xlM968c == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0881xlM968c.f8986c.m5935a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c0881xlM968c = C0103cm.m968c(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c0881xlM968c == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0881xlM968c.f8985b.m275a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c0881xlM968c == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0881xlM968c.f8988e.m723a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c0881xlM968c = C0103cm.m968c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c0881xlM968c.f8987d.f9347a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (c0881xlM968c != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C0622ql.m4110a(context, xmlResourceParser, c0881xlM968c.f8989f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c0881xlM968c = C0103cm.m968c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c0881xlM968c.f8987d.f9362h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c0881xlM968c != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C0622ql.m4110a(context, xmlResourceParser, c0881xlM968c.f8989f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c0881xlM968c = C0103cm.m968c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c0103cm.f1293c.put(Integer.valueOf(c0881xlM968c.f8984a), c0881xlM968c);
                                        c0881xlM968c = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c0103cm.f1293c.put(Integer.valueOf(c0881xlM968c.f8984a), c0881xlM968c);
                                        c0881xlM968c = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c0103cm.f1293c.put(Integer.valueOf(c0881xlM968c.f8984a), c0881xlM968c);
                                        c0881xlM968c = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.f3448l).put(identifier, c0103cm);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                ((SparseArray) this.f3448l).put(identifier, c0103cm);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public v92 m2550v(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        int i = 0;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f3447k;
        fn0 fn0Var = (fn0) this.f3448l;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? hn0.m2312c(fn0Var, new CallableC0340iz(i, context, intent)).m5129e(fn0Var, new InterfaceC0845wm() { // from class: jz
            @Override // p000.InterfaceC0845wm
            /* JADX INFO: renamed from: p */
            public final Object mo92p(v92 v92Var) {
                return ((Integer) v92Var.m5131g()).intValue() != 402 ? v92Var : C0312i6.m2534f(context, intent, z2).m5128d(new fn0(), new C0042ay(1));
            }
        }) : m2534f(context, intent, z2);
    }

    /* JADX INFO: renamed from: w */
    public void m2551w(String str) {
        C0408kt c0408kt;
        synchronized (this) {
            try {
                c0408kt = (C0408kt) ((HashMap) this.f3447k).get(str);
                o80.m3647h(c0408kt, "Argument must not be null");
                int i = c0408kt.f4511b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0408kt.f4511b);
                }
                int i2 = i - 1;
                c0408kt.f4511b = i2;
                if (i2 == 0) {
                    C0408kt c0408kt2 = (C0408kt) ((HashMap) this.f3447k).remove(str);
                    if (!c0408kt2.equals(c0408kt)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0408kt + ", but actually removed: " + c0408kt2 + ", safeKey: " + str);
                    }
                    C0207fd c0207fd = (C0207fd) this.f3448l;
                    synchronized (c0207fd.f2378a) {
                        try {
                            if (c0207fd.f2378a.size() < 10) {
                                c0207fd.f2378a.offer(c0408kt2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c0408kt.f4510a.unlock();
    }

    /* JADX INFO: renamed from: x */
    public void m2552x() {
        try {
            ((FileLock) this.f3448l).release();
            ((FileChannel) this.f3447k).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m2553y(C0794v8 c0794v8, Object obj) {
        if (((IdentityHashMap) this.f3448l) == null) {
            this.f3448l = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f3448l).put(c0794v8, obj);
    }

    /* JADX INFO: renamed from: z */
    public void m2554z(boolean z) {
        C0116cw c0116cw = (C0116cw) ((C0312i6) ((nu1) this.f3448l).f5551k).f3448l;
        if (c0116cw.f1471l != z) {
            if (c0116cw.f1470k != null) {
                C0595pv c0595pvM3994a = C0595pv.m3994a();
                C0077bw c0077bw = c0116cw.f1470k;
                c0595pvM3994a.getClass();
                hn0.m2313g(c0077bw, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0595pvM3994a.f6262a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0595pvM3994a.f6263b.remove(c0077bw);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c0116cw.f1471l = z;
            if (z) {
                C0116cw.m1037a(c0116cw.f1469j, C0595pv.m3994a().m3995b());
            }
        }
    }

    public /* synthetic */ C0312i6(int i, Object obj, Object obj2) {
        this.f3446j = i;
        this.f3447k = obj;
        this.f3448l = obj2;
    }

    public /* synthetic */ C0312i6(int i, boolean z) {
        this.f3446j = i;
    }

    public C0312i6(String str, wo1 wo1Var, wa0 wa0Var) {
        this.f3446j = 6;
        this.f3448l = str;
        this.f3447k = wo1Var;
    }

    public C0312i6(C0177ek c0177ek, String str, vk1 vk1Var) {
        this.f3446j = 4;
        this.f3447k = c0177ek;
        this.f3448l = str;
    }

    public C0312i6(tu0 tu0Var, hb1 hb1Var) {
        this.f3446j = 10;
        ry0 ry0Var = new ry0();
        ry0Var.f6989a = tu0Var;
        tu0Var.m4850a(new C0468mf(9, ry0Var));
        this.f3447k = ry0Var;
        this.f3448l = hb1Var;
    }

    public /* synthetic */ C0312i6(int i, Object obj) {
        this.f3446j = i;
        this.f3447k = obj;
    }

    public C0312i6(int i) {
        this.f3446j = i;
        switch (i) {
            case 22:
                this.f3447k = new HashMap();
                this.f3448l = new C0207fd(1);
                break;
            case 26:
                this.f3447k = new AtomicReference(jc0.f3900k);
                this.f3448l = new qd0(18);
                break;
            default:
                nc1 nc1Var = nc1.f5376o;
                this.f3448l = p80.m3867l();
                this.f3447k = nc1Var;
                break;
        }
    }

    public C0312i6(String str) {
        this.f3446j = 12;
        oj0 oj0VarM3693a = oj0.m3693a();
        a90.m127k(oj0VarM3693a, "registry");
        this.f3447k = oj0VarM3693a;
        a90.m127k(str, "defaultPolicy");
        this.f3448l = str;
    }

    public C0312i6(Context context) {
        this.f3446j = 1;
        this.f3447k = context;
        this.f3448l = new fn0();
    }

    @Override // p000.InterfaceC0201f7
    /* JADX INFO: renamed from: d */
    public void mo1646d(int i, float f) {
    }

    public C0312i6(AbstractC0284hf abstractC0284hf) {
        this.f3446j = 16;
        this.f3448l = abstractC0284hf;
    }

    public C0312i6(C0276h7 c0276h7) {
        this.f3446j = 9;
        this.f3448l = c0276h7;
        this.f3447k = c0276h7;
    }

    public C0312i6(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5, f71 f71Var) {
        this.f3446j = 7;
        this.f3448l = layoutInflaterFactory2C0828w5;
        this.f3447k = f71Var;
    }
}
