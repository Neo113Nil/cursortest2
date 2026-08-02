package D4;

import E4.A;
import E4.C;
import E4.C0170c;
import H4.j;
import H4.k;
import H4.l;
import H4.m;
import H4.n;
import Y4.H0;
import Y4.I0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.L;
import w1.V0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f1754f = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final V0 f1755a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteArrayInputStream f1756b;

    /* renamed from: c, reason: collision with root package name */
    public e f1757c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f1758d;

    /* renamed from: e, reason: collision with root package name */
    public long f1759e;

    public f(V0 v02, ByteArrayInputStream byteArrayInputStream) {
        this.f1755a = v02;
        this.f1756b = byteArrayInputStream;
        new InputStreamReader(byteArrayInputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f1758d = allocate;
        allocate.flip();
    }

    public final void a(String str) {
        this.f1756b.close();
        throw new IllegalArgumentException(L.i("Invalid bundle: ", str));
    }

    public final boolean b() {
        ByteBuffer byteBuffer = this.f1758d;
        byteBuffer.compact();
        int read = this.f1756b.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        boolean z4 = read > 0;
        if (z4) {
            byteBuffer.position(byteBuffer.position() + read);
        }
        byteBuffer.flip();
        return z4;
    }

    public final c c() {
        ByteBuffer byteBuffer;
        int i7;
        String charBuffer;
        c cVar;
        String str;
        m mVar;
        boolean z4;
        C0170c c0170c;
        int i8;
        do {
            byteBuffer = this.f1758d;
            byteBuffer.mark();
            i7 = 0;
            while (true) {
                try {
                    if (i7 >= byteBuffer.remaining()) {
                        byteBuffer.reset();
                        i7 = -1;
                        break;
                    }
                    if (byteBuffer.get() == 123) {
                        break;
                    }
                    i7++;
                } finally {
                    byteBuffer.reset();
                }
            }
            if (i7 != -1) {
                break;
            }
        } while (b());
        int remaining = byteBuffer.remaining();
        Charset charset = f1754f;
        if (remaining == 0) {
            charBuffer = null;
        } else {
            if (i7 == -1) {
                a("Reached the end of bundle when a length string is expected.");
                throw null;
            }
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr);
            charBuffer = charset.decode(ByteBuffer.wrap(bArr)).toString();
        }
        if (charBuffer == null) {
            return null;
        }
        int parseInt = Integer.parseInt(charBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i9 = parseInt;
        while (i9 > 0) {
            if (byteBuffer.remaining() == 0 && !b()) {
                a("Reached the end of bundle when more data was expected.");
                throw null;
            }
            int min = Math.min(i9, byteBuffer.remaining());
            byteArrayOutputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), min);
            byteBuffer.position(byteBuffer.position() + min);
            i9 -= min;
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(charset.name());
        this.f1759e += charBuffer.getBytes(charset).length + parseInt;
        JSONObject jSONObject = new JSONObject(byteArrayOutputStream2);
        boolean has = jSONObject.has("metadata");
        V0 v02 = this.f1755a;
        if (has) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            v02.getClass();
            e eVar = new e(jSONObject2.getString("id"), jSONObject2.getInt("version"), new n(v02.x(jSONObject2.get("createTime"))), jSONObject2.getInt("totalDocuments"), jSONObject2.getLong("totalBytes"));
            Q0.a.v(1, "BundleElement", "BundleMetadata element loaded", new Object[0]);
            return eVar;
        }
        if (jSONObject.has("namedQuery")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("namedQuery");
            v02.getClass();
            String string = jSONObject3.getString("name");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("bundledQuery");
            JSONObject jSONObject5 = jSONObject4.getJSONObject("structuredQuery");
            if (jSONObject5.has("select")) {
                throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
            }
            m s7 = v02.s(jSONObject4.getString("parent"));
            JSONArray jSONArray = jSONObject5.getJSONArray("from");
            if (jSONArray.length() != 1) {
                throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
            }
            JSONObject jSONObject6 = jSONArray.getJSONObject(0);
            if (jSONObject6.optBoolean("allDescendants", false)) {
                mVar = s7;
                str = jSONObject6.getString("collectionId");
            } else {
                str = null;
                mVar = (m) s7.b(jSONObject6.getString("collectionId"));
            }
            JSONObject optJSONObject = jSONObject5.optJSONObject("where");
            ArrayList arrayList = new ArrayList();
            if (optJSONObject != null) {
                v02.m(arrayList, optJSONObject);
            }
            JSONArray optJSONArray = jSONObject5.optJSONArray("orderBy");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                int i10 = 0;
                while (i10 < optJSONArray.length()) {
                    JSONObject jSONObject7 = optJSONArray.getJSONObject(i10);
                    JSONArray jSONArray2 = optJSONArray;
                    ArrayList arrayList3 = arrayList;
                    arrayList2.add(new A(jSONObject7.optString("direction", "ASCENDING").equals("ASCENDING") ? 1 : 2, j.y(jSONObject7.getJSONObject("field").getString("fieldPath"))));
                    i10++;
                    optJSONArray = jSONArray2;
                    arrayList = arrayList3;
                }
            }
            ArrayList arrayList4 = arrayList;
            JSONObject optJSONObject2 = jSONObject5.optJSONObject("startAt");
            if (optJSONObject2 != null) {
                z4 = false;
                c0170c = new C0170c(v02.w(optJSONObject2), optJSONObject2.optBoolean("before", false));
            } else {
                z4 = false;
                c0170c = null;
            }
            JSONObject optJSONObject3 = jSONObject5.optJSONObject("endAt");
            C0170c c0170c2 = optJSONObject3 != null ? new C0170c(v02.w(optJSONObject3), !optJSONObject3.optBoolean("before", z4)) : null;
            if (jSONObject5.has("offset")) {
                throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
            }
            JSONObject optJSONObject4 = jSONObject5.optJSONObject("limit");
            int optInt = optJSONObject4 != null ? optJSONObject4.optInt("value", -1) : jSONObject5.optInt("limit", -1);
            String optString = jSONObject4.optString("limitType", "FIRST");
            if (optString.equals("FIRST")) {
                i8 = 1;
            } else {
                if (!optString.equals("LAST")) {
                    throw new IllegalArgumentException("Invalid limit type for bundle query: ".concat(optString));
                }
                i8 = 2;
            }
            c iVar = new i(string, new h(new C(mVar, str, arrayList4, arrayList2, optInt, 1, c0170c, c0170c2).i(), i8), new n(v02.x(jSONObject3.get("readTime"))));
            Q0.a.v(1, "BundleElement", L.i("Query loaded: ", string), new Object[0]);
            cVar = iVar;
        } else if (jSONObject.has("documentMetadata")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("documentMetadata");
            v02.getClass();
            H4.h hVar = new H4.h(v02.s(jSONObject8.getString("name")));
            n nVar = new n(v02.x(jSONObject8.get("readTime")));
            boolean optBoolean = jSONObject8.optBoolean("exists", false);
            JSONArray optJSONArray2 = jSONObject8.optJSONArray("queries");
            ArrayList arrayList5 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    arrayList5.add(optJSONArray2.getString(i11));
                }
            }
            c gVar = new g(hVar, nVar, optBoolean, arrayList5);
            Q0.a.v(1, "BundleElement", "Document metadata loaded: " + hVar, new Object[0]);
            cVar = gVar;
        } else {
            if (!jSONObject.has("document")) {
                a("Cannot decode unknown Bundle element: " + byteArrayOutputStream2);
                throw null;
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject("document");
            v02.getClass();
            H4.h hVar2 = new H4.h(v02.s(jSONObject9.getString("name")));
            n nVar2 = new n(v02.x(jSONObject9.get("updateTime")));
            H0 S6 = I0.S();
            v02.q(S6, jSONObject9.getJSONObject("fields"));
            l e7 = l.e(((I0) S6.f12096b).N().y());
            k kVar = new k(hVar2);
            kVar.a(nVar2, e7);
            b bVar = new b();
            bVar.f1741a = kVar;
            Q0.a.v(1, "BundleElement", "Document loaded: " + hVar2, new Object[0]);
            cVar = bVar;
        }
        return cVar;
    }
}
