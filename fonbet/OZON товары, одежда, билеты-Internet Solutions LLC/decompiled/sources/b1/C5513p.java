package b1;

import b1.InterfaceC5512o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5513p implements InterfaceC5512o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f55459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f55460b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f55461c;

    /* renamed from: b1.p$a */
    public static final class a implements InterfaceC5512o.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f55463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f55464c;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, Function0<? extends Object> function0) {
            this.f55463b = str;
            this.f55464c = (AbstractC7737t) function0;
        }

        @Override // b1.InterfaceC5512o.a
        public final void a() {
            C5513p c5513p = C5513p.this;
            LinkedHashMap linkedHashMap = c5513p.f55461c;
            String str = this.f55463b;
            List list = (List) linkedHashMap.remove(str);
            if (list != null) {
                list.remove(this.f55464c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            c5513p.f55461c.put(str, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5513p(Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> function1) {
        this.f55459a = (AbstractC7737t) function1;
        this.f55460b = map != null ? U.u(map) : new LinkedHashMap();
        this.f55461c = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // b1.InterfaceC5512o
    public final boolean a(@NotNull Object obj) {
        return ((Boolean) this.f55459a.invoke(obj)).booleanValue();
    }

    @Override // b1.InterfaceC5512o
    @NotNull
    public final InterfaceC5512o.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!CharsKt.c(str.charAt(i11))) {
                LinkedHashMap linkedHashMap = this.f55461c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(function0);
                return new a(str, function0);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // b1.InterfaceC5512o
    @NotNull
    public final Map<String, List<Object>> d() {
        LinkedHashMap u11 = U.u(this.f55460b);
        for (Map.Entry entry : this.f55461c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((Function0) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!a(invoke)) {
                        throw new IllegalStateException(C5503f.a(invoke).toString());
                    }
                    u11.put(str, C7714v.t(invoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    Object invoke2 = ((Function0) list.get(i11)).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException(C5503f.a(invoke2).toString());
                    }
                    arrayList.add(invoke2);
                }
                u11.put(str, arrayList);
            }
        }
        return u11;
    }

    @Override // b1.InterfaceC5512o
    public final Object f(@NotNull String str) {
        LinkedHashMap linkedHashMap = this.f55460b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
