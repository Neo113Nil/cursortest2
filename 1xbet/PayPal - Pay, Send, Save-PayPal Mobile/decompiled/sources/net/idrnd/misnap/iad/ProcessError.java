package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError;", "", "CaptureCoreClosed", "ImageSizeInvalid", "ImageTimestampInvalid", "JpegEncodingFailed", "Nv21IsNull", "UnknownError", "Lnet/idrnd/misnap/iad/ProcessError$CaptureCoreClosed;", "Lnet/idrnd/misnap/iad/ProcessError$ImageSizeInvalid;", "Lnet/idrnd/misnap/iad/ProcessError$ImageTimestampInvalid;", "Lnet/idrnd/misnap/iad/ProcessError$JpegEncodingFailed;", "Lnet/idrnd/misnap/iad/ProcessError$Nv21IsNull;", "Lnet/idrnd/misnap/iad/ProcessError$UnknownError;"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public abstract class ProcessError {
    public /* synthetic */ ProcessError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ProcessError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError$CaptureCoreClosed;", "Lnet/idrnd/misnap/iad/ProcessError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class CaptureCoreClosed extends net.idrnd.misnap.iad.ProcessError {
        public static final net.idrnd.misnap.iad.ProcessError.CaptureCoreClosed INSTANCE = new net.idrnd.misnap.iad.ProcessError.CaptureCoreClosed();

        public CaptureCoreClosed() {
            super(null);
        }

        public final int hashCode() {
            return 2065418004;
        }

        public final java.lang.String toString() {
            return "CaptureCoreClosed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof net.idrnd.misnap.iad.ProcessError.CaptureCoreClosed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError$ImageSizeInvalid;", "Lnet/idrnd/misnap/iad/ProcessError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ImageSizeInvalid extends net.idrnd.misnap.iad.ProcessError {
        public static final net.idrnd.misnap.iad.ProcessError.ImageSizeInvalid INSTANCE = new net.idrnd.misnap.iad.ProcessError.ImageSizeInvalid();

        public ImageSizeInvalid() {
            super(null);
        }

        public final int hashCode() {
            return -561098568;
        }

        public final java.lang.String toString() {
            return "ImageSizeInvalid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof net.idrnd.misnap.iad.ProcessError.ImageSizeInvalid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError$ImageTimestampInvalid;", "Lnet/idrnd/misnap/iad/ProcessError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ImageTimestampInvalid extends net.idrnd.misnap.iad.ProcessError {
        public static final net.idrnd.misnap.iad.ProcessError.ImageTimestampInvalid INSTANCE = new net.idrnd.misnap.iad.ProcessError.ImageTimestampInvalid();

        public ImageTimestampInvalid() {
            super(null);
        }

        public final int hashCode() {
            return -178744513;
        }

        public final java.lang.String toString() {
            return "ImageTimestampInvalid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof net.idrnd.misnap.iad.ProcessError.ImageTimestampInvalid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError$JpegEncodingFailed;", "Lnet/idrnd/misnap/iad/ProcessError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class JpegEncodingFailed extends net.idrnd.misnap.iad.ProcessError {
        public static final net.idrnd.misnap.iad.ProcessError.JpegEncodingFailed INSTANCE = new net.idrnd.misnap.iad.ProcessError.JpegEncodingFailed();

        public JpegEncodingFailed() {
            super(null);
        }

        public final int hashCode() {
            return 1430792469;
        }

        public final java.lang.String toString() {
            return "JpegEncodingFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof net.idrnd.misnap.iad.ProcessError.JpegEncodingFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError$Nv21IsNull;", "Lnet/idrnd/misnap/iad/ProcessError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Nv21IsNull extends net.idrnd.misnap.iad.ProcessError {
        public static final net.idrnd.misnap.iad.ProcessError.Nv21IsNull INSTANCE = new net.idrnd.misnap.iad.ProcessError.Nv21IsNull();

        public Nv21IsNull() {
            super(null);
        }

        public final int hashCode() {
            return -948499755;
        }

        public final java.lang.String toString() {
            return "Nv21IsNull";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof net.idrnd.misnap.iad.ProcessError.Nv21IsNull)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessError$UnknownError;", "Lnet/idrnd/misnap/iad/ProcessError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class UnknownError extends net.idrnd.misnap.iad.ProcessError {
        public static final net.idrnd.misnap.iad.ProcessError.UnknownError INSTANCE = new net.idrnd.misnap.iad.ProcessError.UnknownError();

        public UnknownError() {
            super(null);
        }

        public final int hashCode() {
            return -2143462213;
        }

        public final java.lang.String toString() {
            return "UnknownError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof net.idrnd.misnap.iad.ProcessError.UnknownError)) {
                return false;
            }
            return true;
        }
    }
}
