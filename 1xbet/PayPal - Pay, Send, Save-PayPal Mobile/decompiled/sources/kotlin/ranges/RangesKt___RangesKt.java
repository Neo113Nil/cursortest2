package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u000f\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0011\u0010\u0002\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\n\u0010\f\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0007¢\u0006\u0004\b\n\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0011\u0010\u000e\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u000e\u0010\t\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u000f\u0010\f\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u0007¢\u0006\u0004\b\u000f\u0010\r\u001a\u0019\u0010\u0012\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0012\u001a\u00020\u0005*\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u0019\u0010\u0012\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u0005*\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u001a\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\b*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u001b\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b\"\u0010!\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b$\u0010!\u001a\"\u0010&\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020%0\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0087\u0002¢\u0006\u0004\b&\u0010!\u001a\"\u0010(\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020'0\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0087\u0002¢\u0006\u0004\b(\u0010!\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010)2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b \u0010*\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050)2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b\"\u0010*\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0)2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b$\u0010*\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001e\u001a\u00020%H\u0087\u0002¢\u0006\u0004\b \u0010+\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001e\u001a\u00020%H\u0087\u0002¢\u0006\u0004\b\"\u0010+\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020%H\u0087\u0002¢\u0006\u0004\b,\u0010+\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001e\u001a\u00020%H\u0087\u0002¢\u0006\u0004\b$\u0010+\u001a\"\u0010(\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020'0\u001c2\u0006\u0010\u001e\u001a\u00020%H\u0086\u0002¢\u0006\u0004\b(\u0010+\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001e\u001a\u00020'H\u0087\u0002¢\u0006\u0004\b \u0010-\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001e\u001a\u00020'H\u0087\u0002¢\u0006\u0004\b\"\u0010-\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020'H\u0087\u0002¢\u0006\u0004\b,\u0010-\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001e\u001a\u00020'H\u0087\u0002¢\u0006\u0004\b$\u0010-\u001a\"\u0010&\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020%0\u001c2\u0006\u0010\u001e\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b&\u0010-\u001a\"\u0010&\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020%0)2\u0006\u0010\u001e\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b&\u0010.\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\"\u0010/\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b,\u0010/\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b$\u0010/\u001a\"\u0010&\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020%0\u001c2\u0006\u0010\u001e\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b&\u0010/\u001a\"\u0010(\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020'0\u001c2\u0006\u0010\u001e\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b(\u0010/\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050)2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\"\u00100\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0)2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b,\u00100\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0)2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b$\u00100\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b \u00101\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b,\u00101\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b$\u00101\u001a\"\u0010&\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020%0\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b&\u00101\u001a\"\u0010(\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020'0\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b(\u00101\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010)2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b \u00102\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0)2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b,\u00102\u001a\"\u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020#0)2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b$\u00102\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b \u00103\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b\"\u00103\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b,\u00103\u001a\"\u0010&\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020%0\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b&\u00103\u001a\"\u0010(\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020'0\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b(\u00103\u001a\"\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00010)2\u0006\u0010\u001e\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b \u00104\u001a\"\u0010\"\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00050)2\u0006\u0010\u001e\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b\"\u00104\u001a\"\u0010,\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001d0)2\u0006\u0010\u001e\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b,\u00104\u001a\u001c\u00106\u001a\u00020\u0000*\u00020\u00012\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\b6\u00107\u001a\u001c\u00106\u001a\u00020\u0004*\u00020\u00052\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\b6\u00108\u001a\u001c\u00106\u001a\u00020\u0000*\u00020\u001d2\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\b6\u00109\u001a\u001c\u00106\u001a\u00020\u0000*\u00020#2\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\b6\u0010:\u001a\u001c\u00106\u001a\u00020\u0007*\u00020\b2\u0006\u00105\u001a\u00020\bH\u0086\u0004¢\u0006\u0004\b6\u0010;\u001a\u001c\u00106\u001a\u00020\u0000*\u00020\u00012\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b6\u0010<\u001a\u001c\u00106\u001a\u00020\u0004*\u00020\u00052\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b6\u0010=\u001a\u001c\u00106\u001a\u00020\u0000*\u00020\u001d2\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b6\u0010>\u001a\u001c\u00106\u001a\u00020\u0000*\u00020#2\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b6\u0010?\u001a\u001c\u00106\u001a\u00020\u0004*\u00020\u00012\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b6\u0010@\u001a\u001c\u00106\u001a\u00020\u0004*\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b6\u0010A\u001a\u001c\u00106\u001a\u00020\u0004*\u00020\u001d2\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b6\u0010B\u001a\u001c\u00106\u001a\u00020\u0004*\u00020#2\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b6\u0010C\u001a\u001c\u00106\u001a\u00020\u0000*\u00020\u00012\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b6\u0010D\u001a\u001c\u00106\u001a\u00020\u0004*\u00020\u00052\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b6\u0010E\u001a\u001c\u00106\u001a\u00020\u0000*\u00020\u001d2\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b6\u0010F\u001a\u001c\u00106\u001a\u00020\u0000*\u00020#2\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b6\u0010G\u001a\u0011\u0010H\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010H\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\bH\u0010J\u001a\u0011\u0010H\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\bH\u0010K\u001a\u001c\u0010L\u001a\u00020\u0000*\u00020\u00002\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\bL\u0010M\u001a\u001c\u0010L\u001a\u00020\u0004*\u00020\u00042\u0006\u0010L\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\bL\u0010N\u001a\u001c\u0010L\u001a\u00020\u0007*\u00020\u00072\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\bL\u0010O\u001a\u0015\u0010P\u001a\u0004\u0018\u00010\u001d*\u00020\u0001H\u0000¢\u0006\u0004\bP\u0010Q\u001a\u0015\u0010P\u001a\u0004\u0018\u00010\u001d*\u00020\u0005H\u0000¢\u0006\u0004\bP\u0010R\u001a\u0015\u0010P\u001a\u0004\u0018\u00010\u001d*\u00020#H\u0000¢\u0006\u0004\bP\u0010S\u001a\u0015\u0010P\u001a\u0004\u0018\u00010\u001d*\u00020%H\u0000¢\u0006\u0004\bP\u0010T\u001a\u0015\u0010P\u001a\u0004\u0018\u00010\u001d*\u00020'H\u0000¢\u0006\u0004\bP\u0010U\u001a\u0015\u0010V\u001a\u0004\u0018\u00010\u0001*\u00020\u0005H\u0000¢\u0006\u0004\bV\u0010W\u001a\u0015\u0010V\u001a\u0004\u0018\u00010\u0001*\u00020%H\u0000¢\u0006\u0004\bV\u0010X\u001a\u0015\u0010V\u001a\u0004\u0018\u00010\u0001*\u00020'H\u0000¢\u0006\u0004\bV\u0010Y\u001a\u0015\u0010Z\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0000¢\u0006\u0004\bZ\u0010[\u001a\u0015\u0010Z\u001a\u0004\u0018\u00010\u0005*\u00020'H\u0000¢\u0006\u0004\bZ\u0010\\\u001a\u0015\u0010]\u001a\u0004\u0018\u00010#*\u00020\u0001H\u0000¢\u0006\u0004\b]\u0010^\u001a\u0015\u0010]\u001a\u0004\u0018\u00010#*\u00020\u0005H\u0000¢\u0006\u0004\b]\u0010_\u001a\u0015\u0010]\u001a\u0004\u0018\u00010#*\u00020%H\u0000¢\u0006\u0004\b]\u0010`\u001a\u0015\u0010]\u001a\u0004\u0018\u00010#*\u00020'H\u0000¢\u0006\u0004\b]\u0010a\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020\u00012\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\bb\u0010c\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020\u00052\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\bb\u0010d\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020\u001d2\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\bb\u0010e\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020#2\u0006\u00105\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\bb\u0010f\u001a\u001c\u0010b\u001a\u00020\u0016*\u00020\b2\u0006\u00105\u001a\u00020\bH\u0086\u0004¢\u0006\u0004\bb\u0010g\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020\u00012\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010h\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020\u00052\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010i\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020\u001d2\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010j\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020#2\u0006\u00105\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010k\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020\u00012\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\bb\u0010l\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\bb\u0010m\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020\u001d2\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\bb\u0010n\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020#2\u0006\u00105\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\bb\u0010o\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020\u00012\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\bb\u0010p\u001a\u001c\u0010b\u001a\u00020\u0014*\u00020\u00052\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\bb\u0010q\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020\u001d2\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\bb\u0010r\u001a\u001c\u0010b\u001a\u00020\u0010*\u00020#2\u0006\u00105\u001a\u00020#H\u0086\u0004¢\u0006\u0004\bb\u0010s\u001a)\u0010w\u001a\u00028\u0000\"\u000e\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000t*\u00028\u00002\u0006\u0010v\u001a\u00028\u0000¢\u0006\u0004\bw\u0010x\u001a\u0019\u0010w\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010v\u001a\u00020\u001d¢\u0006\u0004\bw\u0010y\u001a\u0019\u0010w\u001a\u00020#*\u00020#2\u0006\u0010v\u001a\u00020#¢\u0006\u0004\bw\u0010z\u001a\u0019\u0010w\u001a\u00020\u0001*\u00020\u00012\u0006\u0010v\u001a\u00020\u0001¢\u0006\u0004\bw\u0010{\u001a\u0019\u0010w\u001a\u00020\u0005*\u00020\u00052\u0006\u0010v\u001a\u00020\u0005¢\u0006\u0004\bw\u0010|\u001a\u0019\u0010w\u001a\u00020'*\u00020'2\u0006\u0010v\u001a\u00020'¢\u0006\u0004\bw\u0010}\u001a\u0019\u0010w\u001a\u00020%*\u00020%2\u0006\u0010v\u001a\u00020%¢\u0006\u0004\bw\u0010~\u001a+\u0010\u0080\u0001\u001a\u00028\u0000\"\u000e\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000t*\u00028\u00002\u0006\u0010\u007f\u001a\u00028\u0000¢\u0006\u0005\b\u0080\u0001\u0010x\u001a\u001b\u0010\u0080\u0001\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010\u007f\u001a\u00020\u001d¢\u0006\u0005\b\u0080\u0001\u0010y\u001a\u001b\u0010\u0080\u0001\u001a\u00020#*\u00020#2\u0006\u0010\u007f\u001a\u00020#¢\u0006\u0005\b\u0080\u0001\u0010z\u001a\u001b\u0010\u0080\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u007f\u001a\u00020\u0001¢\u0006\u0005\b\u0080\u0001\u0010{\u001a\u001b\u0010\u0080\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u0005¢\u0006\u0005\b\u0080\u0001\u0010|\u001a\u001b\u0010\u0080\u0001\u001a\u00020'*\u00020'2\u0006\u0010\u007f\u001a\u00020'¢\u0006\u0005\b\u0080\u0001\u0010}\u001a\u001b\u0010\u0080\u0001\u001a\u00020%*\u00020%2\u0006\u0010\u007f\u001a\u00020%¢\u0006\u0005\b\u0080\u0001\u0010~\u001a8\u0010\u0081\u0001\u001a\u00028\u0000\"\u000e\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000t*\u00028\u00002\b\u0010v\u001a\u0004\u0018\u00018\u00002\b\u0010\u007f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a$\u0010\u0081\u0001\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010v\u001a\u00020\u001d2\u0006\u0010\u007f\u001a\u00020\u001d¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001\u001a$\u0010\u0081\u0001\u001a\u00020#*\u00020#2\u0006\u0010v\u001a\u00020#2\u0006\u0010\u007f\u001a\u00020#¢\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001\u001a$\u0010\u0081\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010v\u001a\u00020\u00012\u0006\u0010\u007f\u001a\u00020\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0085\u0001\u001a$\u0010\u0081\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010v\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u0005¢\u0006\u0006\b\u0081\u0001\u0010\u0086\u0001\u001a$\u0010\u0081\u0001\u001a\u00020'*\u00020'2\u0006\u0010v\u001a\u00020'2\u0006\u0010\u007f\u001a\u00020'¢\u0006\u0006\b\u0081\u0001\u0010\u0087\u0001\u001a$\u0010\u0081\u0001\u001a\u00020%*\u00020%2\u0006\u0010v\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020%¢\u0006\u0006\b\u0081\u0001\u0010\u0088\u0001\u001a4\u0010\u0081\u0001\u001a\u00028\u0000\"\u000e\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000t*\u00028\u00002\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u008b\u0001\u001a3\u0010\u0081\u0001\u001a\u00028\u0000\"\u000e\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000t*\u00028\u00002\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0006\b\u0081\u0001\u0010\u008c\u0001\u001a#\u0010\u0081\u0001\u001a\u00020\u0001*\u00020\u00012\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0006\b\u0081\u0001\u0010\u008d\u0001\u001a#\u0010\u0081\u0001\u001a\u00020\u0005*\u00020\u00052\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c¢\u0006\u0006\b\u0081\u0001\u0010\u008e\u0001"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "first", "(Lkotlin/ranges/IntProgression;)I", "Lkotlin/ranges/LongProgression;", "", "(Lkotlin/ranges/LongProgression;)J", "Lkotlin/ranges/CharProgression;", "", "(Lkotlin/ranges/CharProgression;)C", "firstOrNull", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "last", "lastOrNull", "Lkotlin/ranges/IntRange;", "Lkotlin/random/Random;", "random", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)J", "Lkotlin/ranges/CharRange;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)C", "randomOrNull", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "Lkotlin/ranges/ClosedRange;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "intRangeContains", "(Lkotlin/ranges/ClosedRange;B)Z", "longRangeContains", "", "shortRangeContains", "", "doubleRangeContains", "", "floatRangeContains", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;B)Z", "(Lkotlin/ranges/ClosedRange;D)Z", "byteRangeContains", "(Lkotlin/ranges/ClosedRange;F)Z", "(Lkotlin/ranges/OpenEndRange;F)Z", "(Lkotlin/ranges/ClosedRange;I)Z", "(Lkotlin/ranges/OpenEndRange;I)Z", "(Lkotlin/ranges/ClosedRange;J)Z", "(Lkotlin/ranges/OpenEndRange;J)Z", "(Lkotlin/ranges/ClosedRange;S)Z", "(Lkotlin/ranges/OpenEndRange;S)Z", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "downTo", "(IB)Lkotlin/ranges/IntProgression;", "(JB)Lkotlin/ranges/LongProgression;", "(BB)Lkotlin/ranges/IntProgression;", "(SB)Lkotlin/ranges/IntProgression;", "(CC)Lkotlin/ranges/CharProgression;", "(II)Lkotlin/ranges/IntProgression;", "(JI)Lkotlin/ranges/LongProgression;", "(BI)Lkotlin/ranges/IntProgression;", "(SI)Lkotlin/ranges/IntProgression;", "(IJ)Lkotlin/ranges/LongProgression;", "(JJ)Lkotlin/ranges/LongProgression;", "(BJ)Lkotlin/ranges/LongProgression;", "(SJ)Lkotlin/ranges/LongProgression;", "(IS)Lkotlin/ranges/IntProgression;", "(JS)Lkotlin/ranges/LongProgression;", "(BS)Lkotlin/ranges/IntProgression;", "(SS)Lkotlin/ranges/IntProgression;", "reversed", "(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/LongProgression;)Lkotlin/ranges/LongProgression;", "(Lkotlin/ranges/CharProgression;)Lkotlin/ranges/CharProgression;", "step", "(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/LongProgression;J)Lkotlin/ranges/LongProgression;", "(Lkotlin/ranges/CharProgression;I)Lkotlin/ranges/CharProgression;", "toByteExactOrNull", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "toIntExactOrNull", "(J)Ljava/lang/Integer;", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "until", "(IB)Lkotlin/ranges/IntRange;", "(JB)Lkotlin/ranges/LongRange;", "(BB)Lkotlin/ranges/IntRange;", "(SB)Lkotlin/ranges/IntRange;", "(CC)Lkotlin/ranges/CharRange;", "(II)Lkotlin/ranges/IntRange;", "(JI)Lkotlin/ranges/LongRange;", "(BI)Lkotlin/ranges/IntRange;", "(SI)Lkotlin/ranges/IntRange;", "(IJ)Lkotlin/ranges/LongRange;", "(JJ)Lkotlin/ranges/LongRange;", "(BJ)Lkotlin/ranges/LongRange;", "(SJ)Lkotlin/ranges/LongRange;", "(IS)Lkotlin/ranges/IntRange;", "(JS)Lkotlin/ranges/LongRange;", "(BS)Lkotlin/ranges/IntRange;", "(SS)Lkotlin/ranges/IntRange;", "", "T", "minimumValue", "coerceAtLeast", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(BB)B", "(SS)S", "(II)I", "(JJ)J", "(FF)F", "(DD)D", "maximumValue", "coerceAtMost", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(BBB)B", "(SSS)S", "(III)I", "(JJJ)J", "(FFF)F", "(DDD)D", "Lkotlin/ranges/ClosedFloatingPointRange;", "range", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "(ILkotlin/ranges/ClosedRange;)I", "(JLkotlin/ranges/ClosedRange;)J"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes3.dex */
public class RangesKt___RangesKt extends kotlin.ranges.RangesKt__RangesKt {
    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    public static final int first(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(intProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return intProgression.getFirst();
    }

    public static final long first(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(longProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return longProgression.getFirst();
    }

    public static final char first(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(charProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return charProgression.getFirst();
    }

    public static final java.lang.Integer firstOrNull(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(intProgression.getFirst());
    }

    public static final java.lang.Long firstOrNull(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(longProgression.getFirst());
    }

    public static final java.lang.Character firstOrNull(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf(charProgression.getFirst());
    }

    public static final int last(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(intProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return intProgression.getLast();
    }

    public static final long last(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(longProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return longProgression.getLast();
    }

    public static final char last(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(charProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return charProgression.getLast();
    }

    public static final java.lang.Integer lastOrNull(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(intProgression.getLast());
    }

    public static final java.lang.Long lastOrNull(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(longProgression.getLast());
    }

    public static final java.lang.Character lastOrNull(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf(charProgression.getLast());
    }

    public static final int random(kotlin.ranges.IntRange intRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        try {
            return kotlin.random.RandomKt.nextInt(random, intRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(kotlin.ranges.LongRange longRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        try {
            return kotlin.random.RandomKt.nextLong(random, longRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final char random(kotlin.ranges.CharRange charRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final java.lang.Integer randomOrNull(kotlin.ranges.IntRange intRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (intRange.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(kotlin.random.RandomKt.nextInt(random, intRange));
    }

    public static final java.lang.Long randomOrNull(kotlin.ranges.LongRange longRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (longRange.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(kotlin.random.RandomKt.nextLong(random, longRange));
    }

    public static final java.lang.Character randomOrNull(kotlin.ranges.CharRange charRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (charRange.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Integer.valueOf(b));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Long.valueOf(b));
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Short.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Double.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Float.valueOf(b));
    }

    public static final boolean intRangeContains(kotlin.ranges.OpenEndRange<java.lang.Integer> openEndRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Integer.valueOf(b));
    }

    public static final boolean longRangeContains(kotlin.ranges.OpenEndRange<java.lang.Long> openEndRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Long.valueOf(b));
    }

    public static final boolean shortRangeContains(kotlin.ranges.OpenEndRange<java.lang.Short> openEndRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Short.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Long longExactOrNull = kotlin.ranges.RangesKt.toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Float.valueOf((float) d));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Long longExactOrNull = kotlin.ranges.RangesKt.toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Double.valueOf(f));
    }

    public static final boolean doubleRangeContains(kotlin.ranges.OpenEndRange<java.lang.Double> openEndRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Double.valueOf(f));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Long.valueOf(i));
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Double.valueOf(i));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Float.valueOf(i));
    }

    public static final boolean longRangeContains(kotlin.ranges.OpenEndRange<java.lang.Long> openEndRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Long.valueOf(i));
    }

    public static final boolean byteRangeContains(kotlin.ranges.OpenEndRange<java.lang.Byte> openEndRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.OpenEndRange<java.lang.Short> openEndRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Double.valueOf(j));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Float.valueOf(j));
    }

    public static final boolean intRangeContains(kotlin.ranges.OpenEndRange<java.lang.Integer> openEndRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(kotlin.ranges.OpenEndRange<java.lang.Byte> openEndRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.OpenEndRange<java.lang.Short> openEndRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Integer.valueOf(s));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Long.valueOf(s));
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Double.valueOf(s));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(java.lang.Float.valueOf(s));
    }

