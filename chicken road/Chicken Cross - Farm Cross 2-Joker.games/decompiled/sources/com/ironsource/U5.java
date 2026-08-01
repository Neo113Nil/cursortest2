package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.S5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class U5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7944a;
    private final C4349c5 b;
    private final T5 c;
    private final Nb d;
    private final InterfaceC4673u7 e = Ib.a0().a();

    public U5(Context context, C4349c5 c4349c5, T5 t5, Nb nb) {
        this.f7944a = context;
        this.b = c4349c5;
        this.c = t5;
        this.d = nb;
    }

    public void a(C4710w8 c4710w8, String str, int i, int i2, Nc nc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(S5.a.f7886a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new Exception(W3.A);
        }
        if (!Q3.h(this.f7944a)) {
            throw new Exception(W3.C);
        }
        this.c.a(c4710w8.getPath(), new a(nc));
        if (!c4710w8.exists()) {
            this.b.a(c4710w8, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = c4710w8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void b(C4710w8 c4710w8) throws Exception {
        if (c4710w8.exists()) {
            ArrayList<C4710w8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c4710w8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c4710w8) || !c4710w8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C4710w8 c4710w8) throws Exception {
        if (c4710w8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c4710w8, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C4710w8 c4710w8) throws Exception {
        if (c4710w8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c4710w8);
        }
        throw new Exception("Folder does not exist");
    }

    class a implements Nc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Nc f7945a;

        /* renamed from: com.ironsource.U5$a$a, reason: collision with other inner class name */
        class C0316a extends JSONObject {
            C0316a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(Nc nc) {
            this.f7945a = nc;
        }

        @Override // com.ironsource.Nc
        public void a(C4710w8 c4710w8) {
            this.f7945a.a(c4710w8);
            try {
                U5.this.d.a(c4710w8.getName(), new C0316a());
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(C4710w8 c4710w8, C4549n8 c4549n8) {
            this.f7945a.a(c4710w8, c4549n8);
        }
    }

    public void a(C4710w8 c4710w8) throws Exception {
        if (c4710w8.exists()) {
            if (c4710w8.delete()) {
                this.d.a(c4710w8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C4710w8 c4710w8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c4710w8.exists()) {
                if (!this.d.b(c4710w8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
