package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.SentryReplayOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w1.C1719l1;
import w1.C1726n0;
import w1.F0;

/* loaded from: classes2.dex */
public final class k extends AccessibilityNodeProvider {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f14313z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f14314a;

    /* renamed from: b, reason: collision with root package name */
    public final C1726n0 f14315b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f14316c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f14317d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f14318e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f14319f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14320g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f14321h;

    /* renamed from: i, reason: collision with root package name */
    public g f14322i;
    public Integer j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f14323k;

    /* renamed from: l, reason: collision with root package name */
    public int f14324l;

    /* renamed from: m, reason: collision with root package name */
    public g f14325m;

    /* renamed from: n, reason: collision with root package name */
    public g f14326n;

    /* renamed from: o, reason: collision with root package name */
    public g f14327o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f14328p;

    /* renamed from: q, reason: collision with root package name */
    public int f14329q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f14330r;

    /* renamed from: s, reason: collision with root package name */
    public C1719l1 f14331s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14332t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14333u;

    /* renamed from: v, reason: collision with root package name */
    public final a f14334v;

    /* renamed from: w, reason: collision with root package name */
    public final b f14335w;

    /* renamed from: x, reason: collision with root package name */
    public final c f14336x;

    /* renamed from: y, reason: collision with root package name */
    public final Y.a f14337y;

