package androidx.test.internal.util;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import defpackage.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes3.dex */
public final class ProcSummary {
    public final String cmdline;
    public final String name;
    public final String parent;
    public final String pid;
    public final String realUid;
    public final long startTime;

    @VisibleForTesting
    public static class Builder {
        private String cmdline;
        private String name;
        private String parent;
        private String pid;
        private String realUid;
        private long startTime;

        public ProcSummary build() {
            return new ProcSummary(this);
        }

        public Builder withCmdline(String str) {
            this.cmdline = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withParent(String str) {
            try {
                Integer.parseInt(str);
                this.parent = str;
                return this;
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(g.a("not a pid: ", str));
            }
        }

        public Builder withPid(String str) {
            try {
                Integer.parseInt(str);
                this.pid = str;
                return this;
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(g.a("not a pid: ", str));
            }
        }

        public Builder withRealUid(String str) {
            try {
                Integer.parseInt(str);
                this.realUid = str;
                return this;
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(g.a("not a uid: ", str));
            }
        }

        public Builder withStartTime(long j) {
            this.startTime = j;
            return this;
        }
    }

    public static class SummaryException extends RuntimeException {
        public SummaryException(String str, Throwable th) {
            super(str, th);
        }

        public SummaryException(String str) {
            super(str);
        }
    }

    @VisibleForTesting
    public static ProcSummary parse(String str, String str2, String str3) {
        String[] split = str.substring(str.lastIndexOf(41) + 2).split(" ", -1);
        String substring = str2.substring(str2.indexOf("\nUid:") + 1);
        return new Builder().withPid(str.substring(0, str.indexOf(32))).withName(str.substring(str.indexOf(40) + 1, str.lastIndexOf(41))).withParent(split[1]).withRealUid(substring.substring(0, substring.indexOf(10)).split("\\s", -1)[1]).withCmdline(str3.trim().replace((char) 0, ' ')).withStartTime(Long.parseLong(split[19])).build();
    }

    private static final String readToString(File file) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[1024];
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(file));
                while (true) {
                    try {
                        int read = inputStreamReader2.read(cArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        throw new SummaryException("Could not read: " + String.valueOf(file), e);
                    } catch (RuntimeException e2) {
                        e = e2;
                        throw new SummaryException("Error reading: " + String.valueOf(file), e);
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                }
                String sb2 = sb.toString();
                try {
                    inputStreamReader2.close();
                } catch (IOException unused2) {
                }
                return sb2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    public static ProcSummary summarize(String str) {
        return parse(readToString(new File(new File("/proc", str), "stat")), readToString(new File(new File("/proc", str), NotificationCompat.CATEGORY_STATUS)), readToString(new File(new File("/proc", str), "cmdline")));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ProcSummary)) {
            return false;
        }
        ProcSummary procSummary = (ProcSummary) obj;
        return procSummary.name.equals(this.name) && procSummary.pid.equals(this.pid) && procSummary.parent.equals(this.parent) && procSummary.realUid.equals(this.realUid) && procSummary.cmdline.equals(this.cmdline) && procSummary.startTime == this.startTime;
    }

    public int hashCode() {
        return this.pid.hashCode();
    }

    public String toString() {
        return String.format("ProcSummary(name: '%s', cmdline: '%s', pid: '%s', parent: '%s', realUid: '%s', startTime: %d)", this.name, this.cmdline, this.pid, this.parent, this.realUid, Long.valueOf(this.startTime));
    }

    private ProcSummary(Builder builder) {
        this.name = (String) Checks.checkNotNull(builder.name);
        this.pid = (String) Checks.checkNotNull(builder.pid);
        this.realUid = (String) Checks.checkNotNull(builder.realUid);
        this.parent = (String) Checks.checkNotNull(builder.parent);
        this.cmdline = (String) Checks.checkNotNull(builder.cmdline);
        this.startTime = builder.startTime;
    }
}
