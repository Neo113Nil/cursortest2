package a1;

/* loaded from: classes.dex */
public final class o implements a1.l {

    /* renamed from: b, reason: collision with root package name */
    public static final a1.o f1949b = new a1.o(a1.n.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    public final a1.n f1950a;

    public o(a1.n nVar) {
        this.f1950a = nVar;
    }

    @Override // a1.l
    public final java.nio.ByteBuffer a(java.lang.Object obj) {
        a1.m mVar = new a1.m();
        mVar.write(0);
        this.f1950a.writeValue(mVar, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // a1.l
    public final x0.e b(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        a1.n nVar = this.f1950a;
        java.lang.Object readValue = nVar.readValue(byteBuffer);
        java.lang.Object readValue2 = nVar.readValue(byteBuffer);
        if (!(readValue instanceof java.lang.String) || byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Method call corrupted");
        }
        return new x0.e(19, (java.lang.String) readValue, readValue2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // a1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        a1.n nVar = this.f1950a;
        if (b2 == 0) {
            java.lang.Object readValue = nVar.readValue(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return readValue;
            }
        }
        java.lang.Object readValue2 = nVar.readValue(byteBuffer);
        java.lang.Object readValue3 = nVar.readValue(byteBuffer);
        java.lang.Object readValue4 = nVar.readValue(byteBuffer);
        if ((readValue2 instanceof java.lang.String) && ((readValue3 == null || (readValue3 instanceof java.lang.String)) && !byteBuffer.hasRemaining())) {
            throw new a1.g((java.lang.String) readValue2, (java.lang.String) readValue3, readValue4);
        }
        throw new java.lang.IllegalArgumentException("Envelope corrupted");
    }

    @Override // a1.l
    public final java.nio.ByteBuffer d(java.lang.String str, java.lang.String str2) {
        a1.m mVar = new a1.m();
        mVar.write(1);
        a1.n nVar = this.f1950a;
        nVar.writeValue(mVar, "error");
        nVar.writeValue(mVar, str);
        nVar.writeValue(mVar, null);
        nVar.writeValue(mVar, str2);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // a1.l
    public final java.nio.ByteBuffer e(x0.e eVar) {
        a1.m mVar = new a1.m();
        a1.n nVar = this.f1950a;
        nVar.writeValue(mVar, (java.lang.String) eVar.f8409b);
        nVar.writeValue(mVar, eVar.f8410c);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // a1.l
    public final java.nio.ByteBuffer f(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        a1.m mVar = new a1.m();
        mVar.write(1);
        a1.n nVar = this.f1950a;
        nVar.writeValue(mVar, str);
        nVar.writeValue(mVar, str2);
        if (obj instanceof java.lang.Throwable) {
            nVar.writeValue(mVar, android.util.Log.getStackTraceString((java.lang.Throwable) obj));
        } else {
            nVar.writeValue(mVar, obj);
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }
}
