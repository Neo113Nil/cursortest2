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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p155w1.C1010l1;
import p155w1.C1017n0;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f14319z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1017n0 f14321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f14322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f14323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f14324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f14325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f14326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f14327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f14328i;
    public Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f14329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f14331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f14332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f14333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f14334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f14336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1010l1 f14337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f14340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f14341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f14342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Y.a f14343y;

    public k(View view, C1017n0 c1017n0, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.l lVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f14326g = new HashMap();
        this.f14327h = new HashMap();
        this.f14330l = 0;
        this.f14334p = new ArrayList();
        this.f14335q = 0;
        this.f14336r = 0;
        this.f14338t = false;
        this.f14339u = false;
        this.f14340v = new a(this);
        b bVar = new b(this);
        this.f14341w = bVar;
        Y.a aVar = new Y.a(this, new Handler(), 1);
        this.f14343y = aVar;
        this.f14320a = view;
        this.f14321b = c1017n0;
        this.f14322c = accessibilityManager;
        this.f14325f = contentResolver;
        this.f14323d = accessibilityViewEmbedder;
        this.f14324e = lVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f14342x = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i7 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i7 == Integer.MAX_VALUE || i7 < 300) {
                this.f14330l &= -9;
            } else {
                this.f14330l |= 8;
            }
            ((FlutterJNI) c1017n0.f17812c).setAccessibilityFeatures(this.f14330l);
        }
        lVar.a(this);
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f14323d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f14329k = recordFlutterId;
            this.f14331m = null;
            return true;
        }
        if (eventType == 128) {
            this.f14333o = null;
            return true;
        }
        if (eventType == 32768) {
            this.j = recordFlutterId;
            this.f14328i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f14329k = null;
        this.j = null;
        return true;
    }

    public final e b(int i7) {
        HashMap map = this.f14327h;
        e eVar = (e) map.get(Integer.valueOf(i7));
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f14260c = -1;
        eVar2.f14259b = i7;
        eVar2.f14258a = 267386881 + i7;
        map.put(Integer.valueOf(i7), eVar2);
        return eVar2;
    }

    public final g c(int i7) {
        HashMap map = this.f14326g;
        g gVar = (g) map.get(Integer.valueOf(i7));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f14291b = i7;
        map.put(Integer.valueOf(i7), gVar2);
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
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f14323d;
        if (i7 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i7);
        }
        HashMap map = this.f14326g;
        View view = this.f14320a;
        if (i7 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            return accessibilityNodeInfoObtain;
        }
        g gVar = (g) map.get(Integer.valueOf(i7));
        if (gVar == null) {
            return null;
        }
        int i11 = gVar.f14298i;
        io.flutter.plugin.platform.l lVar = this.f14324e;
        if (i11 != -1 && lVar.c(i11)) {
            View viewB = lVar.b(gVar.f14298i);
            if (viewB == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(viewB, gVar.f14291b, gVar.f14289Z);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i7);
        int i12 = Build.VERSION.SDK_INT;
        accessibilityNodeInfoObtain2.setImportantForAccessibility((gVar.i(12) || (g.b(gVar) == null && gVar.f14293d == 0)) ? false : true);
        accessibilityNodeInfoObtain2.setViewIdResourceName("");
        String str2 = gVar.f14303o;
        if (str2 != null) {
            accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
        }
        accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoObtain2.setClassName("android.view.View");
        accessibilityNodeInfoObtain2.setSource(view, i7);
        accessibilityNodeInfoObtain2.setFocusable(gVar.k());
        g gVar2 = this.f14331m;
        if (gVar2 != null) {
            accessibilityNodeInfoObtain2.setFocused(gVar2.f14291b == i7);
        }
        g gVar3 = this.f14328i;
        if (gVar3 != null) {
            accessibilityNodeInfoObtain2.setAccessibilityFocused(gVar3.f14291b == i7);
        }
        if (gVar.i(5)) {
            accessibilityNodeInfoObtain2.setPassword(gVar.i(11));
            if (!gVar.i(21)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
            }
            accessibilityNodeInfoObtain2.setEditable(!gVar.i(21));
            int i13 = gVar.f14296g;
            if (i13 != -1 && (i10 = gVar.f14297h) != -1) {
                accessibilityNodeInfoObtain2.setTextSelection(i13, i10);
            }
            g gVar4 = this.f14328i;
            if (gVar4 != null && gVar4.f14291b == i7) {
                accessibilityNodeInfoObtain2.setLiveRegion(1);
            }
            if (g.a(gVar, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (g.a(gVar, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i9 = 1;
            }
            if (g.a(gVar, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i9 |= 2;
            }
            if (g.a(gVar, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i9 |= 2;
            }
            accessibilityNodeInfoObtain2.setMovementGranularities(i9);
            if (gVar.f14294e >= 0) {
                String str3 = gVar.f14306r;
                accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - gVar.f14295f) + gVar.f14294e);
            }
        }
        if (g.a(gVar, d.SET_SELECTION)) {
            accessibilityNodeInfoObtain2.addAction(131072);
        }
        if (g.a(gVar, d.COPY)) {
            accessibilityNodeInfoObtain2.addAction(16384);
        }
        if (g.a(gVar, d.CUT)) {
            accessibilityNodeInfoObtain2.addAction(65536);
        }
        if (g.a(gVar, d.PASTE)) {
            accessibilityNodeInfoObtain2.addAction(32768);
        }
        if (g.a(gVar, d.SET_TEXT)) {
            accessibilityNodeInfoObtain2.addAction(2097152);
        }
        if (gVar.i(4)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
        }
        if (gVar.i(15)) {
            accessibilityNodeInfoObtain2.setClassName(SentryReplayOptions.IMAGE_VIEW_CLASS_NAME);
        }
        if (g.a(gVar, d.DISMISS)) {
            accessibilityNodeInfoObtain2.setDismissable(true);
            accessibilityNodeInfoObtain2.addAction(1048576);
        }
        g gVar5 = gVar.f14279P;
        if (gVar5 != null) {
            accessibilityNodeInfoObtain2.setParent(view, gVar5.f14291b);
        } else {
            accessibilityNodeInfoObtain2.setParent(view);
        }
        int i14 = gVar.f14265B;
        if (i14 != -1) {
            accessibilityNodeInfoObtain2.setTraversalAfter(view, i14);
        }
        Rect rect = gVar.f14289Z;
        g gVar6 = gVar.f14279P;
        if (gVar6 != null) {
            Rect rect2 = gVar6.f14289Z;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
        } else {
            accessibilityNodeInfoObtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
        accessibilityNodeInfoObtain2.setVisibleToUser(true);
        accessibilityNodeInfoObtain2.setEnabled(!gVar.i(7) || gVar.i(8));
        if (g.a(gVar, d.TAP)) {
            if (gVar.f14283T != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, gVar.f14283T.f14262e));
                accessibilityNodeInfoObtain2.setClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(16);
                accessibilityNodeInfoObtain2.setClickable(true);
            }
        } else if (gVar.i(24)) {
            accessibilityNodeInfoObtain2.addAction(16);
            accessibilityNodeInfoObtain2.setClickable(true);
        }
        if (g.a(gVar, d.LONG_PRESS)) {
            if (gVar.f14284U != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, gVar.f14284U.f14262e));
                accessibilityNodeInfoObtain2.setLongClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(32);
                accessibilityNodeInfoObtain2.setLongClickable(true);
            }
        }
        d dVar = d.SCROLL_LEFT;
        boolean zA = g.a(gVar, dVar);
        d dVar2 = d.SCROLL_DOWN;
        d dVar3 = d.SCROLL_UP;
        d dVar4 = d.SCROLL_RIGHT;
        if (zA || g.a(gVar, dVar3) || g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
            accessibilityNodeInfoObtain2.setScrollable(true);
            if (gVar.i(19)) {
                if (g.a(gVar, dVar) || g.a(gVar, dVar4)) {
                    if (j(gVar)) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, gVar.j, false));
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (j(gVar)) {
                    accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(gVar.j, 0, false));
                } else {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (g.a(gVar, dVar) || g.a(gVar, dVar3)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        d dVar5 = d.INCREASE;
        boolean zA2 = g.a(gVar, dVar5);
        d dVar6 = d.DECREASE;
        if (zA2 || g.a(gVar, dVar6)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
            if (g.a(gVar, dVar5)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (g.a(gVar, dVar6)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        if (gVar.i(16)) {
            accessibilityNodeInfoObtain2.setLiveRegion(1);
        }
        if (gVar.i(5)) {
            accessibilityNodeInfoObtain2.setText(g.e(gVar.f14306r, gVar.f14307s));
            if (i12 >= 28) {
                CharSequence[] charSequenceArr = {gVar.f(), g.e(gVar.f14312x, gVar.f14313y)};
                int i15 = 0;
                CharSequence charSequence = null;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    CharSequence charSequenceConcat = charSequenceArr[i15];
                    if (charSequenceConcat == null || charSequenceConcat.length() <= 0) {
                        i8 = 1;
                    } else {
                        if (charSequence == null || charSequence.length() == 0) {
                            i8 = 1;
                        } else {
                            i8 = 1;
                            charSequenceConcat = TextUtils.concat(charSequence, ", ", charSequenceConcat);
                        }
                        charSequence = charSequenceConcat;
                    }
                    i15 += i8;
                }
                z4 = false;
                accessibilityNodeInfoObtain2.setHintText(charSequence);
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
            if (!gVar.i(12)) {
                CharSequence charSequenceB = g.b(gVar);
                if (i12 < 28 && gVar.f14314z != null) {
                    charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + gVar.f14314z;
                }
                if (charSequenceB != null) {
                    accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 28 && (str = gVar.f14314z) != null) {
            accessibilityNodeInfoObtain2.setTooltipText(str);
        }
        boolean z7 = true;
        boolean zI = gVar.i(1);
        boolean zI2 = gVar.i(17);
        if (!zI && !zI2) {
            z7 = z4;
        }
        accessibilityNodeInfoObtain2.setCheckable(z7);
        if (zI) {
            accessibilityNodeInfoObtain2.setChecked(gVar.i(2));
            if (gVar.i(9)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
            } else {
                accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
            }
        } else if (zI2) {
            accessibilityNodeInfoObtain2.setChecked(gVar.i(18));
            accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
        }
        accessibilityNodeInfoObtain2.setSelected(gVar.i(3));
        if (i17 >= 28) {
            accessibilityNodeInfoObtain2.setHeading(gVar.i(10));
        }
        g gVar7 = this.f14328i;
        if (gVar7 == null || gVar7.f14291b != i7) {
            accessibilityNodeInfoObtain2.addAction(64);
        } else {
            accessibilityNodeInfoObtain2.addAction(128);
        }
        ArrayList<e> arrayList = gVar.f14282S;
        if (arrayList != null) {
            for (e eVar : arrayList) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f14258a, eVar.f14261d));
            }
        }
        for (g gVar8 : gVar.f14280Q) {
            if (!gVar8.i(14)) {
                int i18 = gVar8.f14298i;
                if (i18 != -1) {
                    View viewB2 = lVar.b(i18);
                    if (!lVar.c(gVar8.f14298i)) {
                        accessibilityNodeInfoObtain2.addChild(viewB2);
                    }
                }
                accessibilityNodeInfoObtain2.addChild(view, gVar8.f14291b);
            }
        }
        return accessibilityNodeInfoObtain2;
    }

    public final AccessibilityEvent d(int i7, int i8) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i8);
        View view = this.f14320a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i7);
        return accessibilityEventObtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z4) {
        g gVarJ;
        if (!this.f14322c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap map = this.f14326g;
        if (map.isEmpty()) {
            return false;
        }
        g gVarJ2 = ((g) map.get(0)).j(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
        if (gVarJ2 != null && gVarJ2.f14298i != -1) {
            if (z4) {
                return false;
            }
            return this.f14323d.onAccessibilityHoverEvent(gVarJ2.f14291b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (!map.isEmpty() && (gVarJ = ((g) map.get(0)).j(new float[]{x4, y4, 0.0f, 1.0f}, z4)) != this.f14333o) {
                if (gVarJ != null) {
                    g(gVarJ.f14291b, 128);
                }
                g gVar = this.f14333o;
                if (gVar != null) {
                    g(gVar.f14291b, 256);
                }
                this.f14333o = gVarJ;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            g gVar2 = this.f14333o;
            if (gVar2 != null) {
                g(gVar2.f14291b, 256);
                this.f14333o = null;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i7, Bundle bundle, boolean z4) {
        int i8;
        int i9 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z7 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i10 = gVar.f14296g;
        int i11 = gVar.f14297h;
        if (i11 >= 0 && i10 >= 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 == 8 || i9 == 16) {
                            if (z4) {
                                gVar.f14297h = gVar.f14306r.length();
                            } else {
                                gVar.f14297h = 0;
                            }
                        }
                    } else if (z4 && i11 < gVar.f14306r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f14306r.substring(gVar.f14297h));
                        if (matcher.find()) {
                            gVar.f14297h += matcher.start(1);
                        } else {
                            gVar.f14297h = gVar.f14306r.length();
                        }
                    } else if (!z4 && gVar.f14297h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f14306r.substring(0, gVar.f14297h));
                        if (matcher2.find()) {
                            gVar.f14297h = matcher2.start(1);
                        } else {
                            gVar.f14297h = 0;
                        }
                    }
                } else if (z4 && i11 < gVar.f14306r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f14306r.substring(gVar.f14297h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f14297h += matcher3.start(1);
                    } else {
                        gVar.f14297h = gVar.f14306r.length();
                    }
                } else if (!z4 && gVar.f14297h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f14306r.substring(0, gVar.f14297h));
                    if (matcher4.find()) {
                        gVar.f14297h = matcher4.start(1);
                    }
                }
            } else if (z4 && i11 < gVar.f14306r.length()) {
                gVar.f14297h++;
            } else if (!z4 && (i8 = gVar.f14297h) > 0) {
                gVar.f14297h = i8 - 1;
            }
            if (!z7) {
                gVar.f14296g = gVar.f14297h;
            }
        }
        if (i10 != gVar.f14296g || i11 != gVar.f14297h) {
            String str = gVar.f14306r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventD = d(gVar.f14291b, 8192);
            accessibilityEventD.getText().add(str);
            accessibilityEventD.setFromIndex(gVar.f14296g);
            accessibilityEventD.setToIndex(gVar.f14297h);
            accessibilityEventD.setItemCount(str.length());
            h(accessibilityEventD);
        }
        C1017n0 c1017n0 = this.f14321b;
        if (i9 == 1) {
            if (z4) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.a(gVar, dVar)) {
                    c1017n0.i(i7, dVar, Boolean.valueOf(z7));
                    return true;
                }
            }
            if (!z4) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.a(gVar, dVar2)) {
                    c1017n0.i(i7, dVar2, Boolean.valueOf(z7));
                    return true;
                }
            }
        } else if (i9 == 2) {
            if (z4) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.a(gVar, dVar3)) {
                    c1017n0.i(i7, dVar3, Boolean.valueOf(z7));
                    return true;
                }
            }
            if (!z4) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.a(gVar, dVar4)) {
                    c1017n0.i(i7, dVar4, Boolean.valueOf(z7));
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
            g gVar = this.f14331m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f14291b);
            }
            Integer num = this.f14329k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i7 != 2) {
            return null;
        }
        g gVar2 = this.f14328i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f14291b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i7, int i8) {
        if (this.f14322c.isEnabled()) {
            h(d(i7, i8));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f14322c.isEnabled()) {
            View view = this.f14320a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z4) {
        if (this.f14338t == z4) {
            return;
        }
        this.f14338t = z4;
        if (z4) {
            this.f14330l |= 1;
        } else {
            this.f14330l &= -2;
        }
        ((FlutterJNI) this.f14321b.f17812c).setAccessibilityFeatures(this.f14330l);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:16:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x001f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0029 A[LOOP:1: B:17:0x001d->B:21:0x0029, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0027 A[SYNTHETIC] */
    public final boolean j(g gVar) {
        g gVar2;
        g gVar3;
        if (gVar.j > 0) {
            g gVar4 = this.f14328i;
            g gVar5 = null;
            if (gVar4 != null) {
                g gVar6 = gVar4.f14279P;
                while (true) {
                    if (gVar6 == null) {
                        gVar6 = null;
                        break;
                    }
                    if (gVar6 == gVar) {
                        break;
                    }
                    gVar6 = gVar6.f14279P;
                }
                if (gVar6 == null) {
                    gVar2 = this.f14328i;
                    if (gVar2 != null) {
                        for (gVar3 = gVar2.f14279P; gVar3 != null; gVar3 = gVar3.f14279P) {
                            if (gVar3.i(19)) {
                                gVar5 = gVar3;
                                break;
                            }
                        }
                        if (gVar5 != null) {
                        }
                    }
                }
            } else {
                gVar2 = this.f14328i;
                if (gVar2 != null) {
                    while (gVar3 != null) {
                        if (gVar3.i(19)) {
                            gVar5 = gVar3;
                            break;
                        }
                    }
                    if (gVar5 != null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        if (i7 >= 65536) {
            boolean zPerformAction = this.f14323d.performAction(i7, i8, bundle);
            if (zPerformAction && i8 == 128) {
                this.j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f14326g;
        g gVar = (g) map.get(Integer.valueOf(i7));
        if (gVar == null) {
            return false;
        }
        d dVar = d.INCREASE;
        d dVar2 = d.DECREASE;
        C1017n0 c1017n0 = this.f14321b;
        switch (i8) {
            case 16:
                c1017n0.h(i7, d.TAP);
                return true;
            case 32:
                c1017n0.h(i7, d.LONG_PRESS);
                return true;
            case 64:
                if (this.f14328i == null) {
                    this.f14320a.invalidate();
                }
                this.f14328i = gVar;
                c1017n0.h(i7, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap map2 = new HashMap();
                map2.put("type", "didGainFocus");
                map2.put("nodeId", Integer.valueOf(gVar.f14291b));
                ((F0) c1017n0.f17811b).L(map2, null);
                g(i7, 32768);
                if (g.a(gVar, dVar) || g.a(gVar, dVar2)) {
                    g(i7, 4);
                }
                return true;
            case 128:
                g gVar2 = this.f14328i;
                if (gVar2 != null && gVar2.f14291b == i7) {
                    this.f14328i = null;
                }
                Integer num = this.j;
                if (num != null && num.intValue() == i7) {
                    this.j = null;
                }
                c1017n0.h(i7, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i7, 65536);
                return true;
            case 256:
                return f(gVar, i7, bundle, true);
            case 512:
                return f(gVar, i7, bundle, false);
            case 4096:
                d dVar3 = d.SCROLL_UP;
                if (g.a(gVar, dVar3)) {
                    c1017n0.h(i7, dVar3);
                } else {
                    d dVar4 = d.SCROLL_LEFT;
                    if (g.a(gVar, dVar4)) {
                        c1017n0.h(i7, dVar4);
                    } else {
                        if (!g.a(gVar, dVar)) {
                            return false;
                        }
                        gVar.f14306r = gVar.f14308t;
                        gVar.f14307s = gVar.f14309u;
                        g(i7, 4);
                        c1017n0.h(i7, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.SCROLL_DOWN;
                if (g.a(gVar, dVar5)) {
                    c1017n0.h(i7, dVar5);
                } else {
                    d dVar6 = d.SCROLL_RIGHT;
                    if (g.a(gVar, dVar6)) {
                        c1017n0.h(i7, dVar6);
                    } else {
                        if (!g.a(gVar, dVar2)) {
                            return false;
                        }
                        gVar.f14306r = gVar.f14310v;
                        gVar.f14307s = gVar.f14311w;
                        g(i7, 4);
                        c1017n0.h(i7, dVar2);
                    }
                }
                return true;
            case 16384:
                c1017n0.h(i7, d.COPY);
                return true;
            case 32768:
                c1017n0.h(i7, d.PASTE);
                return true;
            case 65536:
                c1017n0.h(i7, d.CUT);
                return true;
            case 131072:
                HashMap map3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    map3.put("base", Integer.valueOf(gVar.f14297h));
                    map3.put("extent", Integer.valueOf(gVar.f14297h));
                }
                c1017n0.i(i7, d.SET_SELECTION, map3);
                g gVar3 = (g) map.get(Integer.valueOf(i7));
                gVar3.f14296g = ((Integer) map3.get("base")).intValue();
                gVar3.f14297h = ((Integer) map3.get("extent")).intValue();
                return true;
            case 1048576:
                c1017n0.h(i7, d.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                c1017n0.i(i7, d.SET_TEXT, string);
                gVar.f14306r = string;
                gVar.f14307s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                c1017n0.h(i7, d.SHOW_ON_SCREEN);
                return true;
            default:
                e eVar = (e) this.f14327h.get(Integer.valueOf(i8 - 267386881));
                if (eVar == null) {
                    return false;
                }
                c1017n0.i(i7, d.CUSTOM_ACTION, Integer.valueOf(eVar.f14259b));
                return true;
        }
    }
}
