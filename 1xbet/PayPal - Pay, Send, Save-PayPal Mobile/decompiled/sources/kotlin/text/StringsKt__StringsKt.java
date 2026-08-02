package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0019\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0005\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a+\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a+\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a+\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\r\u001a\u001d\u0010\u0005\u001a\u00020\u0007*\u00020\u00072\n\u0010\f\u001a\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\t\u0010\r\u001a\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00072\n\u0010\f\u001a\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\t\u0010\u000e\u001a\u001d\u0010\n\u001a\u00020\u0000*\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\n\u0010\r\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00072\n\u0010\f\u001a\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\n\u0010\u000e\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u000f\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u000f\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a#\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001a\u001a\u00020\u0019*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001d\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010!\u001a\u00020\u0007*\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010!\u001a\u00020\u0007*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010%\u001a#\u0010(\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)\u001a#\u0010(\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010*\u001a#\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b+\u0010)\u001a#\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b+\u0010*\u001a#\u0010,\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b,\u0010)\u001a#\u0010,\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b,\u0010*\u001a#\u0010-\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b-\u0010)\u001a#\u0010-\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b-\u0010*\u001a)\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0000¢\u0006\u0004\b1\u00102\u001a!\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0000¢\u0006\u0004\b1\u00103\u001a!\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0010¢\u0006\u0004\b4\u00105\u001a\u0019\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b4\u0010$\u001a\u0019\u00107\u001a\u00020\u0000*\u00020\u00002\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00108\u001a\u0019\u00107\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00109\u001a\u0019\u0010;\u001a\u00020\u0000*\u00020\u00002\u0006\u0010:\u001a\u00020\u0000¢\u0006\u0004\b;\u00108\u001a\u0019\u0010;\u001a\u00020\u0007*\u00020\u00072\u0006\u0010:\u001a\u00020\u0000¢\u0006\u0004\b;\u00109\u001a!\u0010<\u001a\u00020\u0000*\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000¢\u0006\u0004\b<\u0010=\u001a!\u0010<\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000¢\u0006\u0004\b<\u0010>\u001a\u0019\u0010<\u001a\u00020\u0000*\u00020\u00002\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b<\u00108\u001a\u0019\u0010<\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b<\u00109\u001a+\u0010?\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b?\u0010@\u001a+\u0010?\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b?\u0010A\u001a+\u0010B\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\bB\u0010@\u001a+\u0010B\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\bB\u0010A\u001a+\u0010C\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\bC\u0010A\u001a+\u0010C\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\bC\u0010@\u001a+\u0010D\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\bD\u0010@\u001a+\u0010D\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\bD\u0010A\u001a;\u0010I\u001a\u00020\u0003*\u00020\u00002\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0003H\u0000¢\u0006\u0004\bI\u0010J\u001a#\u0010L\u001a\u00020\u0003*\u00020\u00002\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bL\u0010M\u001a#\u0010N\u001a\u00020\u0003*\u00020\u00002\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bN\u0010M\u001a#\u0010L\u001a\u00020\u0003*\u00020\u00002\u0006\u00106\u001a\u00020\u00002\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bL\u0010O\u001a+\u0010L\u001a\u00020\u0003*\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bL\u0010P\u001a#\u0010N\u001a\u00020\u0003*\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bN\u0010O\u001a#\u0010Q\u001a\u00020\u0007*\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bQ\u0010R\u001a#\u0010S\u001a\u00020\u0007*\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bS\u0010R\u001a-\u0010T\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bT\u0010U\u001a-\u0010V\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bV\u0010U\u001a;\u0010\\\u001a\u00020\u0010*\u00020\u00002\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u0010]\u001aG\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010_*\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070^2\u0006\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u0003H\u0002¢\u0006\u0004\b`\u0010a\u001aA\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010_*\u00020\u00002\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070^2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bc\u0010d\u001aA\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010_*\u00020\u00002\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070^2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\be\u0010d\u001a3\u0010T\u001a\u00020\u0010*\u00020\u00002\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070^2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bT\u0010f\u001a3\u0010V\u001a\u00020\u0010*\u00020\u00002\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070^2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bV\u0010f\u001a-\u0010g\u001a\u00020\u0010*\u00020\u00002\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bg\u0010h\u001a-\u0010g\u001a\u00020\u0010*\u00020\u00002\u0006\u0010i\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bg\u0010j\u001a-\u0010k\u001a\u00020\u0010*\u00020\u00002\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bk\u0010h\u001a-\u0010k\u001a\u00020\u0010*\u00020\u00002\u0006\u0010i\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0003¢\u0006\u0004\bk\u0010j\u001a&\u0010l\u001a\u00020\u0003*\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\b\b\u0002\u0010H\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\bl\u0010O\u001a&\u0010l\u001a\u00020\u0003*\u00020\u00002\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010H\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\bl\u0010M\u001a\u0017\u0010o\u001a\u00020n2\u0006\u0010m\u001a\u00020\u0010H\u0000¢\u0006\u0004\bo\u0010p\u001a?\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070s*\u00020\u00002\u0012\u0010r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070q\"\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020\u0010¢\u0006\u0004\bt\u0010u\u001a?\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00070v*\u00020\u00002\u0012\u0010r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070q\"\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020\u0010¢\u0006\u0004\bw\u0010x\u001a7\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070s*\u00020\u00002\n\u0010r\u001a\u00020\u000b\"\u00020\u00022\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020\u0010¢\u0006\u0004\bt\u0010y\u001a7\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00070v*\u00020\u00002\n\u0010r\u001a\u00020\u000b\"\u00020\u00022\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020\u0010¢\u0006\u0004\bw\u0010z\u001a1\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00070v*\u00020\u00002\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u0010H\u0002¢\u0006\u0004\b{\u0010|\u001a\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00070s*\u00020\u0000¢\u0006\u0004\b}\u0010~\u001a\u0018\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00070v*\u00020\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\"\u0010\u0081\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010F\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\"\u0010\u0083\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010F\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001\u001a\u0014\u0010\u0084\u0001\u001a\u00020\u0003*\u00020\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003*\u00020\u0007¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a6\u0010\u0088\u0001\u001a\u00020\u0010*\u00020\u00072\u0006\u0010.\u001a\u00020\u00102\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0018\u0010\u008c\u0001\u001a\u00020\u001f*\u00020\u00008G¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0018\u0010\u008f\u0001\u001a\u00020\u0010*\u00020\u00008G¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "Lkotlin/Function1;", "", "", "predicate", "trim", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "trimStart", "trimEnd", "", "chars", "(Ljava/lang/CharSequence;[C)Ljava/lang/CharSequence;", "(Ljava/lang/String;[C)Ljava/lang/String;", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "padStart", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "(Ljava/lang/String;IC)Ljava/lang/String;", "padEnd", "isBlank", "(Ljava/lang/CharSequence;)Z", "Lkotlin/collections/CharIterator;", "iterator", "(Ljava/lang/CharSequence;)Lkotlin/collections/CharIterator;", "index", "hasSurrogatePairAt", "(Ljava/lang/CharSequence;I)Z", "Lkotlin/ranges/IntRange;", "range", "substring", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "subSequence", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "substringBefore", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "substringAfter", "substringBeforeLast", "substringAfterLast", "startIndex", "endIndex", "replacement", "replaceRange", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "removeRange", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "prefix", "removePrefix", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "removeSuffix", "removeSurrounding", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "replaceBefore", "(Ljava/lang/String;CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replaceAfter", "replaceAfterLast", "replaceBeforeLast", "thisOffset", "other", "otherOffset", "ignoreCase", "regionMatchesImpl", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "startsWith", "(Ljava/lang/CharSequence;CZ)Z", "endsWith", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)Z", "commonPrefixWith", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Ljava/lang/String;", "commonSuffixWith", "indexOfAny", "(Ljava/lang/CharSequence;[CIZ)I", "lastIndexOfAny", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoSizes", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "Lkotlin/Pair;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "strings", "findAnyOf", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)Lkotlin/Pair;", "findLastAnyOf", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)I", "indexOf", "(Ljava/lang/CharSequence;CIZ)I", "string", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "lastIndexOf", "contains", "limit", "", "requireNonNegativeLimit", "(I)V", "", "delimiters", "Lkotlin/sequences/Sequence;", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/Sequence;", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "Camera2StreamConfigurationMap", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "lineSequence", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "lines", "(Ljava/lang/CharSequence;)Ljava/util/List;", "contentEqualsIgnoreCaseImpl", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "contentEqualsImpl", "toBooleanStrict", "(Ljava/lang/String;)Z", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "skipWhile", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)I", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "(Ljava/lang/CharSequence;)I", "lastIndex"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends kotlin.text.StringsKt__StringsJVMKt {
    public static final java.lang.CharSequence trim(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = function1.invoke(java.lang.Character.valueOf(charSequence.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final java.lang.String trim(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String str2 = str;
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = function1.invoke(java.lang.Character.valueOf(str2.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return str2.subSequence(i, length + 1).toString();
    }

    public static final java.lang.CharSequence trimStart(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!function1.invoke(java.lang.Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final java.lang.String trimStart(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String str3 = str;
        int length = str3.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!function1.invoke(java.lang.Character.valueOf(str3.charAt(i))).booleanValue()) {
                    str2 = str3.subSequence(i, str3.length());
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return str2.toString();
    }

    public static final java.lang.CharSequence trimEnd(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!function1.invoke(java.lang.Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final java.lang.String trimEnd(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String str3 = str;
        int length = str3.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!function1.invoke(java.lang.Character.valueOf(str3.charAt(length))).booleanValue()) {
                    str2 = str3.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            return str2.toString();
        }
        return str2.toString();
    }

    public static /* synthetic */ java.lang.CharSequence padStart$default(java.lang.CharSequence charSequence, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padStart(charSequence, i, c);
    }

    public static final java.lang.CharSequence padStart(java.lang.CharSequence charSequence, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(i);
        int length = i - charSequence.length();
        if (length > 0) {
            int i2 = 1;
            while (true) {
                sb2.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static /* synthetic */ java.lang.String padStart$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padStart(str, i, c);
    }

    public static final java.lang.String padStart(java.lang.String str, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.padStart((java.lang.CharSequence) str, i, c).toString();
    }

    public static /* synthetic */ java.lang.CharSequence padEnd$default(java.lang.CharSequence charSequence, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padEnd(charSequence, i, c);
    }

    public static final java.lang.CharSequence padEnd(java.lang.CharSequence charSequence, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(i);
        sb2.append(charSequence);
        int length = i - charSequence.length();
        if (length > 0) {
            int i2 = 1;
            while (true) {
                sb2.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return sb2;
    }

    public static /* synthetic */ java.lang.String padEnd$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padEnd(str, i, c);
    }

    public static final java.lang.String padEnd(java.lang.String str, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.padEnd((java.lang.CharSequence) str, i, c).toString();
    }

    public static final kotlin.collections.CharIterator iterator(final java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return new kotlin.collections.CharIterator() { // from class: kotlin.text.StringsKt__StringsKt$iterator$1

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private int getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.collections.CharIterator
            public final char nextChar() {
                java.lang.CharSequence charSequence2 = charSequence;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                return charSequence2.charAt(i);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.getHighResolutionOutputSizeshNQ4ISI < charSequence.length();
            }
        };
    }

    public static final kotlin.ranges.IntRange getIndices(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return new kotlin.ranges.IntRange(0, charSequence.length() - 1);
    }

    public static final int getLastIndex(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return i >= 0 && i <= charSequence.length() + (-2) && java.lang.Character.isHighSurrogate(charSequence.charAt(i)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static final java.lang.String substring(java.lang.String str, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        java.lang.String substring = str.substring(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final java.lang.CharSequence subSequence(java.lang.CharSequence charSequence, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static final java.lang.String substring(java.lang.CharSequence charSequence, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringBefore(str, c, str2);
    }

    public static final java.lang.String substringBefore(java.lang.String str, char c, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return str2;
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringBefore(str, str2, str3);
    }

    public static final java.lang.String substringBefore(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringAfter(str, c, str2);
    }

    public static final java.lang.String substringAfter(java.lang.String str, char c, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return str2;
        }
        java.lang.String substring = str.substring(indexOf$default + 1, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringAfter(str, str2, str3);
    }

    public static final java.lang.String substringAfter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        java.lang.String substring = str.substring(indexOf$default + str2.length(), str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringBeforeLast$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringBeforeLast(str, c, str2);
    }

    public static final java.lang.String substringBeforeLast(java.lang.String str, char c, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (lastIndexOf$default == -1) {
            return str2;
        }
        java.lang.String substring = str.substring(0, lastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringBeforeLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringBeforeLast(str, str2, str3);
    }

    public static final java.lang.String substringBeforeLast(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        java.lang.String substring = str.substring(0, lastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringAfterLast(str, c, str2);
    }

    public static final java.lang.String substringAfterLast(java.lang.String str, char c, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (lastIndexOf$default == -1) {
            return str2;
        }
        java.lang.String substring = str.substring(lastIndexOf$default + 1, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringAfterLast(str, str2, str3);
    }

    public static final java.lang.String substringAfterLast(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        java.lang.String substring = str.substring(lastIndexOf$default + str2.length(), str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final java.lang.CharSequence replaceRange(java.lang.CharSequence charSequence, int i, int i2, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("End index (");
            sb.append(i2);
            sb.append(") is less than start index (");
            sb.append(i);
            sb.append(").");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(charSequence, 0, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append(charSequence2);
        sb2.append(charSequence, i2, charSequence.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "");
        return sb2;
    }

    public static final java.lang.CharSequence replaceRange(java.lang.CharSequence charSequence, kotlin.ranges.IntRange intRange, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        return kotlin.text.StringsKt.replaceRange(charSequence, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1, charSequence2);
    }

    public static final java.lang.CharSequence removeRange(java.lang.CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("End index (");
            sb.append(i2);
            sb.append(") is less than start index (");
            sb.append(i);
            sb.append(").");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(charSequence.length() - (i2 - i));
        sb2.append(charSequence, 0, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append(charSequence, i2, charSequence.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "");
        return sb2;
    }

    public static final java.lang.CharSequence removeRange(java.lang.CharSequence charSequence, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        return kotlin.text.StringsKt.removeRange(charSequence, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static final java.lang.CharSequence removePrefix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (kotlin.text.StringsKt.startsWith$default(charSequence, charSequence2, false, 2, (java.lang.Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String removePrefix(java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (!kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str, charSequence, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String substring = str.substring(charSequence.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final java.lang.CharSequence removeSuffix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (kotlin.text.StringsKt.endsWith$default(charSequence, charSequence2, false, 2, (java.lang.Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String removeSuffix(java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, charSequence, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String substring = str.substring(0, str.length() - charSequence.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final java.lang.CharSequence removeSurrounding(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        if (charSequence.length() >= charSequence2.length() + charSequence3.length() && kotlin.text.StringsKt.startsWith$default(charSequence, charSequence2, false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(charSequence, charSequence3, false, 2, (java.lang.Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String removeSurrounding(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (str.length() < charSequence.length() + charSequence2.length()) {
            return str;
        }
        java.lang.String str2 = str;
        if (!kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str2, charSequence, false, 2, (java.lang.Object) null) || !kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str2, charSequence2, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final java.lang.CharSequence removeSurrounding(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        return kotlin.text.StringsKt.removeSurrounding(charSequence, charSequence2, charSequence2);
    }

    public static final java.lang.String removeSurrounding(java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return kotlin.text.StringsKt.removeSurrounding(str, charSequence, charSequence);
    }

    public static /* synthetic */ java.lang.String replaceBefore$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceBefore(str, c, str2, str3);
    }

    public static final java.lang.String replaceBefore(java.lang.String str, char c, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str4, c, 0, false, 6, (java.lang.Object) null);
        return indexOf$default == -1 ? str3 : kotlin.text.StringsKt.replaceRange(str4, 0, indexOf$default, str2).toString();
    }

    public static /* synthetic */ java.lang.String replaceBefore$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceBefore(str, str2, str3, str4);
    }

    public static final java.lang.String replaceBefore(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str5 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str5, str2, 0, false, 6, (java.lang.Object) null);
        return indexOf$default == -1 ? str4 : kotlin.text.StringsKt.replaceRange(str5, 0, indexOf$default, str3).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfter$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceAfter(str, c, str2, str3);
    }

    public static final java.lang.String replaceAfter(java.lang.String str, char c, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str4, c, 0, false, 6, (java.lang.Object) null);
        return indexOf$default == -1 ? str3 : kotlin.text.StringsKt.replaceRange(str4, indexOf$default + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfter$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceAfter(str, str2, str3, str4);
    }

    public static final java.lang.String replaceAfter(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str5 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str5, str2, 0, false, 6, (java.lang.Object) null);
        return indexOf$default == -1 ? str4 : kotlin.text.StringsKt.replaceRange(str5, indexOf$default + str2.length(), str.length(), str3).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfterLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceAfterLast(str, str2, str3, str4);
    }

    public static final java.lang.String replaceAfterLast(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str5 = str;
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str5, str2, 0, false, 6, (java.lang.Object) null);
        return lastIndexOf$default == -1 ? str4 : kotlin.text.StringsKt.replaceRange(str5, lastIndexOf$default + str2.length(), str.length(), str3).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfterLast$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceAfterLast(str, c, str2, str3);
    }

    public static final java.lang.String replaceAfterLast(java.lang.String str, char c, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str;
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str4, c, 0, false, 6, (java.lang.Object) null);
        return lastIndexOf$default == -1 ? str3 : kotlin.text.StringsKt.replaceRange(str4, lastIndexOf$default + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ java.lang.String replaceBeforeLast$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceBeforeLast(str, c, str2, str3);
    }

    public static final java.lang.String replaceBeforeLast(java.lang.String str, char c, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str;
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str4, c, 0, false, 6, (java.lang.Object) null);
        return lastIndexOf$default == -1 ? str3 : kotlin.text.StringsKt.replaceRange(str4, 0, lastIndexOf$default, str2).toString();
    }

    public static /* synthetic */ java.lang.String replaceBeforeLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceBeforeLast(str, str2, str3, str4);
    }

    public static final java.lang.String replaceBeforeLast(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str5 = str;
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str5, str2, 0, false, 6, (java.lang.Object) null);
        return lastIndexOf$default == -1 ? str4 : kotlin.text.StringsKt.replaceRange(str5, 0, lastIndexOf$default, str3).toString();
    }

    public static final boolean regionMatchesImpl(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!kotlin.text.CharsKt.equals(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence charSequence, char c, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(charSequence, c, z);
    }

    public static final boolean startsWith(java.lang.CharSequence charSequence, char c, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return charSequence.length() > 0 && kotlin.text.CharsKt.equals(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.CharSequence charSequence, char c, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(charSequence, c, z);
    }

    public static final boolean endsWith(java.lang.CharSequence charSequence, char c, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return charSequence.length() > 0 && kotlin.text.CharsKt.equals(charSequence.charAt(kotlin.text.StringsKt.getLastIndex(charSequence)), c, z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(charSequence, charSequence2, z);
    }

    public static final boolean startsWith(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (!z && (charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.text.StringsKt.startsWith$default((java.lang.String) charSequence, (java.lang.String) charSequence2, false, 2, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(charSequence, charSequence2, i, z);
    }

    public static final boolean startsWith(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (!z && (charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.text.StringsKt.startsWith$default((java.lang.String) charSequence, (java.lang.String) charSequence2, i, false, 4, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(charSequence, charSequence2, z);
    }

    public static final boolean endsWith(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (!z && (charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.text.StringsKt.endsWith$default((java.lang.String) charSequence, (java.lang.String) charSequence2, false, 2, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ java.lang.String commonPrefixWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.commonPrefixWith(charSequence, charSequence2, z);
    }

    public static final java.lang.String commonPrefixWith(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        int min = java.lang.Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && kotlin.text.CharsKt.equals(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (kotlin.text.StringsKt.hasSurrogatePairAt(charSequence, i2) || kotlin.text.StringsKt.hasSurrogatePairAt(charSequence2, i2)) {
            i = i2;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static /* synthetic */ java.lang.String commonSuffixWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.commonSuffixWith(charSequence, charSequence2, z);
    }

    public static final java.lang.String commonSuffixWith(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        int length = charSequence.length();
        int min = java.lang.Math.min(length, charSequence2.length());
        int i = 0;
        while (i < min && kotlin.text.CharsKt.equals(charSequence.charAt((length - i) - 1), charSequence2.charAt((r1 - i) - 1), z)) {
            i++;
        }
        if (kotlin.text.StringsKt.hasSurrogatePairAt(charSequence, (length - i) - 1) || kotlin.text.StringsKt.hasSurrogatePairAt(charSequence2, (r1 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    public static /* synthetic */ int indexOfAny$default(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOfAny(charSequence, cArr, i, z);
    }

    public static final int indexOfAny(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(kotlin.collections.ArraysKt.single(cArr), i);
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i, 0);
        int lastIndex = kotlin.text.StringsKt.getLastIndex(charSequence);
        if (coerceAtLeast > lastIndex) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(coerceAtLeast);
            for (char c : cArr) {
                if (kotlin.text.CharsKt.equals(c, charAt, z)) {
                    return coerceAtLeast;
                }
            }
            if (coerceAtLeast == lastIndex) {
                return -1;
            }
            coerceAtLeast++;
        }
    }

    public static /* synthetic */ int lastIndexOfAny$default(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOfAny(charSequence, cArr, i, z);
    }

    public static final int lastIndexOfAny(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).lastIndexOf(kotlin.collections.ArraysKt.single(cArr), i);
        }
        for (int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(i, kotlin.text.StringsKt.getLastIndex(charSequence)); coerceAtMost >= 0; coerceAtMost--) {
            char charAt = charSequence.charAt(coerceAtMost);
            for (char c : cArr) {
                if (kotlin.text.CharsKt.equals(c, charAt, z)) {
                    return coerceAtMost;
                }
            }
        }
        return -1;
    }

    private static final int getHighSpeedVideoSizes(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.IntRange downTo;
        if (!z2) {
            downTo = new kotlin.ranges.IntRange(kotlin.ranges.RangesKt.coerceAtLeast(i, 0), kotlin.ranges.RangesKt.coerceAtMost(i2, charSequence.length()));
        } else {
            downTo = kotlin.ranges.RangesKt.downTo(kotlin.ranges.RangesKt.coerceAtMost(i, kotlin.text.StringsKt.getLastIndex(charSequence)), kotlin.ranges.RangesKt.coerceAtLeast(i2, 0));
        }
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            int first = downTo.getFirst();
            int last = downTo.getLast();
            int step = downTo.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (true) {
                java.lang.String str = (java.lang.String) charSequence2;
                if (kotlin.text.StringsKt.regionMatches(str, 0, (java.lang.String) charSequence, first, str.length(), z)) {
                    return first;
                }
                if (first == last) {
                    return -1;
                }
                first += step;
            }
        } else {
            int first2 = downTo.getFirst();
            int last2 = downTo.getLast();
            int step2 = downTo.getStep();
            if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
                return -1;
            }
            while (!kotlin.text.StringsKt.regionMatchesImpl(charSequence2, 0, charSequence, first2, charSequence2.length(), z)) {
                if (first2 == last2) {
                    return -1;
                }
                first2 += step2;
            }
            return first2;
        }
    }

    private static final kotlin.Pair<java.lang.Integer, java.lang.String> getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> collection, int i, boolean z, boolean z2) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (!z && collection.size() == 1) {
            java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.single(collection);
            int indexOf$default = !z2 ? kotlin.text.StringsKt.indexOf$default(charSequence, str, i, false, 4, (java.lang.Object) null) : kotlin.text.StringsKt.lastIndexOf$default(charSequence, str, i, false, 4, (java.lang.Object) null);
            if (indexOf$default < 0) {
                return null;
            }
            return kotlin.TuplesKt.to(java.lang.Integer.valueOf(indexOf$default), str);
        }
        kotlin.ranges.IntRange intRange = !z2 ? new kotlin.ranges.IntRange(kotlin.ranges.RangesKt.coerceAtLeast(i, 0), charSequence.length()) : kotlin.ranges.RangesKt.downTo(kotlin.ranges.RangesKt.coerceAtMost(i, kotlin.text.StringsKt.getLastIndex(charSequence)), 0);
        if (charSequence instanceof java.lang.String) {
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int step = intRange.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    java.util.Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        java.lang.String str2 = (java.lang.String) obj2;
                        if (kotlin.text.StringsKt.regionMatches(str2, 0, (java.lang.String) charSequence, first, str2.length(), z)) {
                            break;
                        }
                    }
                    java.lang.String str3 = (java.lang.String) obj2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = intRange.getFirst();
            int last2 = intRange.getLast();
            int step2 = intRange.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    java.util.Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        java.lang.String str4 = (java.lang.String) obj;
                        if (kotlin.text.StringsKt.regionMatchesImpl(str4, 0, charSequence, first2, str4.length(), z)) {
                            break;
                        }
                    }
                    java.lang.String str5 = (java.lang.String) obj;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ kotlin.Pair findAnyOf$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.findAnyOf(charSequence, collection, i, z);
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> collection, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return getHighSpeedVideoFpsRanges(charSequence, collection, i, z, false);
    }

    public static /* synthetic */ kotlin.Pair findLastAnyOf$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.findLastAnyOf(charSequence, collection, i, z);
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findLastAnyOf(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> collection, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return getHighSpeedVideoFpsRanges(charSequence, collection, i, z, true);
    }

    public static /* synthetic */ int indexOfAny$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOfAny(charSequence, (java.util.Collection<java.lang.String>) collection, i, z);
    }

    public static final int indexOfAny(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> collection, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.Pair<java.lang.Integer, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, collection, i, z, false);
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOfAny(charSequence, (java.util.Collection<java.lang.String>) collection, i, z);
    }

    public static final int lastIndexOfAny(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> collection, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.Pair<java.lang.Integer, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, collection, i, z, true);
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence charSequence, char c, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOf(charSequence, c, i, z);
    }

    public static final int indexOf(java.lang.CharSequence charSequence, char c, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return (z || !(charSequence instanceof java.lang.String)) ? kotlin.text.StringsKt.indexOfAny(charSequence, new char[]{c}, i, z) : ((java.lang.String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOf(charSequence, str, i, z);
    }

    public static final int indexOf(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!z && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(str, i);
        }
        return getHighSpeedVideoSizes(charSequence, str, i, charSequence.length(), z, false);
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence charSequence, char c, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOf(charSequence, c, i, z);
    }

    public static final int lastIndexOf(java.lang.CharSequence charSequence, char c, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return (z || !(charSequence instanceof java.lang.String)) ? kotlin.text.StringsKt.lastIndexOfAny(charSequence, new char[]{c}, i, z) : ((java.lang.String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOf(charSequence, str, i, z);
    }

    public static final int lastIndexOf(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (z || !(charSequence instanceof java.lang.String)) {
            return getHighSpeedVideoSizes(charSequence, str, i, 0, z, true);
        }
        return ((java.lang.String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.contains(charSequence, charSequence2, z);
    }

    public static final boolean contains(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        return charSequence2 instanceof java.lang.String ? kotlin.text.StringsKt.indexOf$default(charSequence, (java.lang.String) charSequence2, 0, z, 2, (java.lang.Object) null) >= 0 : getHighSpeedVideoSizes(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0;
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence charSequence, char c, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.contains(charSequence, c, z);
    }

    public static final boolean contains(java.lang.CharSequence charSequence, char c, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return kotlin.text.StringsKt.indexOf$default(charSequence, c, 0, z, 2, (java.lang.Object) null) >= 0;
    }

    public static final void requireNonNegativeLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Limit must be non-negative, but was ".concat(java.lang.String.valueOf(i)).toString());
        }
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.splitToSequence(charSequence, strArr, z, i);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(final java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return kotlin.sequences.SequencesKt.map(Camera2StreamConfigurationMap(charSequence, strArr, z, i), new kotlin.jvm.functions.Function1() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.text.StringsKt__StringsKt.$r8$lambda$ELi_fx0JGmTRPjaALgYW_moJCr4(charSequence, (kotlin.ranges.IntRange) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, strArr, z, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length == 1) {
            java.lang.String str = strArr[0];
            if (str.length() != 0) {
                return Camera2StreamConfigurationMap(charSequence, str, z, i);
            }
        }
        java.lang.Iterable asIterable = kotlin.sequences.SequencesKt.asIterable(Camera2StreamConfigurationMap(charSequence, strArr, z, i));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        java.util.Iterator it = asIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.text.StringsKt.substring(charSequence, (kotlin.ranges.IntRange) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence charSequence, char[] cArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.splitToSequence(charSequence, cArr, z, i);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(final java.lang.CharSequence charSequence, char[] cArr, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        return kotlin.sequences.SequencesKt.map(getHighSpeedVideoSizes(charSequence, cArr, z, i), new kotlin.jvm.functions.Function1() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.text.StringsKt__StringsKt.$r8$lambda$iTftvDdL_lzGjVlJQTmElLXBbYs(charSequence, (kotlin.ranges.IntRange) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, char[] cArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, cArr, z, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, char[] cArr, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        if (cArr.length == 1) {
            return Camera2StreamConfigurationMap(charSequence, java.lang.String.valueOf(cArr[0]), z, i);
        }
        java.lang.Iterable asIterable = kotlin.sequences.SequencesKt.asIterable(getHighSpeedVideoSizes(charSequence, cArr, z, i));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        java.util.Iterator it = asIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.text.StringsKt.substring(charSequence, (kotlin.ranges.IntRange) it.next()));
        }
        return arrayList;
    }

    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, java.lang.String str, boolean z, int i) {
        kotlin.text.StringsKt.requireNonNegativeLimit(i);
        int i2 = 0;
        int indexOf = kotlin.text.StringsKt.indexOf(charSequence, str, 0, z);
        if (indexOf == -1 || i == 1) {
            return kotlin.collections.CollectionsKt.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(z2 ? kotlin.ranges.RangesKt.coerceAtMost(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i2, indexOf).toString());
            i2 = str.length() + indexOf;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            indexOf = kotlin.text.StringsKt.indexOf(charSequence, str, i2, z);
        } while (indexOf != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(final java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return new kotlin.sequences.Sequence<java.lang.String>() { // from class: kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<java.lang.String> iterator() {
                return new kotlin.text.LinesIterator(charSequence);
            }
        };
    }

    public static final java.util.List<java.lang.String> lines(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.text.StringsKt.lineSequence(charSequence));
    }

    public static final boolean contentEqualsIgnoreCaseImpl(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.text.StringsKt.equals((java.lang.String) charSequence, (java.lang.String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.text.CharsKt.equals(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean toBooleanStrict(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "true")) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "false")) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("The string doesn't represent a boolean value: ".concat(java.lang.String.valueOf(str)));
    }

    public static final java.lang.Boolean toBooleanStrictOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "true")) {
            return java.lang.Boolean.TRUE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "false")) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public static final int skipWhile(java.lang.String str, int i, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (i < str.length() && function1.invoke(java.lang.Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    public static final java.lang.CharSequence trim(java.lang.CharSequence charSequence, char... cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean contains = kotlin.collections.ArraysKt.contains(cArr, charSequence.charAt(!z ? i : length));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final java.lang.String trim(java.lang.String str, char... cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        java.lang.String str2 = str;
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean contains = kotlin.collections.ArraysKt.contains(cArr, str2.charAt(!z ? i : length));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i++;
            } else {
                z = true;
            }
        }
        return str2.subSequence(i, length + 1).toString();
    }

    public static final java.lang.CharSequence trimStart(java.lang.CharSequence charSequence, char... cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.collections.ArraysKt.contains(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final java.lang.String trimStart(java.lang.String str, char... cArr) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        java.lang.String str3 = str;
        int length = str3.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!kotlin.collections.ArraysKt.contains(cArr, str3.charAt(i))) {
                    str2 = str3.subSequence(i, str3.length());
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return str2.toString();
    }

    public static final java.lang.CharSequence trimEnd(java.lang.CharSequence charSequence, char... cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.collections.ArraysKt.contains(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final java.lang.String trimEnd(java.lang.String str, char... cArr) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        java.lang.String str3 = str;
        int length = str3.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.collections.ArraysKt.contains(cArr, str3.charAt(length))) {
                    str2 = str3.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            return str2.toString();
        }
        return str2.toString();
    }

    public static final java.lang.CharSequence trim(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean isWhitespace = kotlin.text.CharsKt.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (isWhitespace) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final java.lang.CharSequence trimStart(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final java.lang.CharSequence trimEnd(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final boolean isBlank(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$4JwvsE_x9Qd4xJfLltMpDIP3RoA(char[] cArr, boolean z, java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int indexOfAny = kotlin.text.StringsKt.indexOfAny(charSequence, cArr, i, z);
        if (indexOfAny < 0) {
            return null;
        }
        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(indexOfAny), 1);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$ELi_fx0JGmTRPjaALgYW_moJCr4(java.lang.CharSequence charSequence, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        return kotlin.text.StringsKt.substring(charSequence, intRange);
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$gKUnDVwn2f7eC7TWcWbv0SrbwQg(java.util.List list, boolean z, java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.Pair<java.lang.Integer, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, list, i, z, false);
        if (highSpeedVideoFpsRanges != null) {
            return kotlin.TuplesKt.to(highSpeedVideoFpsRanges.getFirst(), java.lang.Integer.valueOf(highSpeedVideoFpsRanges.getSecond().length()));
        }
        return null;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$iTftvDdL_lzGjVlJQTmElLXBbYs(java.lang.CharSequence charSequence, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        return kotlin.text.StringsKt.substring(charSequence, intRange);
    }

    private static /* synthetic */ kotlin.sequences.Sequence getHighSpeedVideoSizes(java.lang.CharSequence charSequence, final char[] cArr, final boolean z, int i) {
        kotlin.text.StringsKt.requireNonNegativeLimit(i);
        return new kotlin.text.DelimitedRangesSequence(charSequence, 0, i, new kotlin.jvm.functions.Function2() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlin.text.StringsKt__StringsKt.$r8$lambda$4JwvsE_x9Qd4xJfLltMpDIP3RoA(cArr, z, (java.lang.CharSequence) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    private static /* synthetic */ kotlin.sequences.Sequence Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, java.lang.String[] strArr, final boolean z, int i) {
        kotlin.text.StringsKt.requireNonNegativeLimit(i);
        final java.util.List asList = kotlin.collections.ArraysKt.asList(strArr);
        return new kotlin.text.DelimitedRangesSequence(charSequence, 0, i, new kotlin.jvm.functions.Function2() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlin.text.StringsKt__StringsKt.$r8$lambda$gKUnDVwn2f7eC7TWcWbv0SrbwQg(asList, z, (java.lang.CharSequence) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }
}
