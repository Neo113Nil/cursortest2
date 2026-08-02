package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/controller/a/s;", "", "<init>", "()V", "a", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/controller/a/s$a;", "Lcom/miteksystems/misnap/controller/a/s$b;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public abstract class s {
    public /* synthetic */ s(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/miteksystems/misnap/controller/a/s$a;", "Lcom/miteksystems/misnap/controller/a/s;", "Lcom/miteksystems/misnap/controller/a/r;", "error", "<init>", "(Lcom/miteksystems/misnap/controller/a/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/miteksystems/misnap/controller/a/r;", "()Lcom/miteksystems/misnap/controller/a/r;"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a extends com.miteksystems.misnap.controller.a.s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.miteksystems.misnap.controller.a.r error;

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
            sb.append(this.error);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.miteksystems.misnap.controller.a.s.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.miteksystems.misnap.controller.a.s.a) other).error);
        }

        /* renamed from: a, reason: from getter */
        public final com.miteksystems.misnap.controller.a.r getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.miteksystems.misnap.controller.a.r rVar) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "");
            this.error = rVar;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/miteksystems/misnap/controller/a/s$b;", "Lcom/miteksystems/misnap/controller/a/s;", "", "payload", "<init>", "([B)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "()[B"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b extends com.miteksystems.misnap.controller.a.s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] payload;

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(payload=");
            sb.append(java.util.Arrays.toString(this.payload));
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.util.Arrays.hashCode(this.payload);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.miteksystems.misnap.controller.a.s.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, ((com.miteksystems.misnap.controller.a.s.b) other).payload);
        }

        /* renamed from: a, reason: from getter */
        public final byte[] getPayload() {
            return this.payload;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.payload = bArr;
        }
    }

    private s() {
    }
}
