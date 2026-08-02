package com.datadog.android.core.feature.event;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0012"}, d2 = {"Lcom/datadog/android/core/feature/event/JvmCrash;", "", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "getThreads", "()Ljava/util/List;", "threads", "", "getThrowable", "()Ljava/lang/Throwable;", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Rum", "Lcom/datadog/android/core/feature/event/JvmCrash$Rum;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JvmCrash {
    public abstract java.lang.String getMessage();

    public abstract java.util.List<com.datadog.android.core.feature.event.ThreadDump> getThreads();

    public abstract java.lang.Throwable getThrowable();

    private JvmCrash() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/datadog/android/core/feature/event/JvmCrash$Rum;", "Lcom/datadog/android/core/feature/event/JvmCrash;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "message", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/Throwable;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;)Lcom/datadog/android/core/feature/event/JvmCrash$Rum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getThreads", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Rum extends com.datadog.android.core.feature.event.JvmCrash {
        private final java.lang.String message;
        private final java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads;
        private final java.lang.Throwable throwable;

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public final java.util.List<com.datadog.android.core.feature.event.ThreadDump> getThreads() {
            return this.threads;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rum(java.lang.Throwable th, java.lang.String str, java.util.List<com.datadog.android.core.feature.event.ThreadDump> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.throwable = th;
            this.message = str;
            this.threads = list;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.String str = this.message;
            java.util.List<com.datadog.android.core.feature.event.ThreadDump> list = this.threads;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rum(throwable=");
            sb.append(th);
            sb.append(", message=");
            sb.append(str);
            sb.append(", threads=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.throwable.hashCode() * 31) + this.message.hashCode()) * 31) + this.threads.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.core.feature.event.JvmCrash.Rum)) {
                return false;
            }
            com.datadog.android.core.feature.event.JvmCrash.Rum rum = (com.datadog.android.core.feature.event.JvmCrash.Rum) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, rum.throwable) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, rum.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.threads, rum.threads);
        }

        public final com.datadog.android.core.feature.event.JvmCrash.Rum copy(java.lang.Throwable throwable, java.lang.String message, java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            return new com.datadog.android.core.feature.event.JvmCrash.Rum(throwable, message, threads);
        }

        public final java.util.List<com.datadog.android.core.feature.event.ThreadDump> component3() {
            return this.threads;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.core.feature.event.JvmCrash.Rum copy$default(com.datadog.android.core.feature.event.JvmCrash.Rum rum, java.lang.Throwable th, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = rum.throwable;
            }
            if ((i & 2) != 0) {
                str = rum.message;
            }
            if ((i & 4) != 0) {
                list = rum.threads;
            }
            return rum.copy(th, str, list);
        }
    }

    public /* synthetic */ JvmCrash(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
