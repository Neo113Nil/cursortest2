package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\t\u001aa\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aa\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0017\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 \u001aE\u0010!\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0017\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001e\u001ay\u0010'\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0018\b\u0003\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00020\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010$\u001a\u00028\u00032\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u00028\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001ay\u0010)\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0018\b\u0003\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010$\u001a\u00028\u00032\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u00028\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010(\u001aI\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b+\u0010,\u001aG\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060-¢\u0006\u0004\b+\u0010.\u001aG\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060/¢\u0006\u0004\b+\u00100\u001ac\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u00028\u00020%H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ac\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u00028\u00020%H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00102\u001aQ\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002040%H\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00102\u001aQ\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002040%H\u0086\bø\u0001\u0000¢\u0006\u0004\b7\u00102\u001as\u00108\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010$\u001a\u00028\u00022\u001e\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u0002040%H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010(\u001a]\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u0002040%H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u00102\u001as\u0010:\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010$\u001a\u00028\u00022\u001e\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u0002040%H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010(\u001a]\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u0002040%H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u00102\u001a;\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060-¢\u0006\u0004\b<\u0010=\u001aS\u0010<\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060-2\u0006\u0010$\u001a\u00028\u0002H\u0007¢\u0006\u0004\b<\u0010>\u001a=\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b<\u0010\t\u001aU\u0010<\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010$\u001a\u00028\u0002H\u0007¢\u0006\u0004\b<\u0010?\u001a;\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060/¢\u0006\u0004\b<\u0010@\u001aS\u0010<\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060/2\u0006\u0010$\u001a\u00028\u0002H\u0007¢\u0006\u0004\b<\u0010A\u001a7\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b<\u0010B\u001a7\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\bC\u0010B\u001aO\u0010<\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010#*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010$\u001a\u00028\u0002H\u0007¢\u0006\u0004\b<\u0010D\u001aN\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\bF\u0010G\u001aT\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060-H\u0086\u0002¢\u0006\u0004\bF\u0010H\u001aV\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0086\u0002¢\u0006\u0004\bF\u0010I\u001aT\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060/H\u0086\u0002¢\u0006\u0004\bF\u0010J\u001aP\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010K\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002¢\u0006\u0004\bF\u0010D\u001aB\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bL\u0010M\u001aH\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0086\u0002¢\u0006\u0004\bL\u0010H\u001aJ\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\bL\u0010O\u001aH\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0086\u0002¢\u0006\u0004\bL\u0010J\u001a7\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\bP\u0010B\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "V", "", "emptyMap", "()Ljava/util/Map;", "", "Lkotlin/Pair;", "pairs", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "", "mutableMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "hashMapOf", "([Lkotlin/Pair;)Ljava/util/HashMap;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "linkedMapOf", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "", "copy", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "mapEntryOf", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlin/Function0;", "defaultValue", "getOrElseNullable", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrPut", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "M", "destination", "Lkotlin/Function1;", "transform", "mapValuesTo", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "mapKeysTo", "", "putAll", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Ljava/util/Map;Lkotlin/sequences/Sequence;)V", "mapValues", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "mapKeys", "", "predicate", "filterKeys", "filterValues", "filterTo", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "filterNotTo", "filterNot", "toMap", "(Ljava/lang/Iterable;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "pair", "plus", "(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;", "(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "(Ljava/util/Map;Lkotlin/sequences/Sequence;)Ljava/util/Map;", "map", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "optimizeReadOnlyMap"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
public class MapsKt__MapsKt extends kotlin.collections.MapsKt__MapsJVMKt {
    public static final <K, V> java.util.Map<K, V> emptyMap() {
        kotlin.collections.EmptyMap emptyMap = kotlin.collections.EmptyMap.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(emptyMap, "");
        return emptyMap;
    }