    public k(View view, C1726n0 c1726n0, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.l lVar) {
        int i7;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f14320g = new HashMap();
        this.f14321h = new HashMap();
        this.f14324l = 0;
        this.f14328p = new ArrayList();
        this.f14329q = 0;
        this.f14330r = 0;
        this.f14332t = false;
        this.f14333u = false;
        this.f14334v = new a(this);
        b bVar = new b(this);
        this.f14335w = bVar;
        Y.a aVar = new Y.a(this, new Handler(), 1);
        this.f14337y = aVar;
        this.f14314a = view;
        this.f14315b = c1726n0;
        this.f14316c = accessibilityManager;
        this.f14319f = contentResolver;
        this.f14317d = accessibilityViewEmbedder;
        this.f14318e = lVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f14336x = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i7 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i7 == Integer.MAX_VALUE || i7 < 300) {
                this.f14324l &= -9;
            } else {
                this.f14324l |= 8;
            }
            ((FlutterJNI) c1726n0.f17806c).setAccessibilityFeatures(this.f14324l);
        }
        lVar.a(this);
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f14317d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f14323k = recordFlutterId;
            this.f14325m = null;
            return true;
        }
        if (eventType == 128) {
            this.f14327o = null;
            return true;
        }
        if (eventType == 32768) {
            this.j = recordFlutterId;
            this.f14322i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f14323k = null;
        this.j = null;
        return true;
    }

    public final e b(int i7) {
        HashMap hashMap = this.f14321h;
        e eVar = (e) hashMap.get(Integer.valueOf(i7));
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f14254c = -1;
        eVar2.f14253b = i7;
        eVar2.f14252a = 267386881 + i7;
        hashMap.put(Integer.valueOf(i7), eVar2);
        return eVar2;
    }

    public final g c(int i7) {
        HashMap hashMap = this.f14320g;
        g gVar = (g) hashMap.get(Integer.valueOf(i7));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f14285b = i7;
        hashMap.put(Integer.valueOf(i7), gVar2);
        return gVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        boolean z4;
        String str;
        int i8;
        int i9;
        int i10;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f14317d;
        if (i7 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i7);
        }
        HashMap hashMap = this.f14320g;
        View view = this.f14314a;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        g gVar = (g) hashMap.get(Integer.valueOf(i7));
        if (gVar == null) {
            return null;
        }
        int i11 = gVar.f14292i;
        io.flutter.plugin.platform.l lVar = this.f14318e;
        if (i11 != -1 && lVar.c(i11)) {
            View b7 = lVar.b(gVar.f14292i);
            if (b7 == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(b7, gVar.f14285b, gVar.f14283Z);
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i7);
        int i12 = Build.VERSION.SDK_INT;
        obtain2.setImportantForAccessibility((gVar.i(12) || (g.b(gVar) == null && gVar.f14287d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        String str2 = gVar.f14297o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i7);
        obtain2.setFocusable(gVar.k());
        g gVar2 = this.f14325m;
        if (gVar2 != null) {
            obtain2.setFocused(gVar2.f14285b == i7);
        }
        g gVar3 = this.f14322i;
        if (gVar3 != null) {
            obtain2.setAccessibilityFocused(gVar3.f14285b == i7);
        }
        if (gVar.i(5)) {
            obtain2.setPassword(gVar.i(11));
            if (!gVar.i(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!gVar.i(21));
            int i13 = gVar.f14290g;
            if (i13 != -1 && (i10 = gVar.f14291h) != -1) {
                obtain2.setTextSelection(i13, i10);
            }
            g gVar4 = this.f14322i;
            if (gVar4 != null && gVar4.f14285b == i7) {
                obtain2.setLiveRegion(1);
            }
            if (g.a(gVar, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (g.a(gVar, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i9 = 1;
            }
            if (g.a(gVar, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i9 |= 2;
            }
            if (g.a(gVar, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i9 |= 2;
            }
            obtain2.setMovementGranularities(i9);
            if (gVar.f14288e >= 0) {
                String str3 = gVar.f14300r;
                obtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - gVar.f14289f) + gVar.f14288e);
            }
        }
        if (g.a(gVar, d.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (g.a(gVar, d.COPY)) {
            obtain2.addAction(16384);
        }
        if (g.a(gVar, d.CUT)) {
            obtain2.addAction(65536);
        }
        if (g.a(gVar, d.PASTE)) {
            obtain2.addAction(32768);
        }
        if (g.a(gVar, d.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (gVar.i(4)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (gVar.i(15)) {
            obtain2.setClassName(SentryReplayOptions.IMAGE_VIEW_CLASS_NAME);
        }
        if (g.a(gVar, d.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        g gVar5 = gVar.f14273P;
        if (gVar5 != null) {
            obtain2.setParent(view, gVar5.f14285b);
        } else {
            obtain2.setParent(view);
        }
        int i14 = gVar.f14259B;
        if (i14 != -1) {
            obtain2.setTraversalAfter(view, i14);
        }
        Rect rect = gVar.f14283Z;
        g gVar6 = gVar.f14273P;
        if (gVar6 != null) {
            Rect rect2 = gVar6.f14283Z;
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
        obtain2.setEnabled(!gVar.i(7) || gVar.i(8));
        if (g.a(gVar, d.TAP)) {
            if (gVar.f14277T != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, gVar.f14277T.f14256e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (gVar.i(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (g.a(gVar, d.LONG_PRESS)) {
            if (gVar.f14278U != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, gVar.f14278U.f14256e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        d dVar = d.SCROLL_LEFT;
        boolean a2 = g.a(gVar, dVar);
        d dVar2 = d.SCROLL_DOWN;
        d dVar3 = d.SCROLL_UP;
        d dVar4 = d.SCROLL_RIGHT;
        if (a2 || g.a(gVar, dVar3) || g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
            obtain2.setScrollable(true);
            if (gVar.i(19)) {
                if (g.a(gVar, dVar) || g.a(gVar, dVar4)) {
                    if (j(gVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, gVar.j, false));
                    } else {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (j(gVar)) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(gVar.j, 0, false));
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (g.a(gVar, dVar) || g.a(gVar, dVar3)) {
                obtain2.addAction(4096);
            }
            if (g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
                obtain2.addAction(8192);
            }
        }
        d dVar5 = d.INCREASE;
        boolean a4 = g.a(gVar, dVar5);
        d dVar6 = d.DECREASE;
        if (a4 || g.a(gVar, dVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (g.a(gVar, dVar5)) {
                obtain2.addAction(4096);
            }
            if (g.a(gVar, dVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (gVar.i(16)) {
            obtain2.setLiveRegion(1);
        }
        if (gVar.i(5)) {
            obtain2.setText(g.e(gVar.f14300r, gVar.f14301s));
            if (i12 >= 28) {
                CharSequence[] charSequenceArr = {gVar.f(), g.e(gVar.f14306x, gVar.f14307y)};
                int i15 = 0;
                CharSequence charSequence = null;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i15];
                    if (charSequence2 == null || charSequence2.length() <= 0) {
                        i8 = 1;
                    } else {
                        if (charSequence == null || charSequence.length() == 0) {
                            i8 = 1;
                        } else {
                            i8 = 1;
                            charSequence2 = TextUtils.concat(charSequence, ", ", charSequence2);
                        }
                        charSequence = charSequence2;
                    }
                    i15 += i8;
                }
                z4 = false;
                obtain2.setHintText(charSequence);
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
            if (!gVar.i(12)) {
                CharSequence b8 = g.b(gVar);
                if (i12 < 28 && gVar.f14308z != null) {
                    b8 = ((Object) (b8 != null ? b8 : "")) + "\n" + gVar.f14308z;
                }
                if (b8 != null) {
                    obtain2.setContentDescription(b8);
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 28 && (str = gVar.f14308z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean z7 = true;
        boolean i18 = gVar.i(1);
        boolean i19 = gVar.i(17);
        if (!i18 && !i19) {
            z7 = z4;
        }
        obtain2.setCheckable(z7);
        if (i18) {
            obtain2.setChecked(gVar.i(2));
            if (gVar.i(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (i19) {
            obtain2.setChecked(gVar.i(18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(gVar.i(3));
        if (i17 >= 28) {
            obtain2.setHeading(gVar.i(10));
        }
        g gVar7 = this.f14322i;
        if (gVar7 == null || gVar7.f14285b != i7) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        ArrayList arrayList = gVar.f14276S;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f14252a, eVar.f14255d));
            }
        }
        Iterator it2 = gVar.f14274Q.iterator();
        while (it2.hasNext()) {
            g gVar8 = (g) it2.next();
            if (!gVar8.i(14)) {
                int i20 = gVar8.f14292i;
                if (i20 != -1) {
                    View b9 = lVar.b(i20);
                    if (!lVar.c(gVar8.f14292i)) {
                        obtain2.addChild(b9);
                    }
                }
                obtain2.addChild(view, gVar8.f14285b);
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i7, int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        View view = this.f14314a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i7);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z4) {
        g j;
        if (!this.f14316c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f14320g;
        if (hashMap.isEmpty()) {
            return false;
        }
        g j3 = ((g) hashMap.get(0)).j(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
        if (j3 != null && j3.f14292i != -1) {
            if (z4) {
                return false;
            }
            return this.f14317d.onAccessibilityHoverEvent(j3.f14285b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (!hashMap.isEmpty() && (j = ((g) hashMap.get(0)).j(new float[]{x4, y4, 0.0f, 1.0f}, z4)) != this.f14327o) {
                if (j != null) {
                    g(j.f14285b, 128);
                }
                g gVar = this.f14327o;
                if (gVar != null) {
                    g(gVar.f14285b, 256);
                }
                this.f14327o = j;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            g gVar2 = this.f14327o;
            if (gVar2 != null) {
                g(gVar2.f14285b, 256);
                this.f14327o = null;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i7, Bundle bundle, boolean z4) {
        int i8;
        int i9 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z7 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i10 = gVar.f14290g;
        int i11 = gVar.f14291h;
        if (i11 >= 0 && i10 >= 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 == 8 || i9 == 16) {
                            if (z4) {
                                gVar.f14291h = gVar.f14300r.length();
                            } else {
                                gVar.f14291h = 0;
                            }
                        }
                    } else if (z4 && i11 < gVar.f14300r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f14300r.substring(gVar.f14291h));
                        if (matcher.find()) {
                            gVar.f14291h += matcher.start(1);
                        } else {
                            gVar.f14291h = gVar.f14300r.length();
                        }
                    } else if (!z4 && gVar.f14291h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f14300r.substring(0, gVar.f14291h));
                        if (matcher2.find()) {
                            gVar.f14291h = matcher2.start(1);
                        } else {
                            gVar.f14291h = 0;
                        }
                    }
                } else if (z4 && i11 < gVar.f14300r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f14300r.substring(gVar.f14291h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f14291h += matcher3.start(1);
                    } else {
                        gVar.f14291h = gVar.f14300r.length();
                    }
                } else if (!z4 && gVar.f14291h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f14300r.substring(0, gVar.f14291h));
                    if (matcher4.find()) {
                        gVar.f14291h = matcher4.start(1);
                    }
                }
            } else if (z4 && i11 < gVar.f14300r.length()) {
                gVar.f14291h++;
            } else if (!z4 && (i8 = gVar.f14291h) > 0) {
                gVar.f14291h = i8 - 1;
            }
            if (!z7) {
                gVar.f14290g = gVar.f14291h;
            }
        }
        if (i10 != gVar.f14290g || i11 != gVar.f14291h) {
            String str = gVar.f14300r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d7 = d(gVar.f14285b, 8192);
            d7.getText().add(str);
            d7.setFromIndex(gVar.f14290g);
            d7.setToIndex(gVar.f14291h);
            d7.setItemCount(str.length());
            h(d7);
        }
        C1726n0 c1726n0 = this.f14315b;
        if (i9 == 1) {
            if (z4) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.a(gVar, dVar)) {
                    c1726n0.i(i7, dVar, Boolean.valueOf(z7));
                    return true;
                }
            }
            if (!z4) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.a(gVar, dVar2)) {
                    c1726n0.i(i7, dVar2, Boolean.valueOf(z7));
                    return true;
                }
            }
        } else if (i9 == 2) {
            if (z4) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.a(gVar, dVar3)) {
                    c1726n0.i(i7, dVar3, Boolean.valueOf(z7));
                    return true;
                }
            }
            if (!z4) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.a(gVar, dVar4)) {
                    c1726n0.i(i7, dVar4, Boolean.valueOf(z7));
                    return true;
                }
            }
        } else if (i9 == 4 || i9 == 8 || i9 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        if (i7 == 1) {
            g gVar = this.f14325m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f14285b);
            }
            Integer num = this.f14323k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i7 != 2) {
            return null;
        }
        g gVar2 = this.f14322i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f14285b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i7, int i8) {
        if (this.f14316c.isEnabled()) {
            h(d(i7, i8));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f14316c.isEnabled()) {
            View view = this.f14314a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z4) {
        if (this.f14332t == z4) {
            return;
        }
        this.f14332t = z4;
        if (z4) {
            this.f14324l |= 1;
        } else {
            this.f14324l &= -2;
        }
        ((FlutterJNI) this.f14315b.f17806c).setAccessibilityFeatures(this.f14324l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(g gVar) {
        if (gVar.j > 0) {
            g gVar2 = this.f14322i;
            g gVar3 = null;
            if (gVar2 != null) {
                g gVar4 = gVar2.f14273P;
                while (true) {
                    if (gVar4 == null) {
                        gVar4 = null;
                        break;
                    }
                    if (gVar4 == gVar) {
                        break;
                    }
                    gVar4 = gVar4.f14273P;
                }
            }
            g gVar5 = this.f14322i;
            if (gVar5 != null) {
                g gVar6 = gVar5.f14273P;
                while (true) {
                    if (gVar6 == null) {
                        break;
                    }
                    if (gVar6.i(19)) {
                        gVar3 = gVar6;
                        break;
                    }
                    gVar6 = gVar6.f14273P;
                }
                if (gVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        if (i7 >= 65536) {
            boolean performAction = this.f14317d.performAction(i7, i8, bundle);
            if (performAction && i8 == 128) {
                this.j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f14320g;
        g gVar = (g) hashMap.get(Integer.valueOf(i7));
        if (gVar == null) {
            return false;
        }
        d dVar = d.INCREASE;
        d dVar2 = d.DECREASE;
        C1726n0 c1726n0 = this.f14315b;
        switch (i8) {
            case 16:
                c1726n0.h(i7, d.TAP);
                return true;
            case 32:
                c1726n0.h(i7, d.LONG_PRESS);
                return true;
            case 64:
                if (this.f14322i == null) {
                    this.f14314a.invalidate();
                }
                this.f14322i = gVar;
                c1726n0.h(i7, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(gVar.f14285b));
                ((F0) c1726n0.f17805b).L(hashMap2, null);
                g(i7, 32768);
                if (g.a(gVar, dVar) || g.a(gVar, dVar2)) {
                    g(i7, 4);
                }
                return true;
            case 128:
                g gVar2 = this.f14322i;
                if (gVar2 != null && gVar2.f14285b == i7) {
                    this.f14322i = null;
                }
                Integer num = this.j;
                if (num != null && num.intValue() == i7) {
                    this.j = null;
                }
                c1726n0.h(i7, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i7, 65536);
                return true;
            case 256:
                return f(gVar, i7, bundle, true);
            case 512:
                return f(gVar, i7, bundle, false);
            case 4096:
                d dVar3 = d.SCROLL_UP;
                if (g.a(gVar, dVar3)) {
                    c1726n0.h(i7, dVar3);
                } else {
                    d dVar4 = d.SCROLL_LEFT;
                    if (g.a(gVar, dVar4)) {
                        c1726n0.h(i7, dVar4);
                    } else {
                        if (!g.a(gVar, dVar)) {
                            return false;
                        }
                        gVar.f14300r = gVar.f14302t;
                        gVar.f14301s = gVar.f14303u;
                        g(i7, 4);
                        c1726n0.h(i7, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.SCROLL_DOWN;
                if (g.a(gVar, dVar5)) {
                    c1726n0.h(i7, dVar5);
                } else {
                    d dVar6 = d.SCROLL_RIGHT;
                    if (g.a(gVar, dVar6)) {
                        c1726n0.h(i7, dVar6);
                    } else {
                        if (!g.a(gVar, dVar2)) {
                            return false;
                        }
                        gVar.f14300r = gVar.f14304v;
                        gVar.f14301s = gVar.f14305w;
                        g(i7, 4);
                        c1726n0.h(i7, dVar2);
                    }
                }
                return true;
            case 16384:
                c1726n0.h(i7, d.COPY);
                return true;
            case 32768:
                c1726n0.h(i7, d.PASTE);
                return true;
            case 65536:
                c1726n0.h(i7, d.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(gVar.f14291h));
                    hashMap3.put("extent", Integer.valueOf(gVar.f14291h));
                }
                c1726n0.i(i7, d.SET_SELECTION, hashMap3);
                g gVar3 = (g) hashMap.get(Integer.valueOf(i7));
                gVar3.f14290g = ((Integer) hashMap3.get("base")).intValue();
                gVar3.f14291h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                c1726n0.h(i7, d.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                c1726n0.i(i7, d.SET_TEXT, string);
                gVar.f14300r = string;
                gVar.f14301s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                c1726n0.h(i7, d.SHOW_ON_SCREEN);
                return true;
            default:
                e eVar = (e) this.f14321h.get(Integer.valueOf(i8 - 267386881));
                if (eVar == null) {
                    return false;
                }
                c1726n0.i(i7, d.CUSTOM_ACTION, Integer.valueOf(eVar.f14253b));
                return true;
        }
    }
}
