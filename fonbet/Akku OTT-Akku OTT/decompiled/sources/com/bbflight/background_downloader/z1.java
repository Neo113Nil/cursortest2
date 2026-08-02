package com.bbflight.background_downloader;

import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;

@DebugMetadata(c = "com.bbflight.background_downloader.UploadTaskWorker$processMultipartUpload$2", f = "UploadTaskWorker.kt", i = {0, 0, 0, 0, 0, 0}, l = {326}, m = "invokeSuspend", n = {"outputStream", "writer", "inputStream", "$i$a$-use-UploadTaskWorker$processMultipartUpload$2$1", "i", "$i$a$-use-UploadTaskWorker$processMultipartUpload$2$1$1"}, nl = {325}, s = {"L$7", "L$8", "L$10", "I$0", "I$1", "I$3"}, v = 2)
/* loaded from: classes3.dex */
public final class z1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super W0>, Object> {
    public Closeable a;
    public List b;
    public ArrayList c;
    public ArrayList d;
    public UploadTaskWorker e;
    public String f;
    public String i;
    public DataOutputStream j;
    public OutputStreamWriter k;
    public FileInputStream l;
    public Object m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final /* synthetic */ HttpURLConnection s;
    public final /* synthetic */ Ref.ObjectRef<String> t;
    public final /* synthetic */ List<Triple<String, String, String>> u;
    public final /* synthetic */ ArrayList<String> v;
    public final /* synthetic */ ArrayList<String> w;
    public final /* synthetic */ UploadTaskWorker x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(HttpURLConnection httpURLConnection, Ref.ObjectRef objectRef, List list, ArrayList arrayList, ArrayList arrayList2, UploadTaskWorker uploadTaskWorker, long j, Continuation continuation) {
        super(2, continuation);
        this.s = httpURLConnection;
        this.t = objectRef;
        this.u = list;
        this.v = arrayList;
        this.w = arrayList2;
        this.x = uploadTaskWorker;
        this.y = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new z1(this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super W0> continuation) {
        return ((z1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0126 A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:9:0x011e, B:11:0x0126, B:13:0x0130, B:60:0x0139), top: B:8:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #1 {all -> 0x0151, blocks: (B:16:0x013d, B:19:0x00a0, B:41:0x0169, B:42:0x016c, B:49:0x016d, B:61:0x0154, B:38:0x0167), top: B:15:0x013d, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #1 {all -> 0x0151, blocks: (B:16:0x013d, B:19:0x00a0, B:41:0x0169, B:42:0x016c, B:49:0x016d, B:61:0x0154, B:38:0x0167), top: B:15:0x013d, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0114 -> B:8:0x011e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DataOutputStream dataOutputStream;
        OutputStreamWriter outputStreamWriter;
        String str;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        int i;
        UploadTaskWorker uploadTaskWorker;
        int i2;
        long j;
        int i3;
        String str2;
        List<Triple<String, String, String>> list;
        DataOutputStream dataOutputStream2;
        Throwable th;
        Throwable th2;
        Throwable th3;
        FileInputStream fileInputStream;
        int i4;
        FileInputStream fileInputStream2;
        String str3;
        ArrayList<String> arrayList3;
        z1 z1Var = this;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = z1Var.r;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            DataOutputStream dataOutputStream3 = new DataOutputStream(z1Var.s.getOutputStream());
            Ref.ObjectRef<String> objectRef = z1Var.t;
            List<Triple<String, String, String>> list2 = z1Var.u;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(dataOutputStream3, Charsets.UTF_8);
                outputStreamWriter2.append((CharSequence) objectRef.element).append((CharSequence) "-------background_downloader-akjhfw281onqciyhnIk").append((CharSequence) "\r\n");
                int size = list2.size();
                ArrayList<String> arrayList4 = z1Var.v;
                outputStreamWriter = outputStreamWriter2;
                str = "\r\n-------background_downloader-akjhfw281onqciyhnIk--\r\n";
                arrayList = arrayList4;
                arrayList2 = z1Var.w;
                i = size;
                uploadTaskWorker = z1Var.x;
                i2 = 0;
                j = z1Var.y;
                dataOutputStream = dataOutputStream3;
                i3 = 0;
                str2 = "\r\n-------background_downloader-akjhfw281onqciyhnIk\r\n";
                list = list2;
                dataOutputStream2 = dataOutputStream;
                if (i2 < i) {
                }
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = dataOutputStream3;
                th = th;
                throw th;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = z1Var.q;
            int i7 = z1Var.p;
            int i8 = z1Var.o;
            j = z1Var.n;
            FileInputStream fileInputStream3 = z1Var.l;
            OutputStreamWriter outputStreamWriter3 = z1Var.k;
            DataOutputStream dataOutputStream4 = z1Var.j;
            String str4 = z1Var.i;
            String str5 = z1Var.f;
            UploadTaskWorker uploadTaskWorker2 = z1Var.e;
            ArrayList<String> arrayList5 = z1Var.d;
            ArrayList<String> arrayList6 = z1Var.c;
            List<Triple<String, String, String>> list3 = z1Var.b;
            ?? r1 = z1Var.a;
            try {
                ResultKt.throwOnFailure(obj);
                i = i6;
                String str6 = str4;
                list = list3;
                i3 = i8;
                dataOutputStream2 = dataOutputStream4;
                Object obj2 = coroutine_suspended;
                FileInputStream fileInputStream4 = fileInputStream3;
                Object p = obj;
                UploadTaskWorker uploadTaskWorker3 = uploadTaskWorker2;
                outputStreamWriter = outputStreamWriter3;
                dataOutputStream = r1;
                int i9 = i7;
                try {
                    W0 w0 = (W0) p;
                    DataOutputStream dataOutputStream5 = dataOutputStream2;
                    if (w0 != W0.d) {
                        CloseableKt.closeFinally(fileInputStream4, null);
                        CloseableKt.closeFinally(dataOutputStream, null);
                        return w0;
                    }
                    try {
                        if (i9 < list.size() - 1) {
                            outputStreamWriter.append((CharSequence) str5);
                        } else {
                            outputStreamWriter.append((CharSequence) str6);
                        }
                        CloseableKt.closeFinally(fileInputStream4, null);
                        ArrayList<String> arrayList7 = arrayList6;
                        i2 = i9 + 1;
                        str2 = str5;
                        arrayList = arrayList7;
                        coroutine_suspended = obj2;
                        arrayList2 = arrayList5;
                        dataOutputStream2 = dataOutputStream5;
                        z1Var = this;
                        str = str6;
                        uploadTaskWorker = uploadTaskWorker3;
                        if (i2 < i) {
                            outputStreamWriter.close();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(dataOutputStream, null);
                            return W0.d;
                        }
                        try {
                            try {
                                try {
                                    Object obj3 = coroutine_suspended;
                                    int i10 = i2;
                                    outputStreamWriter.append((CharSequence) arrayList.get(i2)).append((CharSequence) arrayList2.get(i2)).flush();
                                    M0 k = uploadTaskWorker.k();
                                    z1Var.a = dataOutputStream;
                                    z1Var.b = list;
                                    z1Var.c = arrayList;
                                    z1Var.d = arrayList2;
                                    z1Var.e = uploadTaskWorker;
                                    z1Var.f = str2;
                                    z1Var.i = str;
                                    z1Var.j = dataOutputStream2;
                                    z1Var.k = outputStreamWriter;
                                    z1Var.l = fileInputStream;
                                    z1Var.m = SpillingKt.nullOutSpilledVariable(fileInputStream);
                                    z1Var.n = j;
                                    z1Var.o = i3;
                                    z1Var.p = i10;
                                    z1Var.q = i4;
                                    UploadTaskWorker uploadTaskWorker4 = uploadTaskWorker;
                                    z1Var.r = 1;
                                    p = uploadTaskWorker4.p(fileInputStream2, dataOutputStream2, j, k, z1Var);
                                    obj2 = obj3;
                                    if (p == obj2) {
                                        return obj2;
                                    }
                                    uploadTaskWorker3 = uploadTaskWorker4;
                                    str6 = str;
                                    arrayList5 = arrayList3;
                                    i = i4;
                                    fileInputStream4 = fileInputStream2;
                                    i9 = i10;
                                    arrayList6 = arrayList;
                                    str5 = str3;
                                    W0 w02 = (W0) p;
                                    DataOutputStream dataOutputStream52 = dataOutputStream2;
                                    if (w02 != W0.d) {
                                    }
                                } catch (Throwable th5) {
                                    th3 = th5;
                                    fileInputStream2 = fileInputStream;
                                }
                            } catch (Throwable th6) {
                                th3 = th6;
                                fileInputStream2 = fileInputStream;
                            }
                            i4 = i;
                            fileInputStream = new FileInputStream(list.get(i2).getSecond());
                        } catch (Throwable th7) {
                            th3 = th7;
                            fileInputStream3 = fileInputStream2;
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th8) {
                                CloseableKt.closeFinally(fileInputStream3, th2);
                                throw th8;
                            }
                        }
                        str3 = str2;
                        fileInputStream2 = fileInputStream;
                        arrayList3 = arrayList2;
                    } catch (Throwable th9) {
                        th = th9;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th10) {
                            CloseableKt.closeFinally(dataOutputStream, th);
                            throw th10;
                        }
                    }
                } catch (Throwable th11) {
                    th2 = th11;
                    fileInputStream3 = fileInputStream4;
                    throw th2;
                }
            } catch (Throwable th12) {
                th3 = th12;
                dataOutputStream = r1;
                th2 = th3;
                throw th2;
            }
        }
    }
}
