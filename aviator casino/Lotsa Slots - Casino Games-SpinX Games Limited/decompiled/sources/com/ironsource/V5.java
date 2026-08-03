package com.ironsource;

/* loaded from: classes5.dex */
public class V5 {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f6013a;
    private final com.ironsource.C3020e5 b;
    private final com.ironsource.U5 c;
    private final com.ironsource.Nb d;
    private final com.ironsource.InterfaceC3362x7 e = com.ironsource.Jb.Y().a();

    public V5(android.content.Context context, com.ironsource.C3020e5 c3020e5, com.ironsource.U5 u5, com.ironsource.Nb nb) {
        this.f6013a = context;
        this.b = c3020e5;
        this.c = u5;
        this.d = nb;
    }

    public void a(com.ironsource.C3381y8 c3381y8, java.lang.String str, int i, int i2, com.ironsource.Nc nc) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.Exception(com.ironsource.T5.a.f5976a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new java.lang.Exception(com.ironsource.Z3.A);
        }
        if (!com.ironsource.T3.h(this.f6013a)) {
            throw new java.lang.Exception(com.ironsource.Z3.C);
        }
        this.c.a(c3381y8.getPath(), new com.ironsource.V5.a(nc));
        if (!c3381y8.exists()) {
            this.b.a(c3381y8, str, i, i2, this.c);
            return;
        }
        android.os.Message message = new android.os.Message();
        message.obj = c3381y8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void b(com.ironsource.C3381y8 c3381y8) throws java.lang.Exception {
        if (c3381y8.exists()) {
            java.util.ArrayList<com.ironsource.C3381y8> filesInFolderRecursive = com.ironsource.sdk.utils.IronSourceStorageUtils.getFilesInFolderRecursive(c3381y8);
            if (!com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFolderContentRecursive(c3381y8) || !c3381y8.delete()) {
                throw new java.lang.Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public org.json.JSONObject c(com.ironsource.C3381y8 c3381y8) throws java.lang.Exception {
        if (c3381y8.exists()) {
            return com.ironsource.sdk.utils.IronSourceStorageUtils.buildFilesMapOfDirectory(c3381y8, this.d.b());
        }
        throw new java.lang.Exception("Folder does not exist");
    }

    public long d(com.ironsource.C3381y8 c3381y8) throws java.lang.Exception {
        if (c3381y8.exists()) {
            return com.ironsource.sdk.utils.IronSourceStorageUtils.getTotalSizeOfDir(c3381y8);
        }
        throw new java.lang.Exception("Folder does not exist");
    }

    class a implements com.ironsource.Nc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.Nc f6014a;

        /* renamed from: com.ironsource.V5$a$a, reason: collision with other inner class name */
        class C0128a extends org.json.JSONObject {
            C0128a() throws org.json.JSONException {
                put("lastReferencedTime", java.lang.System.currentTimeMillis());
            }
        }

        a(com.ironsource.Nc nc) {
            this.f6014a = nc;
        }

        @Override // com.ironsource.Nc
        public void a(com.ironsource.C3381y8 c3381y8) {
            this.f6014a.a(c3381y8);
            try {
                com.ironsource.V5.this.d.a(c3381y8.getName(), new com.ironsource.V5.a.C0128a());
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(com.ironsource.C3381y8 c3381y8, com.ironsource.C3220p8 c3220p8) {
            this.f6014a.a(c3381y8, c3220p8);
        }
    }

    public void a(com.ironsource.C3381y8 c3381y8) throws java.lang.Exception {
        if (c3381y8.exists()) {
            if (c3381y8.delete()) {
                this.d.a(c3381y8.getName());
                return;
            }
            throw new java.lang.Exception("Failed to delete file");
        }
    }

    public void a(com.ironsource.C3381y8 c3381y8, org.json.JSONObject jSONObject) throws java.lang.Exception {
        if (jSONObject != null) {
            if (c3381y8.exists()) {
                if (!this.d.b(c3381y8.getName(), jSONObject)) {
                    throw new java.lang.Exception("Failed to update attribute");
                }
                return;
            }
            throw new java.lang.Exception("File does not exist");
        }
        throw new java.lang.Exception("Missing attributes to update");
    }
}
