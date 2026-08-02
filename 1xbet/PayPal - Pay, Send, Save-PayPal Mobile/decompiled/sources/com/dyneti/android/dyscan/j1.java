package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3314a = new java.util.HashMap();
    public final int[] b = new int[326880];
    public final org.tensorflow.lite.Interpreter.Options c;
    public java.nio.ByteBuffer d;
    public org.tensorflow.lite.Interpreter e;
    public final java.lang.String[] f;
    public java.nio.ByteBuffer g;
    public final com.dyneti.android.dyscan.l2 h;
    public final com.dyneti.android.dyscan.t1 i;

    public j1(android.content.Context context, java.nio.ByteBuffer byteBuffer, com.dyneti.android.dyscan.l2 l2Var, com.dyneti.android.dyscan.t1 t1Var) {
        org.tensorflow.lite.Interpreter.Options options = new org.tensorflow.lite.Interpreter.Options();
        this.c = options;
        this.d = byteBuffer;
        this.e = new org.tensorflow.lite.Interpreter(this.d, options);
        android.content.res.Resources resources = context.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(resources.getAssets().open("dyscan_labels.txt")));
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                this.f = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
                this.h = l2Var;
                this.i = t1Var;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(980640);
                this.g = allocateDirect;
                allocateDirect.order(java.nio.ByteOrder.nativeOrder());
                return;
            }
            arrayList.add(readLine);
        }
    }
}
