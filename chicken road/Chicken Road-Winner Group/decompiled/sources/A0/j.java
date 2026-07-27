package A0;

import A2.u;
import I1.A;
import I1.w;
import I1.x;
import I1.y;
import I1.z;
import U.AbstractC0061a;
import U.C0062b;
import Y1.C0077a;
import a.AbstractC0086a;
import a2.AbstractC0101K;
import a2.C0100J;
import a2.C0104N;
import a2.C0110f;
import a2.C0112h;
import a2.EnumC0102L;
import a2.InterfaceC0111g;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.recyclerview.widget.RecyclerView;
import b.C0153b;
import com.google.android.gms.internal.play_billing.C0194i;
import d2.C0279i;
import e.C0285f;
import e2.AbstractC0292g;
import g0.C0311j;
import g2.InterfaceC0319c;
import h.AbstractC0323a;
import h2.EnumC0326a;
import io.appmetrica.analytics.impl.C0644l9;
import io.flutter.embedding.engine.FlutterJNI;
import j1.C1054b;
import j1.InterfaceC1056d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinVersion;
import l.C1099s;
import l.s0;
import l1.C1107a;
import m0.E;
import o.BinderC1143a;
import org.xmlpull.v1.XmlPullParserException;
import p.C1156f;
import v.AbstractC1216f;
import v.InterfaceC1212b;
import x0.C1248a;
import x0.C1249b;
import y1.AbstractAsyncTaskC1252a;

/* loaded from: classes.dex */
public final class j implements C0.b, T1.d, InterfaceC0111g, z2.d {

    /* renamed from: e, reason: collision with root package name */
    public static j f64e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* renamed from: b, reason: collision with root package name */
    public Object f66b;

    /* renamed from: c, reason: collision with root package name */
    public Object f67c;

    /* renamed from: d, reason: collision with root package name */
    public Object f68d;

    public /* synthetic */ j(int i3, boolean z3) {
        this.f65a = i3;
    }

    public static j F() {
        if (f64e == null) {
            P0.j jVar = new P0.j(5);
            H1.a aVar = new H1.a();
            aVar.f509a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            N1.d dVar = new N1.d();
            dVar.f998a = false;
            dVar.f999b = false;
            dVar.f = flutterJNI;
            dVar.f1003g = newCachedThreadPool;
            j jVar2 = new j(5, false);
            jVar2.f66b = dVar;
            jVar2.f67c = jVar;
            jVar2.f68d = newCachedThreadPool;
            f64e = jVar2;
        }
        return f64e;
    }

