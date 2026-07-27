package y1;

import A0.j;
import android.os.AsyncTask;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1252a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public j f10583a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.b f10584b;

    public AbstractAsyncTaskC1252a(V1.b bVar) {
        this.f10584b = bVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        j jVar = this.f10583a;
        if (jVar != null) {
            jVar.f68d = null;
            jVar.s();
        }
    }
}
