package L00;

import Sc.InterfaceC4008j;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16081a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f16082b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f16083c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16084d;

    static final class b extends AbstractC7737t implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            f fVar = f.this;
            Uri.Builder buildUpon = Uri.parse(fVar.f16081a).buildUpon();
            Iterator it = fVar.f16082b.iterator();
            while (it.hasNext()) {
                buildUpon.appendPath((String) it.next());
            }
            for (Map.Entry entry : fVar.f16083c.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return buildUpon.build().toString();
        }
    }

    private f() {
        throw null;
    }

    public f(String str, List list, Map map) {
        this.f16081a = str;
        this.f16082b = list;
        this.f16083c = map;
        this.f16084d = Sc.k.b(new b());
    }

    @NotNull
    public final String d() {
        return (String) this.f16084d.getValue();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f16085a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f16086b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap<String, String> f16087c;

        public a(@NotNull String baseUrl) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            this.f16085a = baseUrl;
            this.f16086b = new ArrayList();
            this.f16087c = new LinkedHashMap<>();
        }

        @NotNull
        public final void a(@NotNull String segement) {
            Intrinsics.checkNotNullParameter(segement, "segement");
            this.f16086b.add(segement);
        }

        @NotNull
        public final f b() {
            return new f(this.f16085a, C7714v.U0(this.f16086b), U.t(this.f16087c));
        }

        public a(@NotNull f url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f16085a = url.f16081a;
            this.f16086b = new ArrayList(url.f16082b);
            this.f16087c = new LinkedHashMap<>(url.f16083c);
        }
    }
}
