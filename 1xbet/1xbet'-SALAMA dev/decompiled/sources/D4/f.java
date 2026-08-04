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
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.L;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f1754f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f1755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayInputStream f1756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f1757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f1758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1759e;

    public f(V0 v6, ByteArrayInputStream byteArrayInputStream) {
        this.f1755a = v6;
        this.f1756b = byteArrayInputStream;
        new InputStreamReader(byteArrayInputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
        this.f1758d = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    public final void a(String str) throws IOException {
        this.f1756b.close();
        throw new IllegalArgumentException(L.i("Invalid bundle: ", str));
    }

    public final boolean b() throws IOException {
        ByteBuffer byteBuffer = this.f1758d;
        byteBuffer.compact();
        int i7 = this.f1756b.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        boolean z4 = i7 > 0;
        if (z4) {
            byteBuffer.position(byteBuffer.position() + i7);
        }
        byteBuffer.flip();
        return z4;
    }

    public final c c() throws JSONException, IOException {
        ByteBuffer byteBuffer;
        int i7;
        String string;
        c cVar;
        String string2;
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
                        byteBuffer.reset();
                        break;
                    }
                    i7++;
                } catch (Throwable th) {
                    byteBuffer.reset();
                    throw th;
                }
            }
            if (i7 != -1) {
                break;
            }
        } while (b());
        int iRemaining = byteBuffer.remaining();
        Charset charset = f1754f;
        if (iRemaining == 0) {
            string = null;
        } else {
            if (i7 == -1) {
                a("Reached the end of bundle when a length string is expected.");
                throw null;
            }
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr);
            string = charset.decode(ByteBuffer.wrap(bArr)).toString();
        }
        if (string == null) {
            return null;
        }
        int i9 = Integer.parseInt(string);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = i9;
        while (i10 > 0) {
            if (byteBuffer.remaining() == 0 && !b()) {
                a("Reached the end of bundle when more data was expected.");
                throw null;
            }
            int iMin = Math.min(i10, byteBuffer.remaining());
            byteArrayOutputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iMin);
            byteBuffer.position(byteBuffer.position() + iMin);
            i10 -= iMin;
        }
        String string3 = byteArrayOutputStream.toString(charset.name());
        this.f1759e += (long) (string.getBytes(charset).length + i9);
        JSONObject jSONObject = new JSONObject(string3);
        boolean zHas = jSONObject.has("metadata");
        V0 v6 = this.f1755a;
        if (zHas) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            v6.getClass();
            e eVar = new e(jSONObject2.getString("id"), jSONObject2.getInt("version"), new n(v6.x(jSONObject2.get("createTime"))), jSONObject2.getInt("totalDocuments"), jSONObject2.getLong("totalBytes"));
            Q0.a.v(1, "BundleElement", "BundleMetadata element loaded", new Object[0]);
            return eVar;
        }
        if (jSONObject.has("namedQuery")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("namedQuery");
            v6.getClass();
            String string4 = jSONObject3.getString("name");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("bundledQuery");
            JSONObject jSONObject5 = jSONObject4.getJSONObject("structuredQuery");
            if (jSONObject5.has("select")) {
                throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
            }
            m mVarS = v6.s(jSONObject4.getString("parent"));
            JSONArray jSONArray = jSONObject5.getJSONArray("from");
            if (jSONArray.length() != 1) {
                throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
            }
            JSONObject jSONObject6 = jSONArray.getJSONObject(0);
            if (jSONObject6.optBoolean("allDescendants", false)) {
                mVar = mVarS;
                string2 = jSONObject6.getString("collectionId");
            } else {
                string2 = null;
                mVar = (m) mVarS.b(jSONObject6.getString("collectionId"));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject("where");
            ArrayList arrayList = new ArrayList();
            if (jSONObjectOptJSONObject != null) {
                v6.m(arrayList, jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject5.optJSONArray("orderBy");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int i11 = 0;
                while (i11 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject7 = jSONArrayOptJSONArray.getJSONObject(i11);
                    JSONArray jSONArray2 = jSONArrayOptJSONArray;
                    ArrayList arrayList3 = arrayList;
                    arrayList2.add(new A(jSONObject7.optString("direction", "ASCENDING").equals("ASCENDING") ? 1 : 2, j.y(jSONObject7.getJSONObject("field").getString("fieldPath"))));
                    i11++;
                    jSONArrayOptJSONArray = jSONArray2;
                    arrayList = arrayList3;
                }
            }
            ArrayList arrayList4 = arrayList;
            JSONObject jSONObjectOptJSONObject2 = jSONObject5.optJSONObject("startAt");
            if (jSONObjectOptJSONObject2 != null) {
                z4 = false;
                c0170c = new C0170c(v6.w(jSONObjectOptJSONObject2), jSONObjectOptJSONObject2.optBoolean("before", false));
            } else {
                z4 = false;
                c0170c = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject5.optJSONObject("endAt");
            C0170c c0170c2 = jSONObjectOptJSONObject3 != null ? new C0170c(v6.w(jSONObjectOptJSONObject3), !jSONObjectOptJSONObject3.optBoolean("before", z4)) : null;
            if (jSONObject5.has("offset")) {
                throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject5.optJSONObject("limit");
            int iOptInt = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optInt("value", -1) : jSONObject5.optInt("limit", -1);
            String strOptString = jSONObject4.optString("limitType", "FIRST");
            if (strOptString.equals("FIRST")) {
                i8 = 1;
            } else {
                if (!strOptString.equals("LAST")) {
                    throw new IllegalArgumentException("Invalid limit type for bundle query: ".concat(strOptString));
                }
                i8 = 2;
            }
            i iVar = new i(string4, new h(new C(mVar, string2, arrayList4, arrayList2, iOptInt, 1, c0170c, c0170c2).i(), i8), new n(v6.x(jSONObject3.get("readTime"))));
            Q0.a.v(1, "BundleElement", L.i("Query loaded: ", string4), new Object[0]);
            cVar = iVar;
        } else if (jSONObject.has("documentMetadata")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("documentMetadata");
            v6.getClass();
            H4.h hVar = new H4.h(v6.s(jSONObject8.getString("name")));
            n nVar = new n(v6.x(jSONObject8.get("readTime")));
            boolean zOptBoolean = jSONObject8.optBoolean("exists", false);
            JSONArray jSONArrayOptJSONArray2 = jSONObject8.optJSONArray("queries");
            ArrayList arrayList5 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                    arrayList5.add(jSONArrayOptJSONArray2.getString(i12));
                }
            }
            g gVar = new g(hVar, nVar, zOptBoolean, arrayList5);
            Q0.a.v(1, "BundleElement", "Document metadata loaded: " + hVar, new Object[0]);
            cVar = gVar;
        } else {
            if (!jSONObject.has("document")) {
                a("Cannot decode unknown Bundle element: " + string3);
                throw null;
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject("document");
            v6.getClass();
            H4.h hVar2 = new H4.h(v6.s(jSONObject9.getString("name")));
            n nVar2 = new n(v6.x(jSONObject9.get("updateTime")));
            H0 h0S = I0.S();
            v6.q(h0S, jSONObject9.getJSONObject("fields"));
            l lVarE = l.e(((I0) h0S.f12096b).N().y());
            k kVar = new k(hVar2);
            kVar.a(nVar2, lVarE);
            b bVar = new b();
            bVar.f1741a = kVar;
            Q0.a.v(1, "BundleElement", "Document loaded: " + hVar2, new Object[0]);
            cVar = bVar;
        }
        return cVar;
    }
}
