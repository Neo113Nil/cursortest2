package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\bA\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ¯\u00012\u00020\u0001:\u0002¯\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\nJ\u0010\u00109\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\nJ\u000e\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0007J\u0006\u0010<\u001a\u000207J\u0006\u0010=\u001a\u000207J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\nH\u0002J\b\u0010@\u001a\u000207H\u0002J\u0006\u0010A\u001a\u000207J\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\nH\u0002J\u0010\u0010C\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\nH\u0002J \u0010D\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010F\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\u0010\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002J(\u0010H\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010J\u001a\u00020\nJ\u0006\u0010K\u001a\u000207J\u000e\u0010L\u001a\u0002072\u0006\u00109\u001a\u00020\u0007J\u000e\u0010L\u001a\u0002072\u0006\u0010:\u001a\u00020\nJ \u0010M\u001a\u0002072\u0006\u0010#\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0002JK\u0010O\u001a\u0002072\u0006\u0010?\u001a\u00020\n28\u0010P\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(:\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(T\u0012\u0004\u0012\u0002070QH\u0086\bJ\u0010\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\nJ\u0010\u0010V\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\u000e\u0010W\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\nJ\u000e\u0010Y\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u000e\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010[J\u001a\u0010\\\u001a\u0002012\u0006\u0010#\u001a\u00020\n2\b\u0010]\u001a\u0004\u0018\u00010^H\u0002J\u0006\u0010_\u001a\u00020^J\u000e\u0010`\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\nJ\u0016\u0010a\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nJ\u000e\u0010b\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010c\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0010\u0010e\u001a\u0002072\u0006\u0010'\u001a\u00020\nH\u0002J\u0018\u0010f\u001a\u0002072\u0006\u0010'\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\nJ\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020\n0hH\u0002J\u0010\u0010i\u001a\u0002072\b\b\u0002\u0010?\u001a\u00020\nJ \u0010j\u001a\u0002072\u0006\u0010k\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0002J&\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\n2\b\b\u0002\u0010n\u001a\u00020\u000eJ\u000e\u0010o\u001a\u0002072\u0006\u0010p\u001a\u00020\nJ\u0010\u0010q\u001a\u0002072\u0006\u0010:\u001a\u00020\nH\u0002J$\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u0010p\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\nJ\u0018\u0010s\u001a\u0002072\u0006\u0010:\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002J$\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u00109\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\n2\u0006\u0010u\u001a\u00020\u0000J\u0010\u0010v\u001a\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u0007J\u0010\u0010v\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010w\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002J\u0018\u0010x\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0002J\b\u0010y\u001a\u000207H\u0002J\u000e\u0010z\u001a\u0002072\u0006\u0010]\u001a\u00020^J\u0006\u0010{\u001a\u000207J\u0016\u0010|\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\u0006\u0010d\u001a\u00020^J@\u0010~\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2&\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u000100j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u0001`2H\u0002J\u0006\u0010\u007f\u001a\u00020\u000eJ\u001b\u0010\u0080\u0001\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\nH\u0002J#\u0010\u0083\u0001\u001a\u0002072\u0007\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002J\u0007\u0010\u0084\u0001\u001a\u000207J\t\u0010\u0085\u0001\u001a\u00020\nH\u0002J\t\u0010\u0086\u0001\u001a\u000207H\u0002J\u000f\u0010\u0087\u0001\u001a\u0002072\u0006\u00109\u001a\u00020\u0007J\u0011\u0010\u0088\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001J#\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u008a\u0001\u001a\u00020\nJ\u0007\u0010\u008b\u0001\u001a\u000207J\u0019\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\nJ\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0013\u0010\u008e\u0001\u001a\u0004\u0018\u0001012\u0006\u0010?\u001a\u00020\nH\u0002J\u001a\u0010\u008f\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001J%\u0010\u008f\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u0092\u0001\u001a\u000207J\u000f\u0010\u0092\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\nJ\u001a\u0010\u0092\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0001J/\u0010\u0092\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u000e2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0094\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001J$\u0010\u0094\u0001\u001a\u0002072\u0006\u0010}\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010v\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0095\u0001\u001a\u00020^H\u0016J\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010?\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0097\u0001J\u0013\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0099\u0001\u001a\u0002072\u0007\u0010\u009a\u0001\u001a\u00020\n2\u0007\u0010\u009b\u0001\u001a\u00020\nH\u0002J\u0011\u0010\u009c\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u009d\u0001\u001a\u0002072\u0006\u0010?\u001a\u00020\nH\u0002J\u001a\u0010\u009e\u0001\u001a\u0002072\u0006\u0010?\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020&H\u0002J\u0019\u0010\u009f\u0001\u001a\u0002072\u0006\u00109\u001a\u00020\u00072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u009f\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u001b\u0010 \u0001\u001a\u0002072\u0006\u0010:\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010¡\u0001\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u000f\u0010¢\u0001\u001a\u000207H\u0000¢\u0006\u0003\b£\u0001J\u000f\u0010¤\u0001\u001a\u000207H\u0000¢\u0006\u0003\b¥\u0001J\u0016\u0010¦\u0001\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u0015\u0010F\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u0013\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\n0h*\u00020\u001dH\u0002J\u001b\u0010©\u0001\u001a\u000207*\b0ª\u0001j\u0003`«\u00012\u0006\u0010:\u001a\u00020\nH\u0002J\u0016\u0010¬\u0001\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u0014\u0010#\u001a\u00020\n*\u00020\u001d2\u0006\u0010:\u001a\u00020\nH\u0002J\u0016\u0010\u00ad\u0001\u001a\u00020\n*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\nH\u0002J\u001e\u0010®\u0001\u001a\u000207*\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0018\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010*X\u0082\u000e¢\u0006\u0004\n\u0002\u0010+R\u000e\u0010,\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u000100j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u0001`2X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006°\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", com.ironsource.B5.R, "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", com.ironsource.C3300u.l, io.ktor.http.LinkHeader.Parameters.Anchor, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "anchorIndex", "bashCurrentGroup", "beginInsert", "childContainsAnyMarks", "group", "clearSlotGap", "close", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "forEachData", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupSourceInformationFor", "sourceInformation", "", "groupsAsString", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "value", "insertGroups", "insertSlots", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", "offset", "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "recalculateMarks", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationEnd", "recordGrouplessCallSourceInformationStart", com.ironsource.X3.i.W, "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "groupIndex", "sourceInformationOf", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "tryAnchor", "tryAnchor$runtime_release", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS, "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotWriter {
    private java.util.ArrayList<androidx.compose.runtime.Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private androidx.compose.runtime.PrioritySet pendingRecalculateMarks;
    private java.lang.Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap;
    private final androidx.compose.runtime.SlotTable table;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.SlotWriter.Companion INSTANCE = new androidx.compose.runtime.SlotWriter.Companion(null);
    public static final int $stable = 8;
    private final androidx.compose.runtime.IntStack startStack = new androidx.compose.runtime.IntStack();
    private final androidx.compose.runtime.IntStack endStack = new androidx.compose.runtime.IntStack();
    private final androidx.compose.runtime.IntStack nodeCountStack = new androidx.compose.runtime.IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    public SlotWriter(androidx.compose.runtime.SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    /* renamed from: getTable$runtime_release, reason: from getter */
    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        boolean isNode;
        int i = this.currentGroup;
        if (i < this.currentGroupEnd) {
            isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNode(int index) {
        boolean isNode;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress(index));
        return isNode;
    }

    public final int nodeCount(int index) {
        int nodeCount;
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, groupIndexToAddress(index));
        return nodeCount;
    }

    public final int groupKey(int index) {
        int key;
        key = androidx.compose.runtime.SlotTableKt.key(this.groups, groupIndexToAddress(index));
        return key;
    }

    public final java.lang.Object groupObjectKey(int index) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(index);
        hasObjectKey = androidx.compose.runtime.SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (!hasObjectKey) {
            return null;
        }
        java.lang.Object[] objArr = this.slots;
        objectKeyIndex = androidx.compose.runtime.SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
        return objArr[objectKeyIndex];
    }

    public final int groupSize(int index) {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
        return groupSize;
    }

    public final java.lang.Object groupAux(int index) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(index);
        hasAux = androidx.compose.runtime.SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        return hasAux ? this.slots[auxIndex(this.groups, groupIndexToAddress)] : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final boolean indexInParent(int index) {
        int i = this.parent;
        return (index > i && index < this.currentGroupEnd) || (i == 0 && index == 0);
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int capacity;
        int groupSize;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (group > this.startStack.peekOr(0)) {
                groupSize = groupSize(group);
            } else {
                int indexOf = this.startStack.indexOf(group);
                if (indexOf < 0) {
                    groupSize = groupSize(group);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + group;
        }
        return index > group && index < capacity;
    }

    public final java.lang.Object node(int index) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(index);
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final java.lang.Object node(androidx.compose.runtime.Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final int parent(androidx.compose.runtime.Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap);
    }

    public final void reset() {
        if (this.insertCount == 0) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.Object update(java.lang.Object value) {
        java.lang.Object skip = skip();
        set(value);
        return skip;
    }

    public final void updateAux(java.lang.Object value) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = androidx.compose.runtime.SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = value;
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final void insertAux(java.lang.Object value) {
        boolean hasAux;
        if (this.insertCount >= 0) {
            int i = this.parent;
            int groupIndexToAddress = groupIndexToAddress(i);
            hasAux = androidx.compose.runtime.SlotTableKt.hasAux(this.groups, groupIndexToAddress);
            if (!hasAux) {
                insertSlots(1, i);
                int auxIndex = auxIndex(this.groups, groupIndexToAddress);
                int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
                int i2 = this.currentSlot;
                if (i2 > auxIndex) {
                    int i3 = i2 - auxIndex;
                    if (i3 >= 3) {
                        throw new java.lang.IllegalStateException("Moving more than two slot not supported".toString());
                    }
                    if (i3 > 1) {
                        java.lang.Object[] objArr = this.slots;
                        objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
                    }
                    java.lang.Object[] objArr2 = this.slots;
                    objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
                }
                androidx.compose.runtime.SlotTableKt.addAux(this.groups, groupIndexToAddress);
                this.slots[dataIndexToDataAddress] = value;
                this.currentSlot++;
                return;
            }
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void recordGroupSourceInformation(java.lang.String sourceInformation) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int key, java.lang.String value) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).startGrouplessCall(key, value);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).endGrouplessCall();
        }
    }

    private final androidx.compose.runtime.GroupSourceInformation groupSourceInformationFor(int parent, java.lang.String sourceInformation) {
        int groupSize;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
        }
        this.sourceInformationMap = hashMap;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap2 = hashMap;
        androidx.compose.runtime.Anchor anchor = anchor(parent);
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation = hashMap2.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new androidx.compose.runtime.GroupSourceInformation(0, sourceInformation);
            if (sourceInformation == null) {
                int i = parent + 1;
                int i2 = this.currentGroup;
                while (i < i2) {
                    groupSourceInformation.reportGroup(this, i);
                    groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, i);
                    i += groupSize;
                }
            }
            hashMap2.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void updateNode(java.lang.Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateNode(androidx.compose.runtime.Anchor anchor, java.lang.Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    public final void updateParentNode(java.lang.Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void set(java.lang.Object value) {
        int i = this.currentSlot;
        if (i <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i - 1)] = value;
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final java.lang.Object set(int index, java.lang.Object value) {
        return set(this.currentGroup, index, value);
    }

    public final java.lang.Object set(int group, int index, java.lang.Object value) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i = slotIndex + index;
        if (!(i >= slotIndex && i < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError(("Write to an invalid slot index " + index + " for group " + group).toString());
            throw new kotlin.KotlinNothingValueException();
        }
        int dataIndexToDataAddress = dataIndexToDataAddress(i);
        java.lang.Object[] objArr = this.slots;
        java.lang.Object obj = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = value;
        return obj;
    }

    public final java.lang.Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        java.lang.Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final java.lang.Object slot(androidx.compose.runtime.Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final java.lang.Object slot(int groupIndex, int index) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i = index + slotIndex;
        if (slotIndex > i || i >= dataIndex) {
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i)];
    }

    public final void advanceBy(int amount) {
        if (amount >= 0) {
            if (this.insertCount > 0) {
                throw new java.lang.IllegalStateException("Cannot call seek() while inserting".toString());
            }
            if (amount == 0) {
                return;
            }
            int i = this.currentGroup + amount;
            if (!(i >= this.parent && i <= this.currentGroupEnd)) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new kotlin.KotlinNothingValueException();
            }
            this.currentGroup = i;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i));
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void seek(androidx.compose.runtime.Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        int i = this.insertCount;
        if (i <= 0) {
            throw new java.lang.IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (this.nodeCountStack.getTos() == this.startStack.getTos()) {
                restoreCurrentGroupEnd();
            } else {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new kotlin.KotlinNothingValueException();
            }
        }
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            startGroup(0, androidx.compose.runtime.Composer.INSTANCE.getEmpty(), false, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final void startGroup(int key) {
        startGroup(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty(), false, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int key, java.lang.Object dataKey) {
        startGroup(key, dataKey, false, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, java.lang.Object objectKey) {
        startGroup(key, objectKey, true, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, java.lang.Object objectKey, java.lang.Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void startData(int key, java.lang.Object objectKey, java.lang.Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startData(int key, java.lang.Object aux) {
        startGroup(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty(), false, aux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int key, java.lang.Object objectKey, boolean isNode, java.lang.Object aux) {
        int nodeCount;
        int groupSize;
        int i;
        androidx.compose.runtime.GroupSourceInformation sourceInformationOf;
        int i2 = this.parent;
        boolean z = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (z) {
            insertGroups(1);
            int i3 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i3);
            int i4 = objectKey != androidx.compose.runtime.Composer.INSTANCE.getEmpty() ? 1 : 0;
            int i5 = (isNode || aux == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) ? 0 : 1;
            androidx.compose.runtime.SlotTableKt.initGroup(this.groups, groupIndexToAddress, key, isNode, i4, i5, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i6 = (isNode ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                insertSlots(i6, i3);
                java.lang.Object[] objArr = this.slots;
                int i7 = this.currentSlot;
                if (isNode) {
                    objArr[i7] = aux;
                    i7++;
                }
                if (i4 != 0) {
                    objArr[i7] = objectKey;
                    i7++;
                }
                if (i5 != 0) {
                    objArr[i7] = aux;
                    i7++;
                }
                this.currentSlot = i7;
            }
            this.nodeCount = 0;
            i = i3 + 1;
            this.parent = i3;
            this.currentGroup = i;
            if (i2 >= 0 && (sourceInformationOf = sourceInformationOf(i2)) != null) {
                sourceInformationOf.reportGroup(this, i3);
            }
        } else {
            this.startStack.push(i2);
            saveCurrentGroupEnd();
            int i8 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i8);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(aux, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i8;
            this.currentGroup = i8 + 1;
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i = i8 + groupSize;
        }
        this.currentGroupEnd = i;
    }

    public final int endGroup() {
        boolean isNode;
        int groupSize;
        int nodeCount;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            androidx.compose.runtime.SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
            androidx.compose.runtime.SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (isNode ? 1 : i4);
            this.parent = parent(this.groups, i3);
        } else {
            if ((i != i2 ? 0 : 1) != 0) {
                groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                androidx.compose.runtime.SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
                androidx.compose.runtime.SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
                int pop = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = pop;
                int parent = parent(this.groups, i3);
                int pop2 = this.nodeCountStack.pop();
                this.nodeCount = pop2;
                if (parent == pop) {
                    this.nodeCount = pop2 + (isNode ? 0 : i4 - nodeCount);
                } else {
                    int i6 = i5 - groupSize;
                    int i7 = isNode ? 0 : i4 - nodeCount;
                    if (i6 != 0 || i7 != 0) {
                        while (parent != 0 && parent != pop && (i7 != 0 || i6 != 0)) {
                            int groupIndexToAddress2 = groupIndexToAddress(parent);
                            if (i6 != 0) {
                                groupSize2 = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                                androidx.compose.runtime.SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i6);
                            }
                            if (i7 != 0) {
                                int[] iArr = this.groups;
                                nodeCount2 = androidx.compose.runtime.SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                                androidx.compose.runtime.SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i7);
                            }
                            isNode2 = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                            if (isNode2) {
                                i7 = 0;
                            }
                            parent = parent(this.groups, parent);
                        }
                    }
                    this.nodeCount += i7;
                }
            } else {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new kotlin.KotlinNothingValueException();
            }
        }
        return i4;
    }

    public final void ensureStarted(int index) {
        if (this.insertCount <= 0) {
            int i = this.parent;
            if (i != index) {
                if (!(index >= i && index < this.currentGroupEnd)) {
                    androidx.compose.runtime.ComposerKt.composeRuntimeError(("Started group at " + index + " must be a subgroup of the group at " + i).toString());
                    throw new kotlin.KotlinNothingValueException();
                }
                int i2 = this.currentGroup;
                int i3 = this.currentSlot;
                int i4 = this.currentSlotEnd;
                this.currentGroup = index;
                startGroup();
                this.currentGroup = i2;
                this.currentSlot = i3;
                this.currentSlotEnd = i4;
                return;
            }
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void ensureStarted(androidx.compose.runtime.Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i2 = i + groupSize;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return 1;
        }
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        return nodeCount;
    }

    public final boolean removeGroup() {
        androidx.compose.runtime.Anchor tryAnchor$runtime_release;
        if (this.insertCount == 0) {
            int i = this.currentGroup;
            int i2 = this.currentSlot;
            int skipGroup = skipGroup();
            androidx.compose.runtime.GroupSourceInformation sourceInformationOf = sourceInformationOf(this.parent);
            if (sourceInformationOf != null && (tryAnchor$runtime_release = tryAnchor$runtime_release(i)) != null) {
                sourceInformationOf.removeAnchor(tryAnchor$runtime_release);
            }
            androidx.compose.runtime.PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i, this.currentGroup - i);
            removeSlots(i2, this.currentSlot - i2, i - 1);
            this.currentGroup = i;
            this.currentSlot = i2;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.util.Iterator<java.lang.Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new androidx.compose.runtime.SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    public final void forEachData(int group, kotlin.jvm.functions.Function2<? super java.lang.Integer, java.lang.Object, kotlin.Unit> block) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(group + 1));
        for (int i = slotIndex; i < dataIndex; i++) {
            block.invoke(java.lang.Integer.valueOf(i - slotIndex), this.slots[dataIndexToDataAddress(i)]);
        }
    }

    public final void moveGroup(int offset) {
        int groupSize;
        int groupSize2;
        if (!(this.insertCount == 0)) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        if (!(offset >= 0)) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        if (offset == 0) {
            return;
        }
        int i = this.currentGroup;
        int i2 = this.parent;
        int i3 = this.currentGroupEnd;
        int i4 = i;
        for (int i5 = offset; i5 > 0; i5--) {
            groupSize2 = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4));
            i4 += groupSize2;
            if (!(i4 <= i3)) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                throw new kotlin.KotlinNothingValueException();
            }
        }
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4));
        int i6 = this.currentSlot;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i4));
        int i7 = i4 + groupSize;
        int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i7));
        int i8 = dataIndex2 - dataIndex;
        insertSlots(i8, java.lang.Math.max(this.currentGroup - 1, 0));
        insertGroups(groupSize);
        int[] iArr = this.groups;
        int groupIndexToAddress = groupIndexToAddress(i7) * 5;
        kotlin.collections.ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
        if (i8 > 0) {
            java.lang.Object[] objArr = this.slots;
            kotlin.collections.ArraysKt.copyInto(objArr, objArr, i6, dataIndexToDataAddress(dataIndex + i8), dataIndexToDataAddress(dataIndex2 + i8));
        }
        int i9 = dataIndex + i8;
        int i10 = i9 - i6;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapLen;
        int length = this.slots.length;
        int i13 = this.slotsGapOwner;
        int i14 = i + groupSize;
        int i15 = i;
        while (i15 < i14) {
            int groupIndexToAddress2 = groupIndexToAddress(i15);
            int i16 = i11;
            int i17 = i10;
            updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i10, i13 < groupIndexToAddress2 ? 0 : i16, i12, length));
            i15++;
            i11 = i16;
            i10 = i17;
        }
        moveAnchors(i7, i, groupSize);
        if (!removeGroups(i7, groupSize)) {
            fixParentAnchorsFor(i2, this.currentGroupEnd, i);
            if (i8 > 0) {
                removeSlots(i9, i8, i7 - 1);
                return;
            }
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    /* compiled from: SlotTable.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ java.util.List moveGroup$default(androidx.compose.runtime.SlotWriter.Companion companion, androidx.compose.runtime.SlotWriter slotWriter, int i, androidx.compose.runtime.SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, java.lang.Object obj) {
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, (i2 & 32) != 0 ? true : z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.util.List<androidx.compose.runtime.Anchor> moveGroup(androidx.compose.runtime.SlotWriter fromWriter, int fromIndex, androidx.compose.runtime.SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean z;
            int locationOf;
            int locationOf2;
            java.util.ArrayList emptyList;
            boolean isNode;
            int groupSize;
            java.util.HashMap hashMap;
            int locationOf3;
            int i;
            int i2;
            int i3;
            int parentAnchor;
            int groupSize2 = fromWriter.groupSize(fromIndex);
            int i4 = fromIndex + groupSize2;
            int dataIndex = fromWriter.dataIndex(fromIndex);
            int dataIndex2 = fromWriter.dataIndex(i4);
            int i5 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(groupSize2);
            toWriter.insertSlots(i5, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i4) {
                fromWriter.moveGroupGapTo(i4);
            }
            if (fromWriter.slotsGapStart < dataIndex2) {
                fromWriter.moveSlotGapTo(dataIndex2, i4);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            kotlin.collections.ArraysKt.copyInto(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i4 * 5);
            java.lang.Object[] objArr = toWriter.slots;
            int i6 = toWriter.currentSlot;
            kotlin.collections.ArraysKt.copyInto(fromWriter.slots, objArr, i6, dataIndex, dataIndex2);
            int parent = toWriter.getParent();
            androidx.compose.runtime.SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i7 = currentGroup - fromIndex;
            int i8 = currentGroup + groupSize2;
            int dataIndex3 = i6 - toWriter.dataIndex(iArr, currentGroup);
            int i9 = toWriter.slotsGapOwner;
            int i10 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i11 = i9;
            int i12 = currentGroup;
            while (true) {
                if (i12 >= i8) {
                    break;
                }
                if (i12 != currentGroup) {
                    parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(iArr, i12);
                    i = i8;
                    androidx.compose.runtime.SlotTableKt.updateParentAnchor(iArr, i12, parentAnchor + i7);
                } else {
                    i = i8;
                }
                int dataIndex4 = toWriter.dataIndex(iArr, i12) + dataIndex3;
                if (i11 < i12) {
                    i2 = dataIndex3;
                    i3 = 0;
                } else {
                    i2 = dataIndex3;
                    i3 = toWriter.slotsGapStart;
                }
                androidx.compose.runtime.SlotTableKt.updateDataAnchor(iArr, i12, toWriter.dataIndexToDataAnchor(dataIndex4, i3, i10, length));
                if (i12 == i11) {
                    i11++;
                }
                i12++;
                dataIndex3 = i2;
                i8 = i;
            }
            int i13 = i8;
            toWriter.slotsGapOwner = i11;
            locationOf = androidx.compose.runtime.SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            locationOf2 = androidx.compose.runtime.SlotTableKt.locationOf(fromWriter.anchors, i4, fromWriter.getSize$runtime_release());
            if (locationOf < locationOf2) {
                java.util.ArrayList arrayList = fromWriter.anchors;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(locationOf2 - locationOf);
                for (int i14 = locationOf; i14 < locationOf2; i14++) {
                    androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) arrayList.get(i14);
                    anchor.setLocation$runtime_release(anchor.getLocation() + i7);
                    arrayList2.add(anchor);
                }
                locationOf3 = androidx.compose.runtime.SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release());
                toWriter.anchors.addAll(locationOf3, arrayList2);
                arrayList.subList(locationOf, locationOf2).clear();
                emptyList = arrayList2;
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            if ((!emptyList.isEmpty()) && (hashMap = fromWriter.sourceInformationMap) != null) {
                java.util.HashMap hashMap2 = toWriter.sourceInformationMap;
                int size = emptyList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    androidx.compose.runtime.Anchor anchor2 = emptyList.get(i15);
                    androidx.compose.runtime.GroupSourceInformation groupSourceInformation = (androidx.compose.runtime.GroupSourceInformation) hashMap.get(anchor2);
                    if (groupSourceInformation != null) {
                        hashMap.remove(anchor2);
                        if (hashMap2 == null) {
                            androidx.compose.runtime.SlotWriter.Companion companion = androidx.compose.runtime.SlotWriter.INSTANCE;
                            hashMap2 = new java.util.HashMap();
                            toWriter.sourceInformationMap = hashMap2;
                        }
                        hashMap2.put(anchor2, groupSourceInformation);
                    }
                }
                if (hashMap.isEmpty()) {
                    fromWriter.sourceInformationMap = null;
                }
            }
            int parent2 = toWriter.getParent();
            androidx.compose.runtime.GroupSourceInformation sourceInformationOf = toWriter.sourceInformationOf(parent);
            if (sourceInformationOf != null) {
                int i16 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i17 = -1;
                while (i16 < currentGroup2) {
                    groupSize = androidx.compose.runtime.SlotTableKt.groupSize(toWriter.groups, i16);
                    int i18 = groupSize + i16;
                    i17 = i16;
                    i16 = i18;
                }
                sourceInformationOf.addGroupAfter(toWriter, i17, currentGroup2);
            }
            int parent3 = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (!updateFromCursor) {
                    z = fromWriter.removeGroups(fromIndex, groupSize2);
                    fromWriter.removeSlots(dataIndex, i5, fromIndex - 1);
                    if (!(!z)) {
                        int i19 = toWriter.nodeCount;
                        isNode = androidx.compose.runtime.SlotTableKt.isNode(iArr, currentGroup);
                        toWriter.nodeCount = i19 + (isNode ? 1 : androidx.compose.runtime.SlotTableKt.nodeCount(iArr, currentGroup));
                        if (updateToCursor) {
                            toWriter.currentGroup = i13;
                            toWriter.currentSlot = i6 + i5;
                        }
                        if (containsAnyGroupMarks) {
                            toWriter.updateContainsMark(parent);
                        }
                        return emptyList;
                    }
                    androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                    throw new kotlin.KotlinNothingValueException();
                }
                z = parent3 >= 0;
                if (z) {
                    fromWriter.startGroup();
                    fromWriter.advanceBy(parent3 - fromWriter.getCurrentGroup());
                    fromWriter.startGroup();
                }
                fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                boolean removeGroup = fromWriter.removeGroup();
                if (z) {
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                }
                z = removeGroup;
            }
            if (!(!z)) {
            }
        }
    }

    public final java.util.List<androidx.compose.runtime.Anchor> moveTo(androidx.compose.runtime.Anchor anchor, int offset, androidx.compose.runtime.SlotWriter writer) {
        int groupSize;
        boolean isNode;
        int nodeCount;
        androidx.compose.runtime.ComposerKt.runtimeCheck(writer.insertCount > 0);
        androidx.compose.runtime.ComposerKt.runtimeCheck(this.insertCount == 0);
        androidx.compose.runtime.ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + offset;
        int i = this.currentGroup;
        androidx.compose.runtime.ComposerKt.runtimeCheck(i <= anchorIndex && anchorIndex < this.currentGroupEnd);
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        int nodeCount2 = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        java.util.List<androidx.compose.runtime.Anchor> moveGroup$default = androidx.compose.runtime.SlotWriter.Companion.moveGroup$default(INSTANCE, this, anchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z = nodeCount2 > 0;
        while (parent >= i) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(iArr, groupIndexToAddress);
            androidx.compose.runtime.SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z) {
                isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress);
                if (isNode) {
                    z = false;
                } else {
                    int[] iArr2 = this.groups;
                    nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(iArr2, groupIndexToAddress);
                    androidx.compose.runtime.SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, nodeCount - nodeCount2);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            androidx.compose.runtime.ComposerKt.runtimeCheck(this.nodeCount >= nodeCount2);
            this.nodeCount -= nodeCount2;
        }
        return moveGroup$default;
    }

    public static /* synthetic */ java.util.List moveFrom$default(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.SlotTable slotTable, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    public final java.util.List<androidx.compose.runtime.Anchor> moveFrom(androidx.compose.runtime.SlotTable table, int index, boolean removeSourceGroup) {
        int groupSize;
        androidx.compose.runtime.ComposerKt.runtimeCheck(this.insertCount > 0);
        if (index == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(table.getGroups(), index);
            if (groupSize == table.getGroupsSize()) {
                int[] iArr = this.groups;
                java.lang.Object[] objArr = this.slots;
                java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
                java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                java.lang.Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap$runtime_release = table.getSourceInformationMap$runtime_release();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime_release;
                table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, hashMap);
                return this.anchors;
            }
        }
        androidx.compose.runtime.SlotWriter openWriter = table.openWriter();
        try {
            return INSTANCE.moveGroup(openWriter, index, this, true, true, removeSourceGroup);
        } finally {
            openWriter.close();
        }
    }

    public final void bashCurrentGroup() {
        androidx.compose.runtime.SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (groupSize(r12.currentGroup + r13) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int offset, androidx.compose.runtime.SlotTable table, int index) {
        boolean z = this.insertCount <= 0;
        androidx.compose.runtime.ComposerKt.runtimeCheck(z);
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        androidx.compose.runtime.SlotWriter openWriter = table.openWriter();
        try {
            java.util.List<androidx.compose.runtime.Anchor> moveGroup$default = androidx.compose.runtime.SlotWriter.Companion.moveGroup$default(INSTANCE, openWriter, index, this, false, true, false, 32, null);
            openWriter.close();
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.currentSlot = i2;
            this.currentSlotEnd = i3;
            return moveGroup$default;
        } catch (java.lang.Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    public static /* synthetic */ androidx.compose.runtime.Anchor anchor$default(androidx.compose.runtime.SlotWriter slotWriter, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    public final androidx.compose.runtime.Anchor anchor(int index) {
        java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
        int search = androidx.compose.runtime.SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (search < 0) {
            if (index > this.groupGapStart) {
                index = -(getSize$runtime_release() - index);
            }
            androidx.compose.runtime.Anchor anchor = new androidx.compose.runtime.Anchor(index);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return arrayList.get(search);
    }

    public static /* synthetic */ void markGroup$default(androidx.compose.runtime.SlotWriter slotWriter, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int group) {
        boolean hasMark;
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(group);
        hasMark = androidx.compose.runtime.SlotTableKt.hasMark(this.groups, groupIndexToAddress);
        if (hasMark) {
            return;
        }
        androidx.compose.runtime.SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
        containsMark = androidx.compose.runtime.SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark) {
            return;
        }
        updateContainsMark(parent(group));
    }

    private final boolean containsGroupMark(int group) {
        boolean containsMark;
        if (group >= 0) {
            containsMark = androidx.compose.runtime.SlotTableKt.containsMark(this.groups, groupIndexToAddress(group));
            if (containsMark) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        boolean containsAnyMark;
        if (group >= 0) {
            containsAnyMark = androidx.compose.runtime.SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(group));
            if (containsAnyMark) {
                return true;
            }
        }
        return false;
    }

    private final void recalculateMarks() {
        androidx.compose.runtime.PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            androidx.compose.runtime.PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new androidx.compose.runtime.PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(group);
        }
    }

    private final void updateContainsMarkNow(int group, androidx.compose.runtime.PrioritySet set) {
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(group);
        boolean childContainsAnyMarks = childContainsAnyMarks(group);
        containsMark = androidx.compose.runtime.SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark != childContainsAnyMarks) {
            androidx.compose.runtime.SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(group);
            if (parent >= 0) {
                set.add(parent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int group) {
        boolean containsAnyMark;
        int i = group + 1;
        int groupSize = group + groupSize(group);
        while (i < groupSize) {
            containsAnyMark = androidx.compose.runtime.SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i));
            if (containsAnyMark) {
                return true;
            }
            i += groupSize(i);
        }
        return false;
    }

    public final int anchorIndex(androidx.compose.runtime.Anchor anchor) {
        int location = anchor.getLocation();
        return location < 0 ? location + getSize$runtime_release() : location;
    }

    public java.lang.String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            androidx.compose.runtime.SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(firstChild), parentIndexToAnchor);
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild));
            int i = groupSize + firstChild;
            fixParentAnchorsFor(firstChild, i, firstChild + 1);
            firstChild = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int parentAnchor;
        int i = this.groupGapLen;
        int i2 = this.groupGapStart;
        if (i2 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i2, index);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i3 = index * 5;
                int i4 = i * 5;
                int i5 = i2 * 5;
                if (index < i2) {
                    kotlin.collections.ArraysKt.copyInto(iArr, iArr, i4 + i3, i3, i5);
                } else {
                    kotlin.collections.ArraysKt.copyInto(iArr, iArr, i5, i5 + i4, i3 + i4);
                }
            }
            if (index < i2) {
                i2 = index + i;
            }
            int capacity = getCapacity();
            androidx.compose.runtime.ComposerKt.runtimeCheck(i2 < capacity);
            while (i2 < capacity) {
                parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, i2);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), index);
                if (parentIndexToAnchor != parentAnchor) {
                    androidx.compose.runtime.SlotTableKt.updateParentAnchor(this.groups, i2, parentIndexToAnchor);
                }
                i2++;
                if (i2 == index) {
                    i2 += i;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int dataAnchor;
        int dataAnchor2;
        int i = this.slotsGapLen;
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapOwner;
        if (i2 != index) {
            java.lang.Object[] objArr = this.slots;
            if (index < i2) {
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, index + i, index, i2);
            } else {
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, i2, i2 + i, index + i);
            }
        }
        int min = java.lang.Math.min(group + 1, getSize$runtime_release());
        if (i3 != min) {
            int length = this.slots.length - i;
            if (min < i3) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i3);
                int i4 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (dataAnchor2 >= 0) {
                        androidx.compose.runtime.SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i4) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i3);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (dataAnchor < 0) {
                        androidx.compose.runtime.SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = index;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        kotlin.collections.ArraysKt.fill(this.slots, (java.lang.Object) null, i, this.slotsGapLen + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < size) {
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i4 + size), 32);
                int[] iArr2 = new int[max * 5];
                int i5 = max - i4;
                kotlin.collections.ArraysKt.copyInto(iArr, iArr2, 0, 0, i2 * 5);
                kotlin.collections.ArraysKt.copyInto(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + size;
            }
            int i7 = i2 + size;
            this.groupGapStart = i7;
            this.groupGapLen = i3 - size;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i4 > 0 ? dataIndex(i + size) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i8 = i2; i8 < i7; i8++) {
                androidx.compose.runtime.SlotTableKt.updateDataAnchor(this.groups, i8, dataIndexToDataAnchor);
            }
            int i9 = this.slotsGapOwner;
            if (i9 >= i2) {
                this.slotsGapOwner = i9 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < size) {
                java.lang.Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i3 + size), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[max];
                for (int i4 = 0; i4 < max; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = max - i3;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr2, 0, 0, i);
                kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i + i5, i2 + i, length);
                this.slots = objArr2;
                i2 = i5;
            }
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i2 - size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            r0 = arrayList.isEmpty() ^ true ? removeAnchors(start, len, this.sourceInformationMap) : false;
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i = this.slotsGapOwner;
            if (i > start) {
                this.slotsGapOwner = java.lang.Math.max(start, i - len);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.groupGapStart) {
                this.currentGroupEnd = i2 - len;
            }
            int i3 = this.parent;
            if (containsGroupMark(i3)) {
                updateContainsMark(i3);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.runtime.GroupSourceInformation sourceInformationOf(int group) {
        androidx.compose.runtime.Anchor tryAnchor$runtime_release;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime_release = tryAnchor$runtime_release(group)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime_release);
    }

    public final androidx.compose.runtime.Anchor tryAnchor$runtime_release(int group) {
        androidx.compose.runtime.Anchor find;
        if (group < 0 || group >= getSize$runtime_release()) {
            return null;
        }
        find = androidx.compose.runtime.SlotTableKt.find(this.anchors, group, getSize$runtime_release());
        return find;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i = this.slotsGapLen;
            int i2 = start + len;
            moveSlotGapTo(i2, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i + len;
            kotlin.collections.ArraysKt.fill(this.slots, (java.lang.Object) null, start, i2);
            int i3 = this.currentSlotEnd;
            if (i3 >= start) {
                this.currentSlotEnd = i3 - len;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateNodeOfGroup(int index, java.lang.Object value) {
        boolean z;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if (groupIndexToAddress < iArr.length) {
            isNode = androidx.compose.runtime.SlotTableKt.isNode(iArr, groupIndexToAddress);
            if (isNode) {
                z = true;
                if (z) {
                    androidx.compose.runtime.ComposerKt.composeRuntimeError(("Updating the node of a group at " + index + " that was not created with as a node group").toString());
                    throw new kotlin.KotlinNothingValueException();
                }
                this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = value;
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        int locationOf;
        androidx.compose.runtime.Anchor anchor;
        int location;
        int locationOf2;
        androidx.compose.runtime.Anchor anchor2;
        int location2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart < newGapStart) {
            for (locationOf2 = androidx.compose.runtime.SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); locationOf2 < this.anchors.size() && (location2 = (anchor2 = this.anchors.get(locationOf2)).getLocation()) < 0 && (i = location2 + capacity) < newGapStart; locationOf2++) {
                anchor2.setLocation$runtime_release(i);
            }
            return;
        }
        for (locationOf = androidx.compose.runtime.SlotTableKt.locationOf(this.anchors, newGapStart, capacity); locationOf < this.anchors.size() && (location = (anchor = this.anchors.get(locationOf)).getLocation()) >= 0; locationOf++) {
            anchor.setLocation$runtime_release(-(capacity - location));
        }
    }

    private final boolean removeAnchors(int gapStart, int size, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap) {
        int locationOf;
        int i = size + gapStart;
        locationOf = androidx.compose.runtime.SlotTableKt.locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i2 = locationOf + 1;
        int i3 = 0;
        while (locationOf >= 0) {
            androidx.compose.runtime.Anchor anchor = this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < gapStart) {
                break;
            }
            if (anchorIndex < i) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i3 == 0) {
                    i3 = locationOf + 1;
                }
                i2 = locationOf;
            }
            locationOf--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        int locationOf;
        int locationOf2;
        androidx.compose.runtime.Anchor anchor;
        int anchorIndex;
        int i = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        locationOf = androidx.compose.runtime.SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime_release);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = this.anchors.get(locationOf)))) >= originalLocation && anchorIndex < i) {
                arrayList.add(anchor);
                this.anchors.remove(locationOf);
            }
        }
        int i2 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.runtime.Anchor anchor2 = (androidx.compose.runtime.Anchor) arrayList.get(i3);
            int anchorIndex2 = anchorIndex(anchor2) + i2;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = androidx.compose.runtime.SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor2);
        }
    }

    public final java.lang.String groupsAsString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final void groupAsString(java.lang.StringBuilder sb, int i) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (groupIndexToAddress != i) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        boolean groupAsString$isStarted = groupAsString$isStarted(this, i);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchorToIndex(parentAnchor));
        sb.append(": key=");
        key = androidx.compose.runtime.SlotTableKt.key(this.groups, groupIndexToAddress);
        sb.append(key);
        sb.append(", nodes=");
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb.append(nodeCount);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb.append(dataAnchor);
        sb.append(", parentAnchor=");
        parentAnchor2 = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchor2);
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]);
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress + 1);
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i2 = slotIndex; i2 < dataIndex; i2++) {
                if (i2 != slotIndex) {
                    sb.append(", ");
                }
                sb.append(java.lang.String.valueOf(this.slots[dataIndexToDataAddress(i2)]));
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(androidx.compose.runtime.SlotWriter slotWriter, int i) {
        return i < slotWriter.currentGroup && (i == slotWriter.parent || slotWriter.startStack.indexOf(i) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i)));
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i2);
            dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (dataIndex < i3) {
                throw new java.lang.IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + dataIndex).toString());
            }
            if (dataIndex > length) {
                throw new java.lang.IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i2).toString());
            }
            if (dataAnchor < 0 && !z) {
                if (i != i2) {
                    throw new java.lang.IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                }
                z = true;
            }
            i2++;
            i3 = dataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        int parentAnchor2;
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        for (int i3 = 0; i3 < i; i3++) {
            parentAnchor2 = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, i3);
            if (parentAnchor2 <= -2) {
                throw new java.lang.IllegalStateException(("Expected a start relative anchor at " + i3).toString());
            }
        }
        for (int i4 = i2 + i; i4 < capacity; i4++) {
            parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, i4);
            if (parentAnchorToIndex(parentAnchor) < i) {
                if (parentAnchor <= -2) {
                    throw new java.lang.IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                }
            } else if (parentAnchor > -2) {
                throw new java.lang.IllegalStateException(("Expected an end relative anchor at " + i4).toString());
            }
        }
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    private final int parent(int[] iArr, int i) {
        int parentAnchor;
        parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i));
        return parentAnchorToIndex(parentAnchor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        int dataAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(iArr, i);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int slotIndex(int[] iArr, int i) {
        int slotAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(iArr, i);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        androidx.compose.runtime.SlotTableKt.updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i);
        groupInfo = androidx.compose.runtime.SlotTableKt.groupInfo(iArr, i);
        countOneBits = androidx.compose.runtime.SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final java.util.List<java.lang.Integer> dataIndexes(int[] iArr) {
        java.util.List dataAnchors$default = androidx.compose.runtime.SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.slice(dataAnchors$default, kotlin.ranges.RangesKt.until(0, this.groupGapStart)), (java.lang.Iterable) kotlin.collections.CollectionsKt.slice(dataAnchors$default, kotlin.ranges.RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        java.util.ArrayList arrayList = new java.util.ArrayList(plus.size());
        int size = plus.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(java.lang.Integer.valueOf(dataAnchorToDataIndex(((java.lang.Number) plus.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final java.util.List<java.lang.Integer> keys() {
        java.util.List keys$default = androidx.compose.runtime.SlotTableKt.keys$default(this.groups, 0, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = keys$default.get(i);
            ((java.lang.Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : getSize$runtime_release() + index + 2;
    }
}
