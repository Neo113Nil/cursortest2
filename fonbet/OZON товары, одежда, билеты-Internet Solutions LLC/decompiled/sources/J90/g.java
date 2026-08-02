package J90;

import B0.C2454a;
import Sc.o;
import Sc.s;
import android.content.Context;
import android.text.Editable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.Y;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f14228a;

    /* renamed from: b, reason: collision with root package name */
    private EditText f14229b;

    /* renamed from: c, reason: collision with root package name */
    private SimpleTextWatcher f14230c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f14231d;

    /* renamed from: e, reason: collision with root package name */
    private int f14232e;

    /* renamed from: f, reason: collision with root package name */
    private int f14233f;

    /* renamed from: g, reason: collision with root package name */
    private int f14234g;

    /* renamed from: h, reason: collision with root package name */
    private int f14235h;

    /* renamed from: i, reason: collision with root package name */
    private int f14236i;

    /* renamed from: j, reason: collision with root package name */
    private int f14237j;

    /* renamed from: k, reason: collision with root package name */
    private final Pattern f14238k;

    /* renamed from: l, reason: collision with root package name */
    private final Pattern f14239l;

    /* renamed from: m, reason: collision with root package name */
    private final Pattern f14240m;

    /* renamed from: n, reason: collision with root package name */
    private final Pattern f14241n;

    /* renamed from: o, reason: collision with root package name */
    private final Pattern f14242o;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f14243a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14244b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final EnumC0268a f14245c;

        /* renamed from: d, reason: collision with root package name */
        private final int f14246d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: J90.g$a$a, reason: collision with other inner class name */
        public static final class EnumC0268a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ EnumC0268a[] $VALUES;

            /* renamed from: BG, reason: collision with root package name */
            public static final EnumC0268a f14247BG;

            /* renamed from: FG, reason: collision with root package name */
            public static final EnumC0268a f14248FG;

            static {
                EnumC0268a enumC0268a = new EnumC0268a("FG", 0);
                f14248FG = enumC0268a;
                EnumC0268a enumC0268a2 = new EnumC0268a("BG", 1);
                f14247BG = enumC0268a2;
                EnumC0268a[] enumC0268aArr = {enumC0268a, enumC0268a2};
                $VALUES = enumC0268aArr;
                $ENTRIES = Xc.b.a(enumC0268aArr);
            }

            private EnumC0268a() {
                throw null;
            }

            public static EnumC0268a valueOf(String str) {
                return (EnumC0268a) Enum.valueOf(EnumC0268a.class, str);
            }

            public static EnumC0268a[] values() {
                return (EnumC0268a[]) $VALUES.clone();
            }
        }

        public a(int i11, int i12, @NotNull EnumC0268a kind, int i13) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f14243a = i11;
            this.f14244b = i12;
            this.f14245c = kind;
            this.f14246d = i13;
        }

        public final int a() {
            return this.f14246d;
        }

        public final int b() {
            return this.f14244b;
        }

        @NotNull
        public final EnumC0268a c() {
            return this.f14245c;
        }

        public final int d() {
            return this.f14243a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14243a == aVar.f14243a && this.f14244b == aVar.f14244b && this.f14245c == aVar.f14245c && this.f14246d == aVar.f14246d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f14246d) + ((this.f14245c.hashCode() + C2454a.a(this.f14244b, Integer.hashCode(this.f14243a) * 31, 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SpanSpec(start=");
            sb2.append(this.f14243a);
            sb2.append(", end=");
            sb2.append(this.f14244b);
            sb2.append(", kind=");
            sb2.append(this.f14245c);
            sb2.append(", color=");
            return K00.b.e(this.f14246d, ")", sb2);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.ui.nativebridge.JsonHighlighter$highlight$1", f = "JsonHighlighter.kt", l = {130}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f14249d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14250e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EditText f14251f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f14252g;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14253a;

            static {
                int[] iArr = new int[a.EnumC0268a.values().length];
                try {
                    iArr[a.EnumC0268a.f14248FG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC0268a.f14247BG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14253a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, EditText editText, g gVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f14250e = z11;
            this.f14251f = editText;
            this.f14252g = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f14250e, this.f14251f, this.f14252g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0317  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x043a A[LOOP:12: B:130:0x0434->B:132:0x043a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x044e  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x035e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            Iterable<a> iterable;
            Iterator it;
            int i11;
            int i12;
            int i13 = 1;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i14 = this.f14249d;
            if (i14 == 0) {
                s.b(obj);
                if (!this.f14250e) {
                    this.f14249d = 1;
                    if (Y.b(200L, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            EditText editText = this.f14251f;
            Editable editableText = editText.getEditableText();
            Intrinsics.checkNotNullExpressionValue(editableText, "getEditableText(...)");
            String obj2 = editableText.toString();
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editableText.getSpans(0, editableText.length(), ForegroundColorSpan.class);
            BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) editableText.getSpans(0, editableText.length(), BackgroundColorSpan.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Intrinsics.f(foregroundColorSpanArr);
            int length = foregroundColorSpanArr.length;
            int i15 = 0;
            while (i15 < length) {
                ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr[i15];
                int spanStart = editableText.getSpanStart(foregroundColorSpan);
                int spanEnd = editableText.getSpanEnd(foregroundColorSpan);
                Intrinsics.g(foregroundColorSpan, "null cannot be cast to non-null type android.text.style.ForegroundColorSpan");
                linkedHashMap.put(foregroundColorSpan, new a(spanStart, spanEnd, a.EnumC0268a.f14248FG, foregroundColorSpan.getForegroundColor()));
                i15++;
                i13 = i13;
            }
            int i16 = i13;
            int i17 = 2;
            Intrinsics.f(backgroundColorSpanArr);
            for (BackgroundColorSpan backgroundColorSpan : backgroundColorSpanArr) {
                int spanStart2 = editableText.getSpanStart(backgroundColorSpan);
                int spanEnd2 = editableText.getSpanEnd(backgroundColorSpan);
                Intrinsics.g(backgroundColorSpan, "null cannot be cast to non-null type android.text.style.BackgroundColorSpan");
                linkedHashMap.put(backgroundColorSpan, new a(spanStart2, spanEnd2, a.EnumC0268a.f14247BG, backgroundColorSpan.getBackgroundColor()));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            g gVar = this.f14252g;
            Matcher matcher = gVar.f14238k.matcher(obj2);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                arrayList2.add(kotlin.ranges.h.o(start, end));
                arrayList.add(new a(start, end, a.EnumC0268a.f14248FG, gVar.f14232e));
            }
            ArrayList arrayList3 = new ArrayList();
            Matcher matcher2 = gVar.f14239l.matcher(obj2);
            while (matcher2.find()) {
                arrayList3.add(kotlin.ranges.h.o(matcher2.start(), matcher2.end()));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next = it2.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                IntRange intRange = (IntRange) next;
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        IntRange intRange2 = (IntRange) it3.next();
                        if (intRange2.getF71842a() > intRange.getF71843b() || intRange.getF71842a() > intRange2.getF71843b()) {
                        }
                    }
                }
                arrayList4.add(intRange);
                arrayList.add(new a(intRange.getF71842a(), intRange.getF71843b() + 1, a.EnumC0268a.f14248FG, gVar.f14233f));
            }
            Matcher matcher3 = gVar.f14240m.matcher(obj2);
            while (matcher3.find()) {
                int start2 = matcher3.start();
                int end2 = matcher3.end();
                if (!g.m(gVar, start2, arrayList3)) {
                    arrayList.add(new a(start2, end2, a.EnumC0268a.f14248FG, gVar.f14234g));
                }
            }
            Matcher matcher4 = gVar.f14241n.matcher(obj2);
            while (matcher4.find()) {
                int start3 = matcher4.start();
                int end3 = matcher4.end();
                if (!g.m(gVar, start3, arrayList3)) {
                    arrayList.add(new a(start3, end3, a.EnumC0268a.f14248FG, gVar.f14235h));
                }
            }
            Matcher matcher5 = gVar.f14242o.matcher(obj2);
            while (matcher5.find()) {
                arrayList.add(new a(matcher5.start(), matcher5.end(), a.EnumC0268a.f14248FG, gVar.f14236i));
            }
            int e11 = kotlin.ranges.h.e(editText.getSelectionStart(), 0, obj2.length());
            if (obj2.length() != 0) {
                int i18 = e11 - 1;
                if (i18 < 0) {
                    i18 = 0;
                }
                int length2 = obj2.length() - 1;
                if (e11 > length2) {
                    e11 = length2;
                }
                Character H11 = kotlin.text.h.H(i18, obj2);
                Character H12 = kotlin.text.h.H(e11, obj2);
                Character[] elements = {'{', '['};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set j02 = C7705l.j0(elements);
                Character[] elements2 = {'}', ']'};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                Set j03 = C7705l.j0(elements2);
                int i19 = e11;
                Map j11 = U.j(new Pair('{', '}'), new Pair('[', ']'), new Pair('}', '{'), new Pair(']', '['));
                if (H11 == null || (!j02.contains(H11) && !j03.contains(H11))) {
                    if (H12 != null && (j02.contains(H12) || j03.contains(H12))) {
                        i18 = i19;
                    }
                }
                char charAt = obj2.charAt(i18);
                Character ch2 = (Character) j11.get(Character.valueOf(charAt));
                if (ch2 != null) {
                    char charValue = ch2.charValue();
                    if (!j02.contains(Character.valueOf(charAt))) {
                        int i21 = 0;
                        for (int i22 = i18; i22 >= 0; i22--) {
                            char charAt2 = obj2.charAt(i22);
                            if (charAt2 == charAt) {
                                i21++;
                            }
                            if (charAt2 == charValue && i21 - 1 == 0) {
                                pair = new Pair(Integer.valueOf(i22), Integer.valueOf(i18));
                                break;
                            }
                        }
                    } else {
                        int i23 = 0;
                        for (int i24 = i18; i24 < obj2.length(); i24++) {
                            char charAt3 = obj2.charAt(i24);
                            if (charAt3 == charAt) {
                                i23++;
                            }
                            if (charAt3 == charValue && i23 - 1 == 0) {
                                pair = new Pair(Integer.valueOf(i18), Integer.valueOf(i24));
                                break;
                            }
                        }
                    }
                    if (pair != null) {
                        int intValue = ((Number) pair.a()).intValue();
                        int intValue2 = ((Number) pair.b()).intValue();
                        if (intValue != 0 || intValue2 != obj2.length() - 1) {
                            a.EnumC0268a enumC0268a = a.EnumC0268a.f14247BG;
                            arrayList.add(new a(intValue, intValue + 1, enumC0268a, gVar.f14237j));
                            arrayList.add(new a(intValue2, intValue2 + 1, enumC0268a, gVar.f14237j));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        d dVar = new d();
                        e eVar = new e();
                        f fVar = new f();
                        Function1[] function1Arr = new Function1[3];
                        function1Arr[0] = dVar;
                        function1Arr[i16] = eVar;
                        function1Arr[2] = fVar;
                        List<a> I02 = C7714v.I0(Vc.a.a(function1Arr), arrayList);
                        ArrayList arrayList5 = new ArrayList();
                        a aVar2 = null;
                        for (a aVar3 : I02) {
                            if (aVar2 != null) {
                                if (aVar2.c() == aVar3.c() && aVar2.a() == aVar3.a() && aVar3.d() <= aVar2.b()) {
                                    aVar2 = new a(aVar2.d(), Math.max(aVar2.b(), aVar3.b()), aVar2.c(), aVar2.a());
                                } else {
                                    arrayList5.add(aVar2);
                                }
                            }
                            aVar2 = aVar3;
                        }
                        if (aVar2 != null) {
                            arrayList5.add(aVar2);
                        }
                        iterable = arrayList5;
                    } else {
                        iterable = K.f71697a;
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        a aVar4 = (a) entry.getValue();
                        Iterable iterable2 = iterable;
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it4 = iterable2.iterator();
                            while (it4.hasNext()) {
                                if (g.n(gVar, (a) it4.next(), aVar4)) {
                                    break;
                                }
                            }
                        }
                        arrayList6.add(key);
                    }
                    it = arrayList6.iterator();
                    while (it.hasNext()) {
                        editableText.removeSpan(it.next());
                    }
                    for (a aVar5 : iterable) {
                        if (g.a(gVar, aVar5, linkedHashMap)) {
                            i11 = i17;
                            i12 = i16;
                        } else {
                            int i25 = a.f14253a[aVar5.c().ordinal()];
                            i12 = i16;
                            if (i25 != i12) {
                                i11 = i17;
                                if (i25 != i11) {
                                    throw new o();
                                }
                                editableText.setSpan(new BackgroundColorSpan(aVar5.a()), aVar5.d(), aVar5.b(), 33);
                            } else {
                                i11 = i17;
                                editableText.setSpan(new ForegroundColorSpan(aVar5.a()), aVar5.d(), aVar5.b(), 33);
                            }
                        }
                        i16 = i12;
                        i17 = i11;
                    }
                    return Unit.f71690a;
                }
            }
            pair = null;
            if (pair != null) {
            }
            if (arrayList.isEmpty()) {
            }
            ArrayList arrayList62 = new ArrayList();
            while (r2.hasNext()) {
            }
            it = arrayList62.iterator();
            while (it.hasNext()) {
            }
            while (r0.hasNext()) {
            }
            return Unit.f71690a;
        }
    }

    public g(@NotNull D scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f14228a = scope;
        this.f14238k = Pattern.compile("(?m)\"([^\"\\\\]|\\\\.)*\"\\s*(?=:)");
        this.f14239l = Pattern.compile("\"([^\"\\\\]|\\\\.)*\"");
        this.f14240m = Pattern.compile("(?<!\\w)(-?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?)(?!\\w)");
        this.f14241n = Pattern.compile("\\b(true|false|null)\\b");
        this.f14242o = Pattern.compile("[\\{\\}\\[\\]]");
    }

    public static final boolean a(g gVar, a aVar, LinkedHashMap linkedHashMap) {
        gVar.getClass();
        Collection values = linkedHashMap.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (s((a) it.next(), aVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m(g gVar, int i11, ArrayList arrayList) {
        gVar.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntRange intRange = (IntRange) it.next();
            int f71842a = intRange.getF71842a();
            if (i11 <= intRange.getF71843b() && f71842a <= i11) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ boolean n(g gVar, a aVar, a aVar2) {
        gVar.getClass();
        return s(aVar, aVar2);
    }

    private static boolean s(a aVar, a aVar2) {
        return aVar.d() == aVar2.d() && aVar.b() == aVar2.b() && aVar.c() == aVar2.c() && aVar.a() == aVar2.a();
    }

    public final void o(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        if (this.f14229b == editText) {
            return;
        }
        p();
        this.f14229b = editText;
        SimpleTextWatcher simpleTextWatcher = new SimpleTextWatcher(new J90.b(this, 0));
        this.f14230c = simpleTextWatcher;
        editText.addTextChangedListener(simpleTextWatcher);
        editText.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: J90.c
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                g.this.q(false);
            }
        });
        q(true);
    }

    public final void p() {
        EditText editText = this.f14229b;
        if (editText != null) {
            SimpleTextWatcher simpleTextWatcher = this.f14230c;
            if (simpleTextWatcher != null) {
                editText.removeTextChangedListener(simpleTextWatcher);
            }
            try {
                editText.setOnScrollChangeListener(null);
            } catch (Throwable unused) {
            }
        }
        this.f14230c = null;
        this.f14229b = null;
        B0 b02 = this.f14231d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f14231d = null;
    }

    public final void q(boolean z11) {
        Editable text;
        String obj;
        EditText editText = this.f14229b;
        if (editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null || obj.length() > 120000) {
            return;
        }
        B0 b02 = this.f14231d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f14231d = C10727i.c(this.f14228a, null, null, new b(z11, editText, this, null), 3);
    }

    public final void r(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14232e = androidx.core.content.a.getColor(context, R.color.oz_semantic_text_primary);
        this.f14233f = androidx.core.content.a.getColor(context, R.color.green_350);
        this.f14234g = androidx.core.content.a.getColor(context, R.color.blue_400);
        this.f14235h = androidx.core.content.a.getColor(context, R.color.yellow_800);
        this.f14236i = androidx.core.content.a.getColor(context, R.color.magenta_450);
        this.f14237j = androidx.core.content.a.getColor(context, R.color.red_300);
    }
}