    public static final boolean intRangeContains(kotlin.ranges.OpenEndRange<java.lang.Integer> openEndRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Integer.valueOf(s));
    }

    public static final boolean longRangeContains(kotlin.ranges.OpenEndRange<java.lang.Long> openEndRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(java.lang.Long.valueOf(s));
    }

    public static final boolean byteRangeContains(kotlin.ranges.OpenEndRange<java.lang.Byte> openEndRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final kotlin.ranges.IntProgression downTo(int i, byte b) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, b, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, byte b) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, b, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, byte b2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, b2, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, byte b) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, b, -1);
    }

    public static final kotlin.ranges.CharProgression downTo(char c, char c2) {
        return kotlin.ranges.CharProgression.INSTANCE.fromClosedRange(c, c2, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, int i2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, i2, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, int i) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, i, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, int i) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, i, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, int i) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, i, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(int i, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(i, j, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, long j2) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, j2, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(byte b, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(b, j, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(short s, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(s, j, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, short s) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, s, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, short s) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, s, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, short s) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, s, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, short s2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, s2, -1);
    }

    public static final kotlin.ranges.IntProgression reversed(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "");
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static final kotlin.ranges.LongProgression reversed(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    public static final kotlin.ranges.CharProgression reversed(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "");
        return kotlin.ranges.CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    public static final kotlin.ranges.IntProgression step(kotlin.ranges.IntProgression intProgression, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.IntProgression.Companion companion = kotlin.ranges.IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final kotlin.ranges.LongProgression step(kotlin.ranges.LongProgression longProgression, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        kotlin.ranges.RangesKt.checkStepIsPositive(j > 0, java.lang.Long.valueOf(j));
        kotlin.ranges.LongProgression.Companion companion = kotlin.ranges.LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.fromClosedRange(first, last, j);
    }

    public static final kotlin.ranges.CharProgression step(kotlin.ranges.CharProgression charProgression, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.CharProgression.Companion companion = kotlin.ranges.CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final java.lang.Byte toByteExactOrNull(int i) {
        if (-128 > i || i >= 128) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) i);
    }

    public static final java.lang.Byte toByteExactOrNull(long j) {
        if (-128 > j || j >= 128) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) j);
    }

    public static final java.lang.Byte toByteExactOrNull(short s) {
        if (-128 > s || s >= 128) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) s);
    }

    public static final java.lang.Byte toByteExactOrNull(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) d);
    }

    public static final java.lang.Byte toByteExactOrNull(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) f);
    }

    public static final java.lang.Integer toIntExactOrNull(long j) {
        if (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask > j || j >= 2147483648L) {
            return null;
        }
        return java.lang.Integer.valueOf((int) j);
    }

    public static final java.lang.Integer toIntExactOrNull(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return java.lang.Integer.valueOf((int) d);
    }

    public static final java.lang.Integer toIntExactOrNull(float f) {
        if (-2.1474836E9f > f || f > 2.1474836E9f) {
            return null;
        }
        return java.lang.Integer.valueOf((int) f);
    }

    public static final java.lang.Long toLongExactOrNull(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return java.lang.Long.valueOf((long) d);
    }

    public static final java.lang.Long toLongExactOrNull(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return java.lang.Long.valueOf((long) f);
    }

    public static final java.lang.Short toShortExactOrNull(int i) {
        if (-32768 > i || i >= 32768) {
            return null;
        }
        return java.lang.Short.valueOf((short) i);
    }

    public static final java.lang.Short toShortExactOrNull(long j) {
        if (-32768 > j || j >= 32768) {
            return null;
        }
        return java.lang.Short.valueOf((short) j);
    }

    public static final java.lang.Short toShortExactOrNull(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return java.lang.Short.valueOf((short) d);
    }

    public static final java.lang.Short toShortExactOrNull(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return java.lang.Short.valueOf((short) f);
    }

    public static final kotlin.ranges.IntRange until(int i, byte b) {
        return new kotlin.ranges.IntRange(i, b - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, byte b) {
        return new kotlin.ranges.LongRange(j, b - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, byte b2) {
        return new kotlin.ranges.IntRange(b, b2 - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, byte b) {
        return new kotlin.ranges.IntRange(s, b - 1);
    }

    public static final kotlin.ranges.CharRange until(char c, char c2) {
        return kotlin.jvm.internal.Intrinsics.compare((int) c2, 0) <= 0 ? kotlin.ranges.CharRange.INSTANCE.getEMPTY() : new kotlin.ranges.CharRange(c, (char) (c2 - 1));
    }

    public static final kotlin.ranges.IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(i, i2 - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, int i) {
        return new kotlin.ranges.LongRange(j, i - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(b, i - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(s, i - 1);
    }

    public static final kotlin.ranges.LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(i, j - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(j, j2 - 1);
    }

    public static final kotlin.ranges.LongRange until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(b, j - 1);
    }

    public static final kotlin.ranges.LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(s, j - 1);
    }

    public static final kotlin.ranges.IntRange until(int i, short s) {
        return new kotlin.ranges.IntRange(i, s - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, short s) {
        return new kotlin.ranges.LongRange(j, s - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, short s) {
        return new kotlin.ranges.IntRange(b, s - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, short s2) {
        return new kotlin.ranges.IntRange(s, s2 - 1);
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceAtLeast(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceAtMost(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T t, T t2, T t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
                sb.append(t3);
                sb.append(" is less than minimum ");
                sb.append(t2);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (t.compareTo(t2) >= 0) {
                if (t.compareTo(t3) > 0) {
                }
            }
            return t2;
        }
        if (t2 == null || t.compareTo(t2) >= 0) {
            return (t3 == null || t.compareTo(t3) <= 0) ? t : t3;
        }
        return t2;
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((int) b3);
        sb.append(" is less than minimum ");
        sb.append((int) b2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((int) s3);
        sb.append(" is less than minimum ");
        sb.append((int) s2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(i3);
        sb.append(" is less than minimum ");
        sb.append(i2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(j3);
        sb.append(" is less than minimum ");
        sb.append(j2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(f3);
        sb.append(" is less than minimum ");
        sb.append(f2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(d3);
        sb.append(" is less than minimum ");
        sb.append(d2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T t, kotlin.ranges.ClosedFloatingPointRange<T> closedFloatingPointRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedFloatingPointRange, "");
        if (!closedFloatingPointRange.isEmpty()) {
            return (!closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getStart()) || closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getStart(), t)) ? (!closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getEndInclusive(), t) || closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getEndInclusive())) ? t : closedFloatingPointRange.getEndInclusive() : closedFloatingPointRange.getStart();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedFloatingPointRange);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T t, kotlin.ranges.ClosedRange<T> closedRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return (T) kotlin.ranges.RangesKt.coerceIn((java.lang.Comparable) t, (kotlin.ranges.ClosedFloatingPointRange) closedRange);
        }
        if (!closedRange.isEmpty()) {
            return t.compareTo(closedRange.getStart()) < 0 ? closedRange.getStart() : t.compareTo(closedRange.getEndInclusive()) > 0 ? closedRange.getEndInclusive() : t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final int coerceIn(int i, kotlin.ranges.ClosedRange<java.lang.Integer> closedRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Integer.valueOf(i), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Integer>) closedRange)).intValue();
        }
        if (!closedRange.isEmpty()) {
            return i < closedRange.getStart().intValue() ? closedRange.getStart().intValue() : i > closedRange.getEndInclusive().intValue() ? closedRange.getEndInclusive().intValue() : i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final long coerceIn(long j, kotlin.ranges.ClosedRange<java.lang.Long> closedRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Long.valueOf(j), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Long>) closedRange)).longValue();
        }
        if (!closedRange.isEmpty()) {
            return j < closedRange.getStart().longValue() ? closedRange.getStart().longValue() : j > closedRange.getEndInclusive().longValue() ? closedRange.getEndInclusive().longValue() : j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
