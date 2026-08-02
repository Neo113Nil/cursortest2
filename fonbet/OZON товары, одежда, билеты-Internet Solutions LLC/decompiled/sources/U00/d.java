package U00;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class d implements Iterable<JSONObject>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONArray f27264a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27265b;

    private static final class a implements Iterator<JSONObject>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONArray f27266a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27267b;

        /* renamed from: c, reason: collision with root package name */
        private int f27268c;

        public a(@NotNull JSONArray jsonArray, int i11) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            this.f27266a = jsonArray;
            this.f27267b = i11;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27268c < this.f27267b;
        }

        @Override // java.util.Iterator
        public final JSONObject next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f27268c;
            this.f27268c = i11 + 1;
            JSONObject jSONObject = this.f27266a.getJSONObject(i11);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            return jSONObject;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        this.f27264a = jsonArray;
        this.f27265b = jsonArray.length();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<JSONObject> iterator() {
        return new a(this.f27264a, this.f27265b);
    }
}
