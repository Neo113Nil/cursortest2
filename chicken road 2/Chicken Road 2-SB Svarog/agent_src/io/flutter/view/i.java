package io.flutter.view;

import F.u;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f807x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f808a;

    /* renamed from: b, reason: collision with root package name */
    public final E.b f809b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f810c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f811d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f812e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f813f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f814g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f815h;

    /* renamed from: i, reason: collision with root package name */
    public h f816i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f817j;

    /* renamed from: k, reason: collision with root package name */
    public int f818k;

    /* renamed from: l, reason: collision with root package name */
    public String f819l;

    /* renamed from: m, reason: collision with root package name */
    public h f820m;

    /* renamed from: n, reason: collision with root package name */
    public h f821n;

    /* renamed from: o, reason: collision with root package name */
    public h f822o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f823p;

    /* renamed from: q, reason: collision with root package name */
    public int f824q;

    /* renamed from: r, reason: collision with root package name */
    public F.t f825r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f826s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f827t;

    /* renamed from: u, reason: collision with root package name */
    public final d f828u;
    public final e v;

    /* renamed from: w, reason: collision with root package name */
    public final u f829w;

    public i(View view, E.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f814g = new HashMap();
        this.f815h = new HashMap();
        this.f818k = 0;
        this.f823p = new ArrayList();
        this.f824q = 0;
        this.f826s = false;
        this.f827t = false;
        c cVar = new c(this);
        d dVar = new d(this);
        this.f828u = dVar;
        u uVar = new u(this, new Handler(), 1);
        this.f829w = uVar;
        this.f808a = view;
        this.f809b = bVar;
        this.f810c = accessibilityManager;
        this.f813f = contentResolver;
        this.f811d = accessibilityViewEmbedder;
        this.f812e = hVar;
        bVar.f20c = cVar;
        ((FlutterJNI) bVar.f19b).setAccessibilityDelegate(cVar);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.v = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        this.f818k |= 128;
        uVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, uVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f818k &= -9;
            } else {
                this.f818k |= 8;
            }
            ((FlutterJNI) bVar.f19b).setAccessibilityFeatures(this.f818k);
        }
        hVar.e(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final g a(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f815h;
        g gVar = (g) hashMap.get(valueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f751c = -1;
        gVar2.f750b = i2;
        gVar2.f749a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    public final h b(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f814g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f779b = i2;
        hashMap.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05ff  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        boolean h2;
        boolean z2;
        int i3;
        h hVar;
        ?? r1;
        int size;
        ?? r7;
        String str;
        float parseFloat;
        String str2;
        float parseFloat2;
        int i4;
        int i5;
        i(true);
        if (i2 >= 65536) {
            return this.f811d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f814g;
        View view = this.f808a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        h hVar2 = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar2 == null) {
            return null;
        }
        int i6 = hVar2.f790i;
        io.flutter.plugin.platform.h hVar3 = this.f812e;
        if (i6 != -1 && hVar3.j(i6)) {
            hVar3.r(hVar2.f790i);
            return null;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((hVar2.h(12) || (h.b(hVar2) == null && hVar2.f783d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        String str3 = hVar2.f796o;
        if (str3 != null) {
            obtain2.setViewIdResourceName(str3);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        obtain2.setFocusable(hVar2.j());
        h hVar4 = this.f820m;
        if (hVar4 != null) {
            obtain2.setFocused(hVar4.f779b == i2);
        }
        h hVar5 = this.f816i;
        if (hVar5 != null) {
            obtain2.setAccessibilityFocused(hVar5.f779b == i2);
        }
        if (hVar2.h(5)) {
            obtain2.setPassword(hVar2.h(11));
            if (!hVar2.h(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!hVar2.h(21));
            int i7 = hVar2.f788g;
            if (i7 != -1 && (i5 = hVar2.f789h) != -1) {
                obtain2.setTextSelection(i7, i5);
            }
            h hVar6 = this.f816i;
            if (hVar6 != null && hVar6.f779b == i2) {
                obtain2.setLiveRegion(1);
            }
            if (h.a(hVar2, f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i4 = 1;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i4 |= 2;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i4 |= 2;
            }
            obtain2.setMovementGranularities(i4);
            if (hVar2.f785e >= 0) {
                String str4 = hVar2.f799r;
                obtain2.setMaxTextLength(((str4 == null ? 0 : str4.length()) - hVar2.f786f) + hVar2.f785e);
            }
        }
        if (h.a(hVar2, f.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (h.a(hVar2, f.COPY)) {
            obtain2.addAction(16384);
        }
        if (h.a(hVar2, f.CUT)) {
            obtain2.addAction(65536);
        }
        if (h.a(hVar2, f.PASTE)) {
            obtain2.addAction(32768);
        }
        if (h.a(hVar2, f.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (hVar2.h(4)) {
            h2 = true;
        } else {
            String str5 = hVar2.f754A;
            h2 = (str5 == null || str5.isEmpty()) ? hVar2.h(23) : false;
        }
        if (h2) {
            obtain2.setClassName("android.widget.Button");
        }
        if (hVar2.h(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (AbstractC0071c.a(AbstractC0071c.b(33)[hVar2.f757E]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            if (hVar2.f799r != null) {
                String str6 = hVar2.f755C;
                try {
                    if (str6 != null) {
                        try {
                            parseFloat = Float.parseFloat(str6);
                        } catch (NumberFormatException unused) {
                        }
                        str2 = hVar2.f756D;
                        if (str2 != null) {
                            try {
                                parseFloat2 = Float.parseFloat(str2);
                            } catch (NumberFormatException unused2) {
                            }
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f799r)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f799r)));
                    }
                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f799r)));
                } catch (NumberFormatException unused3) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str2 = hVar2.f756D;
                if (str2 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (h.a(hVar2, f.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        h hVar7 = hVar2.f772V;
        if (hVar7 != null) {
            obtain2.setParent(view, hVar7.f779b);
        } else {
            obtain2.setParent(view);
        }
        int i8 = hVar2.f759G;
        if (i8 != -1) {
            obtain2.setTraversalAfter(view, i8);
        }
        Rect rect = hVar2.f787f0;
        h hVar8 = hVar2.f772V;
        if (hVar8 != null) {
            Rect rect2 = hVar8.f787f0;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!hVar2.h(7) || hVar2.h(8));
        if (h.a(hVar2, f.TAP)) {
            if (hVar2.f776Z != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar2.f776Z.f753e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (hVar2.h(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (h.a(hVar2, f.LONG_PRESS)) {
            if (hVar2.f778a0 != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar2.f778a0.f753e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        f fVar = f.SCROLL_LEFT;
        boolean a2 = h.a(hVar2, fVar);
        f fVar2 = f.SCROLL_DOWN;
        f fVar3 = f.SCROLL_UP;
        f fVar4 = f.SCROLL_RIGHT;
        if (a2 || h.a(hVar2, fVar3) || h.a(hVar2, fVar4) || h.a(hVar2, fVar2)) {
            obtain2.setScrollable(true);
            if (hVar2.h(19)) {
                if (h.a(hVar2, fVar) || h.a(hVar2, fVar4)) {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
        }
        if (j(hVar2)) {
            if (h.a(hVar2, fVar) || h.a(hVar2, fVar4)) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, hVar2.f791j, false));
                } else {
                    obtain2.setCollectionInfo(A.a.t(hVar2.f791j));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar2.f791j, 1, false));
            } else {
                obtain2.setCollectionInfo(A.a.k(hVar2.f791j));
            }
        }
        h hVar9 = hVar2.f772V;
        if (hVar9 != null && j(hVar9) && hVar2.f772V.h(19)) {
            h hVar10 = hVar2.f772V;
            ArrayList arrayList = hVar10.f773W;
            boolean z3 = (h.a(hVar10, fVar) || h.a(hVar10, fVar4)) ? false : true;
            int indexOf = arrayList.indexOf(hVar2);
            if (z3) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, hVar2.h(10)));
                } else {
                    obtain2.setCollectionItemInfo(A.a.u(indexOf, hVar2.h(10)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, hVar2.h(10)));
            } else {
                obtain2.setCollectionItemInfo(A.a.l(indexOf, hVar2.h(10)));
            }
        }
        if (h.a(hVar2, fVar) || h.a(hVar2, fVar3)) {
            obtain2.addAction(4096);
        }
        if (h.a(hVar2, fVar4) || h.a(hVar2, fVar2)) {
            obtain2.addAction(8192);
        }
        f fVar5 = f.INCREASE;
        boolean a3 = h.a(hVar2, fVar5);
        f fVar6 = f.DECREASE;
        if (a3 || h.a(hVar2, fVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (h.a(hVar2, fVar5)) {
                obtain2.addAction(4096);
            }
            if (h.a(hVar2, fVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (hVar2.h(16)) {
            obtain2.setLiveRegion(1);
        }
        if (hVar2.h(5)) {
            C.e eVar = new C.e();
            eVar.f8a = hVar2.f799r;
            eVar.f9b = hVar2.f800s;
            eVar.f10c = hVar2.d();
            obtain2.setText(eVar.a());
            if (Build.VERSION.SDK_INT >= 28) {
                C.e eVar2 = new C.e();
                eVar2.f8a = hVar2.f797p;
                eVar2.f9b = hVar2.f798q;
                eVar2.f11d = hVar2.f754A;
                eVar2.f10c = hVar2.d();
                SpannableString a4 = eVar2.a();
                C.e eVar3 = new C.e();
                eVar3.f8a = hVar2.f804x;
                eVar3.f9b = hVar2.f805y;
                eVar3.f10c = hVar2.d();
                CharSequence[] charSequenceArr = {a4, eVar3.a()};
                int i9 = 0;
                CharSequence charSequence = null;
                for (int i10 = 2; i9 < i10; i10 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i9];
                    if (charSequence2 != null && charSequence2.length() > 0) {
                        charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                    }
                    i9++;
                }
                z2 = false;
                obtain2.setHintText(charSequence);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
            if (!hVar2.h(12)) {
                CharSequence b2 = h.b(hVar2);
                if (Build.VERSION.SDK_INT < 28 && hVar2.f806z != null) {
                    b2 = ((Object) (b2 != null ? b2 : "")) + "\n" + hVar2.f806z;
                }
                if (b2 != null) {
                    obtain2.setContentDescription(b2);
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28 && (str = hVar2.f806z) != null) {
            obtain2.setTooltipText(str);
            if (h.b(hVar2) == null) {
                obtain2.setContentDescription(hVar2.f806z);
            }
        }
        boolean h3 = hVar2.h(1);
        boolean h4 = hVar2.h(17);
        obtain2.setCheckable((h3 || h4) ? true : z2);
        if (h3) {
            if (hVar2.h(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
            if (i11 >= 36) {
                obtain2.setChecked((int) (hVar2.h(26) ? 2 : hVar2.h(2) ? 1 : z2));
            } else {
                obtain2.setChecked(hVar2.h(2));
            }
        } else if (h4) {
            obtain2.setClassName("android.widget.Switch");
            i3 = 36;
            if (i11 >= 36) {
                obtain2.setChecked(hVar2.h(18) ? 1 : 0);
            } else {
                obtain2.setChecked(hVar2.h(18));
            }
            obtain2.setSelected(hVar2.h(3));
            if (i11 >= i3 && hVar2.h(27)) {
                obtain2.setExpandedState(!hVar2.h(28) ? 3 : 1);
                if (h.a(hVar2, f.EXPAND)) {
                    obtain2.addAction(262144);
                }
                if (h.a(hVar2, f.COLLAPSE)) {
                    obtain2.addAction(524288);
                }
            }
            if (i11 >= 28) {
                obtain2.setHeading(hVar2.f758F > 0 ? true : z2);
            }
            hVar = this.f816i;
            if (hVar == null && hVar.f779b == i2) {
                obtain2.addAction(128);
            } else {
                obtain2.addAction(64);
            }
            r1 = hVar2.f775Y;
            if (r1 != 0) {
                int size2 = r1.size();
                for (?? r3 = z2; r3 < size2; r3++) {
                    g gVar = (g) r1.get(r3);
                    obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f749a, gVar.f752d));
                }
            }
            ?? r12 = hVar2.f773W;
            size = r12.size();
            r7 = z2;
            while (r7 < size) {
                Object obj = r12.get(r7);
                r7++;
                h hVar11 = (h) obj;
                if (!hVar11.h(14)) {
                    int i12 = hVar11.f790i;
                    if (i12 != -1) {
                        hVar3.r(i12);
                        hVar3.j(hVar11.f790i);
                    }
                    obtain2.addChild(view, hVar11.f779b);
                }
            }
            return obtain2;
        }
        i3 = 36;
        obtain2.setSelected(hVar2.h(3));
        if (i11 >= i3) {
            obtain2.setExpandedState(!hVar2.h(28) ? 3 : 1);
            if (h.a(hVar2, f.EXPAND)) {
            }
            if (h.a(hVar2, f.COLLAPSE)) {
            }
        }
        if (i11 >= 28) {
        }
        hVar = this.f816i;
        if (hVar == null) {
        }
        obtain2.addAction(64);
        r1 = hVar2.f775Y;
        if (r1 != 0) {
        }
        ?? r122 = hVar2.f773W;
        size = r122.size();
        r7 = z2;
        while (r7 < size) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        View view = this.f808a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h i2;
        if (this.f810c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f814g;
            if (!hashMap.isEmpty()) {
                h i3 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
                if (i3 == null || i3.f790i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i2 = ((h) hashMap.get(0)).i(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f822o) {
                            if (i2 != null) {
                                g(i2.f779b, 128);
                            }
                            h hVar = this.f822o;
                            if (hVar != null) {
                                g(hVar.f779b, 256);
                            }
                            this.f822o = i2;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f822o;
                        if (hVar2 != null) {
                            g(hVar2.f779b, 256);
                            this.f822o = null;
                        }
                    }
                    return true;
                }
                if (!z2) {
                    return this.f811d.onAccessibilityHoverEvent(i3.f779b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(h hVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = hVar.f788g;
        int i6 = hVar.f789h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                hVar.f789h = hVar.f799r.length();
                            } else {
                                hVar.f789h = 0;
                            }
                        }
                    } else if (z2 && i6 < hVar.f799r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f799r.substring(hVar.f789h));
                        if (matcher.find()) {
                            hVar.f789h += matcher.start(1);
                        } else {
                            hVar.f789h = hVar.f799r.length();
                        }
                    } else if (!z2 && hVar.f789h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f799r.substring(0, hVar.f789h));
                        if (matcher2.find()) {
                            hVar.f789h = matcher2.start(1);
                        } else {
                            hVar.f789h = 0;
                        }
                    }
                } else if (z2 && i6 < hVar.f799r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f799r.substring(hVar.f789h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f789h += matcher3.start(1);
                    } else {
                        hVar.f789h = hVar.f799r.length();
                    }
                } else if (!z2 && hVar.f789h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f799r.substring(0, hVar.f789h));
                    if (matcher4.find()) {
                        hVar.f789h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < hVar.f799r.length()) {
                hVar.f789h++;
            } else if (!z2 && (i3 = hVar.f789h) > 0) {
                hVar.f789h = i3 - 1;
            }
            if (!z3) {
                hVar.f788g = hVar.f789h;
            }
        }
        if (i5 != hVar.f788g || i6 != hVar.f789h) {
            String str = hVar.f799r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(hVar.f779b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(hVar.f788g);
            d2.setToIndex(hVar.f789h);
            d2.setItemCount(str.length());
            h(d2);
        }
        E.b bVar = this.f809b;
        if (i4 == 1) {
            if (z2) {
                f fVar = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, fVar)) {
                    bVar.b(i2, fVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar2 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, fVar2)) {
                    bVar.b(i2, fVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                f fVar3 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (h.a(hVar, fVar3)) {
                    bVar.b(i2, fVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar4 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (h.a(hVar, fVar4)) {
                    bVar.b(i2, fVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 4 || i4 == 8 || i4 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            h hVar = this.f820m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f779b);
            }
        } else if (i2 != 2) {
            return null;
        }
        h hVar2 = this.f816i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f779b);
        }
        Integer num = this.f817j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f810c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f810c.isEnabled()) {
            View view = this.f808a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f826s == z2) {
            return;
        }
        this.f826s = z2;
        if (z2) {
            this.f818k |= 1;
        } else {
            this.f818k &= -2;
        }
        ((FlutterJNI) this.f809b.f19b).setAccessibilityFeatures(this.f818k);
    }

    public final boolean j(h hVar) {
        if (hVar.f791j > 1) {
            h hVar2 = this.f816i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.f772V;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.f772V;
                }
                if (hVar4 != null) {
                    return true;
                }
            }
            h hVar5 = this.f816i;
            b bVar = new b();
            if (hVar5 != null) {
                h hVar6 = hVar5.f772V;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (bVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.f772V;
                }
                if (hVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f811d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f817j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f814g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            f fVar = f.INCREASE;
            f fVar2 = f.DECREASE;
            E.b bVar = this.f809b;
            switch (i3) {
                case 16:
                    bVar.a(i2, f.TAP);
                    return true;
                case 32:
                    bVar.a(i2, f.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f816i == null) {
                        this.f808a.invalidate();
                    }
                    this.f816i = hVar;
                    bVar.a(i2, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(hVar.f779b));
                    ((C.e) bVar.f18a).g(hashMap2, null);
                    g(i2, 32768);
                    if (!h.a(hVar, fVar) && !h.a(hVar, fVar2)) {
                        return true;
                    }
                    g(i2, 4);
                    return true;
                case 128:
                    h hVar2 = this.f816i;
                    if (hVar2 != null && hVar2.f779b == i2) {
                        this.f816i = null;
                    }
                    Integer num = this.f817j;
                    if (num != null && num.intValue() == i2) {
                        this.f817j = null;
                    }
                    bVar.a(i2, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i2, 65536);
                    return true;
                case 256:
                    return f(hVar, i2, bundle, true);
                case 512:
                    return f(hVar, i2, bundle, false);
                case 4096:
                    f fVar3 = f.SCROLL_UP;
                    if (h.a(hVar, fVar3)) {
                        bVar.a(i2, fVar3);
                        return true;
                    }
                    f fVar4 = f.SCROLL_LEFT;
                    if (h.a(hVar, fVar4)) {
                        bVar.a(i2, fVar4);
                        return true;
                    }
                    if (h.a(hVar, fVar)) {
                        hVar.f799r = hVar.f801t;
                        hVar.f800s = hVar.f802u;
                        g(i2, 4);
                        bVar.a(i2, fVar);
                        return true;
                    }
                    break;
                case 8192:
                    f fVar5 = f.SCROLL_DOWN;
                    if (h.a(hVar, fVar5)) {
                        bVar.a(i2, fVar5);
                        return true;
                    }
                    f fVar6 = f.SCROLL_RIGHT;
                    if (h.a(hVar, fVar6)) {
                        bVar.a(i2, fVar6);
                        return true;
                    }
                    if (h.a(hVar, fVar2)) {
                        hVar.f799r = hVar.v;
                        hVar.f800s = hVar.f803w;
                        g(i2, 4);
                        bVar.a(i2, fVar2);
                        return true;
                    }
                    break;
                case 16384:
                    bVar.a(i2, f.COPY);
                    return true;
                case 32768:
                    bVar.a(i2, f.PASTE);
                    return true;
                case 65536:
                    bVar.a(i2, f.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(hVar.f789h));
                        hashMap3.put("extent", Integer.valueOf(hVar.f789h));
                    }
                    bVar.b(i2, f.SET_SELECTION, hashMap3);
                    h hVar3 = (h) hashMap.get(Integer.valueOf(i2));
                    hVar3.f788g = ((Integer) hashMap3.get("base")).intValue();
                    hVar3.f789h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    bVar.a(i2, f.EXPAND);
                    return true;
                case 524288:
                    bVar.a(i2, f.COLLAPSE);
                    return true;
                case 1048576:
                    bVar.a(i2, f.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    bVar.b(i2, f.SET_TEXT, string);
                    hVar.f799r = string;
                    hVar.f800s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    bVar.a(i2, f.SHOW_ON_SCREEN);
                    return true;
                default:
                    g gVar = (g) this.f815h.get(Integer.valueOf(i3 - 267386881));
                    if (gVar != null) {
                        bVar.b(i2, f.CUSTOM_ACTION, Integer.valueOf(gVar.f750b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