    public static final <K, V> java.util.Map<K, V> mapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        return pairArr.length > 0 ? kotlin.collections.MapsKt.toMap(pairArr, new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(pairArr.length))) : kotlin.collections.MapsKt.emptyMap();
    }

    public static final <K, V> java.util.Map<K, V> mutableMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(pairArr.length));
        kotlin.collections.MapsKt.putAll(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final <K, V> java.util.HashMap<K, V> hashMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.HashMap<K, V> hashMap = new java.util.HashMap<>(kotlin.collections.MapsKt.mapCapacity(pairArr.length));
        kotlin.collections.MapsKt.putAll(hashMap, pairArr);
        return hashMap;
    }

    public static final <K, V> java.util.LinkedHashMap<K, V> linkedMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        return (java.util.LinkedHashMap) kotlin.collections.MapsKt.toMap(pairArr, new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(pairArr.length)));
    }

    public static final <K, V> java.util.Map.Entry<K, V> copy(java.util.Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        kotlin.collections.DetachedMapEntry detachedMapEntry = entry instanceof kotlin.collections.DetachedMapEntry ? (kotlin.collections.DetachedMapEntry) entry : null;
        return detachedMapEntry != null ? detachedMapEntry : kotlin.collections.MapsKt.mapEntryOf(entry.getKey(), entry.getValue());
    }

    public static final <K, V> java.util.Map.Entry<K, V> mapEntryOf(K k, V v) {
        return new kotlin.collections.DetachedMapEntry(k, v);
    }

    public static final <K, V> V getOrElseNullable(java.util.Map<K, ? extends V> map, K k, kotlin.jvm.functions.Function0<? extends V> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : function0.invoke();
    }

    public static final <K, V> V getValue(java.util.Map<K, ? extends V> map, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return (V) kotlin.collections.MapsKt.getOrImplicitDefaultNullable(map, k);
    }

    public static final <K, V> V getOrPut(java.util.Map<K, V> map, K k, kotlin.jvm.functions.Function0<? extends V> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V invoke = function0.invoke();
        map.put(k, invoke);
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.IgnorableReturnValue
    public static final <K, V, R, M extends java.util.Map<? super K, ? super R>> M mapValuesTo(java.util.Map<? extends K, ? extends V> map, M m, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.lang.Object) it.next();
            m.put(entry.getKey(), function1.invoke(entry));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.IgnorableReturnValue
    public static final <K, V, R, M extends java.util.Map<? super R, ? super V>> M mapKeysTo(java.util.Map<? extends K, ? extends V> map, M m, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.lang.Object) it.next();
            m.put(function1.invoke(entry), entry.getValue());
        }
        return m;
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> map, kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> map, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> map, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : sequence) {
            map.put(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> java.util.Map<K, R> mapValues(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.lang.Object) it.next();
            linkedHashMap.put(entry.getKey(), function1.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> java.util.Map<R, V> mapKeys(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.lang.Object) it.next();
            linkedHashMap.put(function1.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> filterKeys(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super K, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> filterValues(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super V, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M filterTo(java.util.Map<? extends K, ? extends V> map, M m, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    public static final <K, V> java.util.Map<K, V> filter(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M filterNotTo(java.util.Map<? extends K, ? extends V> map, M m, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!function1.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    public static final <K, V> java.util.Map<K, V> filterNot(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!function1.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> toMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return kotlin.collections.MapsKt.emptyMap();
            }
            if (size != 1) {
                return kotlin.collections.MapsKt.toMap(iterable, new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(collection.size())));
            }
            return kotlin.collections.MapsKt.mapOf((kotlin.Pair) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next()));
        }
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(kotlin.collections.MapsKt.toMap(iterable, new java.util.LinkedHashMap()));
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable, M m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.collections.MapsKt.putAll(m, iterable);
        return m;
    }

    public static final <K, V> java.util.Map<K, V> toMap(kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        int length = pairArr.length;
        if (length == 0) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        if (length == 1) {
            return kotlin.collections.MapsKt.mapOf(pairArr[0]);
        }
        return kotlin.collections.MapsKt.toMap(pairArr, new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(pairArr.length)));
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(kotlin.Pair<? extends K, ? extends V>[] pairArr, M m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.collections.MapsKt.putAll(m, pairArr);
        return m;
    }

    public static final <K, V> java.util.Map<K, V> toMap(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(kotlin.collections.MapsKt.toMap(sequence, new java.util.LinkedHashMap()));
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence, M m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.collections.MapsKt.putAll(m, sequence);
        return m;
    }

    public static final <K, V> java.util.Map<K, V> toMap(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        int size = map.size();
        if (size == 0) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        if (size == 1) {
            return kotlin.collections.MapsKt.toSingletonMap(map);
        }
        return kotlin.collections.MapsKt.toMutableMap(map);
    }

    public static final <K, V> java.util.Map<K, V> toMutableMap(java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return new java.util.LinkedHashMap(map);
    }

    @kotlin.IgnorableReturnValue
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(java.util.Map<? extends K, ? extends V> map, M m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        m.putAll(map);
        return m;
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> map, kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        if (map.isEmpty()) {
            return kotlin.collections.MapsKt.mapOf(pair);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> map, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        if (map.isEmpty()) {
            return kotlin.collections.MapsKt.toMap(iterable);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        kotlin.collections.MapsKt.putAll(linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> map, kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        if (map.isEmpty()) {
            return kotlin.collections.MapsKt.toMap(pairArr);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        kotlin.collections.MapsKt.putAll(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> map, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        kotlin.collections.MapsKt.putAll(linkedHashMap, sequence);
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(linkedHashMap);
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> map, java.util.Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> map, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        mutableMap.remove(k);
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> map, java.lang.Iterable<? extends K> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        kotlin.collections.CollectionsKt.removeAll(mutableMap.keySet(), iterable);
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> map, K[] kArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kArr, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        kotlin.collections.CollectionsKt.removeAll(mutableMap.keySet(), kArr);
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> map, kotlin.sequences.Sequence<? extends K> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        kotlin.collections.CollectionsKt.removeAll(mutableMap.keySet(), sequence);
        return kotlin.collections.MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<K, V> optimizeReadOnlyMap(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : kotlin.collections.MapsKt.toSingletonMap(map);
        }
        return kotlin.collections.MapsKt.emptyMap();
    }
}