    public static j I(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public Drawable A(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f67c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : AbstractC0323a.a((Context) this.f66b, resourceId);
    }

    public Typeface B(int i3, int i4, C1099s c1099s) {
        C1099s c1099s2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int i5 = 18;
        int resourceId = ((TypedArray) this.f67c).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f68d) == null) {
                this.f68d = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f68d;
            Object obj = AbstractC1216f.f10405a;
            Context context = (Context) this.f66b;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    c1099s.a();
                    return null;
                }
                int i6 = typedValue.assetCookie;
                C1156f c1156f = w.d.f10439b;
                Typeface typeface = (Typeface) c1156f.a(w.d.b(resources, resourceId, charSequence2, i6, i4));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new D1.a(c1099s, i5, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e3) {
                    e = e3;
                    c1099s2 = c1099s;
                } catch (XmlPullParserException e4) {
                    e = e4;
                    c1099s2 = c1099s;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        int i7 = typedValue.assetCookie;
                        Typeface o3 = w.d.f10438a.o(context, resources, resourceId, charSequence2, i4);
                        if (o3 != null) {
                            c1156f.b(w.d.b(resources, resourceId, charSequence2, i7, i4), o3);
                        }
                        if (o3 != null) {
                            new Handler(Looper.getMainLooper()).post(new D1.a(c1099s, i5, o3));
                        } else {
                            c1099s.a();
                        }
                        return o3;
                    }
                    InterfaceC1212b J2 = AbstractC0086a.J(resources.getXml(resourceId), resources);
                    if (J2 != null) {
                        return w.d.a(context, J2, resources, resourceId, charSequence2, typedValue.assetCookie, i4, c1099s);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c1099s.a();
                        return null;
                    } catch (IOException e5) {
                        iOException = e5;
                        c1099s2 = c1099s;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        c1099s2.a();
                        return null;
                    } catch (XmlPullParserException e6) {
                        xmlPullParserException = e6;
                        c1099s2 = c1099s;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        c1099s2.a();
                        return null;
                    }
                } catch (IOException e7) {
                    e = e7;
                    iOException = e;
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                    c1099s2.a();
                    return null;
                } catch (XmlPullParserException e8) {
                    e = e8;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                    c1099s2.a();
                    return null;
                }
            }
        }
        return null;
    }

    public View C(int i3) {
        return ((RecyclerView) ((b0.i) this.f66b).f2461b).getChildAt(i3);
    }

    public int D() {
        return ((RecyclerView) ((b0.i) this.f66b).f2461b).getChildCount();
    }

    public boolean E(KeyEvent keyEvent) {
        if (((HashSet) this.f67c).remove(keyEvent)) {
            return false;
        }
        z[] zVarArr = (z[]) this.f66b;
        if (zVarArr.length <= 0) {
            J(keyEvent);
            return true;
        }
        y yVar = new y();
        yVar.f687d = this;
        yVar.f685b = ((z[]) this.f66b).length;
        yVar.f684a = false;
        yVar.f686c = keyEvent;
        for (z zVar : zVarArr) {
            x xVar = new x();
            xVar.f683b = yVar;
            xVar.f682a = false;
            zVar.e(keyEvent, xVar);
        }
        return true;
    }

    public void G(C0285f c0285f) {
        c.f fVar = (c.f) this.f68d;
        HashMap hashMap = fVar.f2489b;
        String str = (String) this.f66b;
        Integer num = (Integer) hashMap.get(str);
        C0077a c0077a = (C0077a) this.f67c;
        if (num != null) {
            fVar.f2491d.add(str);
            try {
                fVar.b(num.intValue(), c0077a, c0285f);
                return;
            } catch (Exception e3) {
                fVar.f2491d.remove(str);
                throw e3;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0077a + " and input " + c0285f + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public void H(Uri uri, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        try {
            ((C0153b) ((b.d) this.f66b)).a((BinderC1143a) this.f67c, uri, bundle, arrayList);
        } catch (RemoteException unused) {
        }
    }

    public void J(KeyEvent keyEvent) {
        InputConnection inputConnection;
        A a3 = (A) this.f68d;
        if (a3 != null) {
            io.flutter.plugin.editing.l lVar = ((I1.q) a3).f652l;
            boolean z3 = false;
            if (lVar.f9218b.isAcceptingText() && (inputConnection = lVar.f9225j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.e) {
                    io.flutter.plugin.editing.e eVar = (io.flutter.plugin.editing.e) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z3 = eVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z3 = eVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z3 = eVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z3 = eVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = eVar.f9184e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    eVar.performEditorAction(editorInfo.imeOptions & KotlinVersion.MAX_COMPONENT_VALUE);
                                    z3 = true;
                                }
                            }
                            io.flutter.plugin.editing.h hVar = eVar.f9183d;
                            int selectionStart = Selection.getSelectionStart(hVar);
                            int selectionEnd = Selection.getSelectionEnd(hVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                eVar.beginBatchEdit();
                                if (min != max) {
                                    hVar.delete(min, max);
                                }
                                hVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i3 = min + 1;
                                eVar.setSelection(i3, i3);
                                eVar.endBatchEdit();
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z3) {
                return;
            }
            HashSet hashSet = (HashSet) this.f67c;
            hashSet.add(keyEvent);
            ((I1.q) a3).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void K(Activity activity, C0311j c0311j) {
        kotlin.jvm.internal.j.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f67c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f68d;
        try {
            if (c0311j.equals((C0311j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((j0.k) ((io.flutter.plugin.editing.k) this.f66b).f9216a).f9525b.iterator();
            while (it.hasNext()) {
                j0.j jVar = (j0.j) it.next();
                if (jVar.f9519a.equals(activity)) {
                    jVar.f9521c = c0311j;
                    jVar.f9520b.accept(c0311j);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void L() {
        ((TypedArray) this.f67c).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f9945a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f9945a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M(ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            AbstractC0061a instance = (AbstractC0061a) arrayList.get(i3);
            instance.getClass();
            E e3 = (E) this.f66b;
            e3.getClass();
            kotlin.jvm.internal.j.e(instance, "instance");
            int i4 = e3.f9945a;
            int i5 = 0;
            while (true) {
                Object[] objArr = (Object[]) e3.f9946b;
                if (i5 >= i4) {
                    break;
                } else {
                    if (objArr[i5] == instance) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i5++;
                }
            }
        }
        arrayList.clear();
    }

    public void N(C1248a c1248a) {
        r rVar = new r(0);
        k kVar = (k) this.f66b;
        C1249b c1249b = (C1249b) this.f67c;
        s sVar = (s) this.f68d;
        x0.c cVar = x0.c.f10540a;
        j a3 = k.a();
        a3.O(kVar.f69a);
        a3.f68d = cVar;
        a3.f67c = kVar.f70b;
        k t3 = a3.t();
        h hVar = new h();
        hVar.f58g = new HashMap();
        hVar.f57e = Long.valueOf(sVar.f86a.c());
        hVar.f = Long.valueOf(sVar.f87b.c());
        hVar.f54b = "PLAY_BILLING_LIBRARY";
        hVar.f56d = new n(c1249b, c1248a.f10538a.b());
        hVar.f55c = null;
        i c3 = hVar.c();
        F0.c cVar2 = (F0.c) sVar.f88c;
        cVar2.getClass();
        cVar2.f371b.execute(new F0.a(cVar2, t3, rVar, c3));
    }

    public void O(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f66b = str;
    }

    public void P(a1.e eVar) {
        ((T1.f) this.f67c).h((String) this.f66b, eVar == null ? null : new j(this, eVar));
    }

    public Bundle Q() {
        Bundle bundle = new Bundle();
        Integer num = (Integer) this.f66b;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) this.f67c;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) this.f68d;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    public void R() {
        synchronized (((HashMap) this.f66b)) {
            try {
                Iterator it = ((HashMap) this.f66b).values().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f66b).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f68d)) {
            try {
                Iterator it2 = ((HashMap) this.f68d).values().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f68d).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f67c)) {
            try {
                Iterator it3 = ((HashMap) this.f67c).values().iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f67c).clear();
            } finally {
            }
        }
    }

    @Override // a2.InterfaceC0111g
    public void a(String str, long j3, C0112h c0112h) {
        u(c0112h).edit().putLong(str, j3).apply();
    }

    @Override // a2.InterfaceC0111g
    public C0104N b(String str, C0112h c0112h) {
        SharedPreferences u3 = u(c0112h);
        if (!u3.contains(str)) {
            return null;
        }
        String string = u3.getString(str, "");
        kotlin.jvm.internal.j.b(string);
        return v2.m.q0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new C0104N(string, EnumC0102L.JSON_ENCODED) : v2.m.q0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new C0104N(null, EnumC0102L.PLATFORM_ENCODED) : new C0104N(null, EnumC0102L.UNEXPECTED_STRING);
    }

    @Override // a2.InterfaceC0111g
    public void c(List list, C0112h c0112h) {
        SharedPreferences u3 = u(c0112h);
        SharedPreferences.Editor edit = u3.edit();
        kotlin.jvm.internal.j.d(edit, "edit(...)");
        Map<String, ?> all = u3.getAll();
        kotlin.jvm.internal.j.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (AbstractC0101K.b(str, all.get(str), list != null ? AbstractC0292g.h0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.j.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // a2.InterfaceC0111g
    public Double d(String str, C0112h c0112h) {
        SharedPreferences u3 = u(c0112h);
        if (!u3.contains(str)) {
            return null;
        }
        Object c3 = AbstractC0101K.c(u3.getString(str, ""), (C0077a) this.f68d);
        kotlin.jvm.internal.j.c(c3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c3;
    }

    @Override // a2.InterfaceC0111g
    public void e(String str, String str2, C0112h c0112h) {
        u(c0112h).edit().putString(str, str2).apply();
    }

    @Override // a2.InterfaceC0111g
    public Map f(List list, C0112h c0112h) {
        Object value;
        Map<String, ?> all = u(c0112h).getAll();
        kotlin.jvm.internal.j.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (AbstractC0101K.b(entry.getKey(), entry.getValue(), list != null ? AbstractC0292g.h0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c3 = AbstractC0101K.c(value, (C0077a) this.f68d);
                kotlin.jvm.internal.j.c(c3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c3);
            }
        }
        return hashMap;
    }

    @Override // a2.InterfaceC0111g
    public void g(String str, String str2, C0112h c0112h) {
        u(c0112h).edit().putString(str, str2).apply();
    }

    @Override // c2.a
    public Object get() {
        switch (this.f65a) {
            case 3:
                return new s(new P0.j(4), new P0.j(3), (F0.d) ((A.e) this.f66b).get(), (G0.l) ((s0) this.f67c).get(), (G0.n) ((D0.a) this.f68d).get());
            default:
                return new G0.d((Context) ((b0.i) this.f66b).f2461b, (H0.d) ((c2.a) this.f67c).get(), (G0.b) ((P0.j) this.f68d).get());
        }
    }

    @Override // a2.InterfaceC0111g
    public List h(List list, C0112h c0112h) {
        Map<String, ?> all = u(c0112h).getAll();
        kotlin.jvm.internal.j.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            kotlin.jvm.internal.j.d(key, "<get-key>(...)");
            if (AbstractC0101K.b(key, entry.getValue(), list != null ? AbstractC0292g.h0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0292g.f0(linkedHashMap.keySet());
    }

    @Override // a2.InterfaceC0111g
    public Long i(String str, C0112h c0112h) {
        long j3;
        SharedPreferences u3 = u(c0112h);
        if (!u3.contains(str)) {
            return null;
        }
        try {
            j3 = u3.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j3 = u3.getInt(str, 0);
        }
        return Long.valueOf(j3);
    }

    @Override // a2.InterfaceC0111g
    public void j(String str, double d3, C0112h c0112h) {
        u(c0112h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    @Override // a2.InterfaceC0111g
    public void k(String str, List list, C0112h c0112h) {
        u(c0112h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((C0077a) this.f68d).f(list))).apply();
    }

    @Override // z2.d
    public Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        Object l3 = ((z2.d) this.f66b).l(new u(eVar, (N.d) this.f67c, (C0100J) this.f68d, 1), interfaceC0319c);
        return l3 == EnumC0326a.f4994a ? l3 : C0279i.f4852a;
    }

    @Override // a2.InterfaceC0111g
    public Boolean m(String str, C0112h c0112h) {
        SharedPreferences u3 = u(c0112h);
        if (u3.contains(str)) {
            return Boolean.valueOf(u3.getBoolean(str, true));
        }
        return null;
    }

    @Override // a2.InterfaceC0111g
    public ArrayList n(String str, C0112h c0112h) {
        List list;
        SharedPreferences u3 = u(c0112h);
        if (!u3.contains(str)) {
            return null;
        }
        String string = u3.getString(str, "");
        kotlin.jvm.internal.j.b(string);
        if (!v2.m.q0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || v2.m.q0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || (list = (List) AbstractC0101K.c(u3.getString(str, ""), (C0077a) this.f68d)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // T1.d
    public void o(ByteBuffer byteBuffer, K1.g gVar) {
        j jVar = (j) this.f68d;
        String str = ((T1.s) jVar.f68d).e(byteBuffer).f1468a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f67c;
        String str2 = (String) jVar.f66b;
        T1.s sVar = (T1.s) jVar.f68d;
        a1.e eVar = (a1.e) this.f66b;
        if (!equals) {
            if (!str.equals("cancel")) {
                gVar.a(null);
                return;
            }
            if (((T1.g) atomicReference.getAndSet(null)) == null) {
                gVar.a(sVar.d("error", "No active stream to cancel", null));
                return;
            }
            try {
                eVar.f1789c = null;
                gVar.a(sVar.a(null));
                return;
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e3);
                gVar.a(sVar.d("error", e3.getMessage(), null));
                return;
            }
        }
        T1.g gVar2 = new T1.g(this);
        if (((T1.g) atomicReference.getAndSet(gVar2)) != null) {
            try {
                eVar.f1789c = null;
            } catch (RuntimeException e4) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e4);
            }
        }
        try {
            eVar.f1789c = gVar2;
            gVar.a(sVar.a(null));
        } catch (RuntimeException e5) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e5);
            gVar.a(sVar.d("error", e5.getMessage(), null));
        }
    }

    @Override // a2.InterfaceC0111g
    public void q(String str, boolean z3, C0112h c0112h) {
        u(c0112h).edit().putBoolean(str, z3).apply();
    }

    @Override // a2.InterfaceC0111g
    public String r(String str, C0112h c0112h) {
        SharedPreferences u3 = u(c0112h);
        if (u3.contains(str)) {
            return u3.getString(str, "");
        }
        return null;
    }

    public void s() {
        AbstractAsyncTaskC1252a abstractAsyncTaskC1252a = (AbstractAsyncTaskC1252a) ((ArrayDeque) this.f67c).poll();
        this.f68d = abstractAsyncTaskC1252a;
        if (abstractAsyncTaskC1252a != null) {
            abstractAsyncTaskC1252a.executeOnExecutor((ThreadPoolExecutor) this.f66b, new Object[0]);
        }
    }

    public k t() {
        String str = ((String) this.f66b) == null ? " backendName" : "";
        if (((x0.c) this.f68d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new k((String) this.f66b, (byte[]) this.f67c, (x0.c) this.f68d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String toString() {
        switch (this.f65a) {
            case 13:
                return ((C0062b) this.f67c).toString() + ", hidden list:" + ((ArrayList) this.f68d).size();
            case 16:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f66b);
                sb.append('{');
                C0194i c0194i = ((C0194i) this.f67c).f2765b;
                String str = "";
                while (c0194i != null) {
                    Object obj = c0194i.f2764a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c0194i = c0194i.f2765b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public SharedPreferences u(C0112h c0112h) {
        String str = c0112h.f1842a;
        Context context = (Context) this.f67c;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            kotlin.jvm.internal.j.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        kotlin.jvm.internal.j.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void v(int i3, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f67c).dispatchSemanticsAction(i3, fVar);
    }

    public void w(int i3, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f67c).dispatchSemanticsAction(i3, fVar, serializable);
    }

    public void x(D0.b bVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f67c;
        HashMap hashMap2 = (HashMap) this.f66b;
        m1.e eVar = new m1.e(byteArrayOutputStream, hashMap2, hashMap, (C1107a) this.f68d);
        InterfaceC1056d interfaceC1056d = (InterfaceC1056d) hashMap2.get(D0.b.class);
        if (interfaceC1056d != null) {
            interfaceC1056d.a(bVar, eVar);
        } else {
            throw new C1054b("No encoder for " + D0.b.class);
        }
    }

    public int y(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f68d;
        int size = arrayList.size();
        while (i4 < size) {
            ((AbstractC0061a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList z(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f67c;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            Object obj = AbstractC0323a.f4982a;
            ColorStateList colorStateList = ((Context) this.f66b).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i3);
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i3) {
        this.f65a = i3;
        this.f66b = obj;
        this.f67c = obj2;
        this.f68d = obj3;
    }

    public j(C0077a c0077a) {
        this.f65a = 17;
        this.f66b = new HashMap();
        this.f67c = new HashMap();
        this.f68d = new HashMap();
    }

    public j(String str) {
        this.f65a = 16;
        C0194i c0194i = new C0194i();
        this.f67c = c0194i;
        this.f68d = c0194i;
        this.f66b = str;
    }

    public j(c.f fVar, String str, C0077a c0077a) {
        this.f65a = 18;
        this.f68d = fVar;
        this.f66b = str;
        this.f67c = c0077a;
    }

    public j(k kVar, C1249b c1249b, C0077a c0077a, s sVar) {
        this.f65a = 2;
        this.f66b = kVar;
        this.f67c = c1249b;
        this.f68d = sVar;
    }

    public j(T1.f fVar, String str) {
        this.f65a = 11;
        T1.s sVar = T1.s.f1473b;
        this.f67c = fVar;
        this.f66b = str;
        this.f68d = sVar;
    }

    public j(b0.i iVar) {
        this.f65a = 13;
        this.f66b = iVar;
        this.f67c = new C0062b();
        this.f68d = new ArrayList();
    }

    public j(Context context, TypedArray typedArray) {
        this.f65a = 20;
        this.f66b = context;
        this.f67c = typedArray;
    }

    public j(P0.j jVar) {
        this.f65a = 12;
        this.f66b = new E(30);
        this.f67c = new ArrayList();
        this.f68d = new ArrayList();
        new P0.j(25, this);
    }

    public j(K1.b bVar, FlutterJNI flutterJNI) {
        this.f65a = 8;
        J1.i iVar = new J1.i(12, this);
        D0.a aVar = new D0.a((T1.f) bVar, "flutter/accessibility", (T1.k) T1.r.INSTANCE, (P0.j) null);
        this.f66b = aVar;
        aVar.g(iVar);
        this.f67c = flutterJNI;
    }

    public j(A a3) {
        this.f65a = 6;
        this.f67c = new HashSet();
        this.f68d = a3;
        I1.q qVar = (I1.q) a3;
        this.f66b = new z[]{new w(qVar.getBinaryMessenger()), new a1.e(new b0.i(qVar.getBinaryMessenger()))};
        new J1.i(qVar.getBinaryMessenger()).f729b = this;
    }

    public j(int i3) {
        this.f65a = i3;
        switch (i3) {
            case C0644l9.f7762F /* 25 */:
                this.f67c = new ArrayDeque();
                this.f68d = null;
                this.f66b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                this.f66b = new ConcurrentLinkedQueue();
                break;
        }
    }

    public j(j jVar, a1.e eVar) {
        this.f65a = 10;
        this.f68d = jVar;
        this.f67c = new AtomicReference(null);
        this.f66b = eVar;
    }

    public j(T1.f messenger, Context context, C0077a c0077a) {
        this.f65a = 14;
        kotlin.jvm.internal.j.e(messenger, "messenger");
        kotlin.jvm.internal.j.e(context, "context");
        this.f66b = messenger;
        this.f67c = context;
        this.f68d = c0077a;
        try {
            InterfaceC0111g.f1841u0.getClass();
            C0110f.b(messenger, this, "shared_preferences");
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e3);
        }
    }

    public j(io.flutter.plugin.editing.k kVar) {
        this.f65a = 19;
        this.f66b = kVar;
        this.f67c = new ReentrantLock();
        this.f68d = new WeakHashMap();
    }

    public j(URL url, z0.i iVar, String str) {
        this.f65a = 24;
        this.f67c = url;
        this.f68d = iVar;
        this.f66b = str;
    }
}
