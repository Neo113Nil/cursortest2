package E;

import F.F;
import F.G;
import F.H;
import F.I;
import F.x;
import K.d;
import O.l;
import P.j;
import P.k;
import android.app.Activity;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import g0.h;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.i;
import io.flutter.view.f;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static b f17d;

    /* renamed from: a, reason: collision with root package name */
    public Object f18a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f18a = obj;
        this.f19b = obj2;
        this.f20c = obj3;
    }

    public static b d() {
        if (f17d == null) {
            C.b bVar = new C.b(2);
            a aVar = new a();
            aVar.f16a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            d dVar = new d();
            dVar.f275a = false;
            dVar.f276b = false;
            dVar.f280f = flutterJNI;
            dVar.f281g = newCachedThreadPool;
            b bVar2 = new b();
            bVar2.f18a = dVar;
            bVar2.f19b = bVar;
            bVar2.f20c = newCachedThreadPool;
            f17d = bVar2;
        }
        return f17d;
    }

    public void a(int i2, f fVar) {
        ((FlutterJNI) this.f19b).dispatchSemanticsAction(i2, fVar);
    }

    public void b(int i2, f fVar, Serializable serializable) {
        ((FlutterJNI) this.f19b).dispatchSemanticsAction(i2, fVar, serializable);
    }

    public boolean c(KeyEvent keyEvent) {
        H[] hArr = (H[]) this.f18a;
        if (((HashSet) this.f19b).remove(keyEvent)) {
            return false;
        }
        if (hArr.length <= 0) {
            f(keyEvent);
            return true;
        }
        G g2 = new G(this, keyEvent);
        for (H h2 : hArr) {
            h2.b(keyEvent, new F(g2));
        }
        return true;
    }

    public void e(String str, Object obj, l lVar) {
        ((P.f) this.f18a).b((String) this.f19b, ((k) this.f20c).f(new C.a(12, str, obj)), lVar == null ? null : new P.a(1, this, lVar));
    }

    public void f(KeyEvent keyEvent) {
        c cVar;
        HashSet hashSet = (HashSet) this.f19b;
        I i2 = (I) this.f20c;
        if (i2 != null) {
            x xVar = (x) i2;
            io.flutter.plugin.editing.l lVar = xVar.f133l;
            boolean z2 = false;
            if (lVar.f647b.isAcceptingText() && (cVar = lVar.f655j) != null) {
                io.flutter.plugin.editing.f fVar = cVar.f604d;
                if (keyEvent.getAction() == 0) {
                    if (keyEvent.getKeyCode() == 21) {
                        z2 = cVar.d(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 22) {
                        z2 = cVar.d(false, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 19) {
                        z2 = cVar.e(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 20) {
                        z2 = cVar.e(false, keyEvent.isShiftPressed());
                    } else {
                        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = cVar.f605e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                cVar.performEditorAction(editorInfo.imeOptions & 255);
                                z2 = true;
                            }
                        }
                        int selectionStart = Selection.getSelectionStart(fVar);
                        int selectionEnd = Selection.getSelectionEnd(fVar);
                        int unicodeChar = keyEvent.getUnicodeChar();
                        if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                            int min = Math.min(selectionStart, selectionEnd);
                            int max = Math.max(selectionStart, selectionEnd);
                            cVar.beginBatchEdit();
                            if (min != max) {
                                fVar.delete(min, max);
                            }
                            fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                            int i3 = min + 1;
                            cVar.setSelection(i3, i3);
                            cVar.endBatchEdit();
                            z2 = true;
                        }
                    }
                }
            }
            if (z2) {
                return;
            }
            hashSet.add(keyEvent);
            xVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void g(Activity activity, w.k kVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f20c;
        h.e(activity, "activity");
        h.e(kVar, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f19b;
        reentrantLock.lock();
        try {
            if (kVar.equals((w.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((z.l) ((i) this.f18a).f675c).f1343b.iterator();
            while (it.hasNext()) {
                z.k kVar2 = (z.k) it.next();
                if (kVar2.f1337a.equals(activity)) {
                    kVar2.f1339c = kVar;
                    kVar2.f1338b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void h(j jVar) {
        ((P.f) this.f18a).i((String) this.f19b, new C.a(this, jVar, 13, false));
    }
}
