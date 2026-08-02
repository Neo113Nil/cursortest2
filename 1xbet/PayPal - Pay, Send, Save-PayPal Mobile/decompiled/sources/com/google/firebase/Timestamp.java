package com.google.firebase;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001+B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "", "seconds", "", "nanoseconds", "<init>", "(JI)V", "Ljava/util/Date;", "date", "(Ljava/util/Date;)V", "Ljava/time/Instant;", "time", "(Ljava/time/Instant;)V", "toDate", "()Ljava/util/Date;", "toInstant", "()Ljava/time/Instant;", "other", "compareTo", "(Lcom/google/firebase/Timestamp;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getSeconds", "()J", com.visa.cbp.getEncExpo.warmup, "getNanoseconds", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Timestamp implements java.lang.Comparable<com.google.firebase.Timestamp>, android.os.Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.Timestamp.Companion INSTANCE = new com.google.firebase.Timestamp.Companion(null);
    public static final android.os.Parcelable.Creator<com.google.firebase.Timestamp> CREATOR = new android.os.Parcelable.Creator<com.google.firebase.Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.google.firebase.Timestamp createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.google.firebase.Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.google.firebase.Timestamp[] newArray(int size) {
            return new com.google.firebase.Timestamp[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public Timestamp(long j, int i) {
        INSTANCE.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    public Timestamp(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        com.google.firebase.Timestamp.Companion companion = INSTANCE;
        kotlin.Pair preciseTime = companion.toPreciseTime(date);
        long longValue = ((java.lang.Number) preciseTime.component1()).longValue();
        int intValue = ((java.lang.Number) preciseTime.component2()).intValue();
        companion.validateRange(longValue, intValue);
        this.seconds = longValue;
        this.nanoseconds = intValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(java.time.Instant instant) {
        this(instant.getEpochSecond(), instant.getNano());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
    }

    public final java.util.Date toDate() {
        return new java.util.Date((this.seconds * 1000) + (this.nanoseconds / 1000000));
    }

    public final java.time.Instant toInstant() {
        java.time.Instant ofEpochSecond = java.time.Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "");
        return ofEpochSecond;
    }

    @Override // java.lang.Comparable
    public final int compareTo(com.google.firebase.Timestamp other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return kotlin.comparisons.ComparisonsKt.compareValuesBy(this, other, new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.google.firebase.Timestamp$compareTo$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Long.valueOf(((com.google.firebase.Timestamp) obj).getSeconds());
            }
        }, new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.google.firebase.Timestamp$compareTo$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((com.google.firebase.Timestamp) obj).getNanoseconds());
            }
        });
    }

    public final boolean equals(java.lang.Object other) {
        if (other != this) {
            return (other instanceof com.google.firebase.Timestamp) && compareTo((com.google.firebase.Timestamp) other) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Timestamp(seconds=");
        sb.append(this.seconds);
        sb.append(", nanoseconds=");
        sb.append(this.nanoseconds);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "<init>", "()V", "Lcom/google/firebase/Timestamp;", "now", "()Lcom/google/firebase/Timestamp;", "Ljava/util/Date;", "Lkotlin/Pair;", "", "", "toPreciseTime", "(Ljava/util/Date;)Lkotlin/Pair;", "seconds", "nanoseconds", "", "validateRange", "(JI)V", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.google.firebase.Timestamp now() {
            return new com.google.firebase.Timestamp(new java.util.Date());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.Pair<java.lang.Long, java.lang.Integer> toPreciseTime(java.util.Date date) {
            long time = date.getTime() / 1000;
            int time2 = (int) ((date.getTime() % 1000) * 1000000);
            if (time2 < 0) {
                return kotlin.TuplesKt.to(java.lang.Long.valueOf(time - 1), java.lang.Integer.valueOf(time2 + 1000000000));
            }
            return kotlin.TuplesKt.to(java.lang.Long.valueOf(time), java.lang.Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                throw new java.lang.IllegalArgumentException("Timestamp nanoseconds out of range: ".concat(java.lang.String.valueOf(nanoseconds)).toString());
            }
            if (-62135596800L > seconds || seconds >= 253402300800L) {
                throw new java.lang.IllegalArgumentException("Timestamp seconds out of range: ".concat(java.lang.String.valueOf(seconds)).toString());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.firebase.Timestamp now() {
        return INSTANCE.now();
    }
}
